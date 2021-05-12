import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Compiler {
    private final HashSet<String> variablesList = new HashSet<>();

    public static void main(String[] args) throws IOException {

        String encodingName = "UTF-8";

        try {
            java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid?
        } catch (Exception e) {
            System.out.println("Invalid encoding '" + encodingName + "'");
            return;
        }

        LexerAnalyser scanner = null;
        try {
            java.io.FileInputStream stream = new java.io.FileInputStream(args[0]);
            java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
            scanner = new LexerAnalyser(reader);
        }
        catch (java.io.FileNotFoundException e) {
            System.err.println("File not found : \""+args[0]+"\"");
        }
        catch (java.io.IOException e) {
            System.err.println("IO error scanning file \""+args[0]+"\"");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
            System.err.println("Unexpected exception:");
            e.printStackTrace();
        }

        SyntaxAnalyser syntaxAnalyser = new SyntaxAnalyser(scanner);
        syntaxAnalyser.parse();
    }

    public Tree astNode(String parent, Tree ... children) {
        Tree parentNode = new Tree(parent);
        ArrayList<Tree> childrenNodes = new ArrayList<>(Arrays.asList(children));

        parentNode.setChildren(childrenNodes);

        if (parent.equals("ROOT")) {
            printTree(parentNode,0, "");
            printAssemblerTree(parentNode);
        }

        return parentNode;
    }

    public Tree identifierReference(String name) {
        if (!variablesList.contains(name)) {
            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println("ERROR: Identifier '" + name + "' wasn't declared");
            System.out.println("---------------------------------------");
            System.exit(0);
        }
        Tree identifier = new Tree(name);
        identifier.setType("Identifier");
        return identifier;
    }

    public Tree constant(String value) {
        Tree node = new Tree(value);
        node.setType("Const");
        return node;
    }

    public Tree addVariable(String identifier, Tree variables) {
        Tree varNode = new Tree("Variables list");
        ArrayList<Tree> children = new ArrayList<>();
        children.add(new Tree(identifier));
        children.get(0).setType("Identifier");
        if (variables != null) children.add(variables);
        varNode.setChildren(children);
        variablesList.add(identifier);
        return varNode;
    }

    public Tree newAppropriation(String identifier, Tree exp) {
        Tree node = new Tree("Operator");
        Tree appropriation = new Tree("=");
        ArrayList<Tree> children = new ArrayList<>();
        ArrayList<Tree> apprChildren = new ArrayList<>();
        children.add(identifierReference(identifier));
        children.add(exp);
        appropriation.setChildren(children);
        apprChildren.add(appropriation);
        node.setChildren(apprChildren);
        return node;
    }

    private void printTree(Tree node, int offset, String prefix) {
        if (prefix.length() > 0) {
            System.out.print(prefix.substring(0, prefix.length() - 2));
        }
        if (offset >= 7) {
            System.out.print(" |-------");
        }

        System.out.println("(" + node.getName() + ")" + ((node.getType() != null) ? (" [" + node.getType() + "]") : ""));
        if (node.getChildren() != null) {
            for (int i = 0; i < node.getChildren().size(); i++) {
                if (i == node.getChildren().size() - 1) {
                    printTree(node.getChildren().get(i), offset + 5, prefix.concat("       "));
                } else {
                    printTree(node.getChildren().get(i), offset + 5, prefix.concat("      |"));
                }
            }
        }
    }

    private int tmpCnt = 0;
    private String generateTmpName() {
        return "tmp" + tmpCnt++;
    }

    private int labelCnt = 0;
    private String generateLabelName() {
        return "L" + labelCnt++;
    }

    private void printAssemblerTree(Tree root) {
        List<Tree> children = root.getChildren();

        Tree operators;
        if (children != null && children.size() > 1) {
            operators = children.get(1);

            children = operators.getChildren();

            if (children != null) {
                operators = children.get(0);
            } else {
                System.out.println("// Empty program!");
                return;
            }
        } else {
            System.out.println("// Empty program!");
            return;
        }

        printAssemblerOperators(operators);
    }

    private void printAssemblerOperators(Tree node) {

        switch (node.getName()) {
            case "Operators":
                for (Tree child : node.getChildren()) {
                    printAssemblerOperators(child);
                }
                break;
            case "Operator":
                printAssemblerAppropriateOperator(node.getChildren().get(0));
                break;
            case "Loop":
                printAssemblerLoop(node);
                break;
            default:
                System.out.println("SOME ERROR");
                break;
        }
    }

    private void printAssemblerAppropriateOperator(Tree node) {
        List<Tree> children = node.getChildren();
        String x = children.get(0).getName();

        switch (children.get(1).getType()) {
            case "Const":
            case "Identifier":
                String y = children.get(1).getName();
                System.out.printf("%s %s %s%n", x, node.getName(), y);
                break;
            case "Expression":
                String tmpName = generateTmpName();
                printAssemblerExpression(children.get(1), tmpName);
                System.out.printf("%s %s %s%n", x, node.getName(), tmpName);
                break;
            default:
                System.out.println("SOME SHIT!");
                break;
        }
    }

    private void printAssemblerExpression(Tree node, String curName) {
        List<Tree> children = node.getChildren();

        String y;
        switch (children.get(0).getType()) {
            case "Expression":
                y = generateTmpName();
                printAssemblerExpression(children.get(0), y);
                break;
            case "Const":
            case "Identifier":
                y = children.get(0).getName();
                break;
            default:
                System.out.println("SOME SHIT!");
                y = "ERROR";
                break;
        }

        switch (children.get(1).getType()) {
            case "Binary operator":
                String z;
                switch (children.get(2).getType()) {
                    case "Expression":
                        z = generateTmpName();
                        printAssemblerExpression(children.get(2), z);
                        break;
                    case "Const":
                    case "Identifier":
                        z = children.get(2).getName();
                        break;
                    default:
                        System.out.println("SOME SHIT!");
                        z = "ERROR";
                        break;
                }
                System.out.printf("%s = %s %s %s%n", curName, y, children.get(1).getName(), z);
                break;
            case "Unary operator":
                System.out.printf("%s = %s %s%n", curName, children.get(1).getName(), y);
                break;
            default:
                System.out.println("SOME SHIT!");
                break;
        }
    }

    private void printAssemblerLoop(Tree node) {
        String loopStartLabel = generateLabelName();
        String loopEndLabel = generateLabelName();

        System.out.println(loopStartLabel + ":");

        String exp = generateTmpName();
        printAssemblerExpression(node.getChildren().get(0), exp);

        System.out.printf("iffalse %s goto %s\n", exp, loopEndLabel);

        printAssemblerOperators(node.getChildren().get(1));

        System.out.printf("goto %s\n", loopStartLabel);
        System.out.println(loopEndLabel + ":");
    }
}