import java.util.List;

public class Tree {

    private String name;
    private String type;
    private List<Tree> children;

    public Tree(String name) {
        this.name = name;
        checkName();
        this.children = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tree> getChildren() {
        return children;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private void checkName() {
        switch (name) {
            case "+":
            case "-":
            case "*":
            case "/":
            case ">":
            case "<":
            case "==":
            case "&":
            case "|":
            case "^":
                type = "Binary operator";
                break;
            case "=":
                type = "Appropriation operator";
                break;
            case "Var":
                type = "Keyword";
                break;
            case "U":
                name = "-";
            case "not":
                type = "Unary operator";
                break;
            case "Expression":
                type = "Expression";
                break;
            default:
                type = null;
        }
    }
}
