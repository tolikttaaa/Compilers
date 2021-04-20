import java.lang.String;
import java.util.ArrayList;
%%

%class LexerAnalyser
%implements SyntaxAnalyser.Lexer
%standalone
%line
%column
%state unaryMinus, binaryMinus

%{
    private Object yylval;

    public Object getLVal() {
        return yylval;
    }

    public void yyerror(String message) {
        System.err.println();
        System.err.println("------------------------------------------------------");
        System.err.println("ERROR: Syntax error in line " + (yyline + 1) + ". Unexpected token: " + yytext());
        System.err.println("------------------------------------------------------");
    }

    final ArrayList<String> identifiersConstants = new ArrayList();

    private String getHex(String number) {
        return Integer.toString(Integer.parseInt(number), 16);
    }

    private boolean checkForKeyWords(String lexem, int line, int symbol) {
        String[] words = {"End", "Var", "Do", "Begin", "AND", "XOR", "WHILE", "OR", "not"};

        for (int i = 0; i < 8; i++) {
            if (words[i].toLowerCase().equals(lexem.toLowerCase())) {
                System.err.printf("Found unknown Lexem: '%s'. Didn't you mean '%s'? Line - %d, start symbol - %d\n", lexem, words[i], line, symbol);
                return true;
            }
        }

        return false;
    }
%}

Comment = [/][/].*
Keyword = "End" | "Var" | "DO" | "Begin"
Separator = [;,)]
AppropriationSymbol = "="
BinaryOperator = "+" | "*" | "/" | ">" | "<" | "==" | "AND" | "OR" | "XOR"
MinusSymbol = "-"
NotOperator = "not"
Constant = [0-9]+
Identifier = [a-zA-Z]+
Whitespaces = [ \t\n\r]
BracketStart = "("
LoopStart = "WHILE"

%%

{Comment} {
    yylval = new String(yytext());
}

{Keyword} {
    yylval = new String(yytext());
    switch (yytext()) {
        case "End" : return SyntaxAnalyser.Lexer.END_KEYWORD;
        case "Var" : return SyntaxAnalyser.Lexer.VAR_KEYWORD;
        case "DO" : return SyntaxAnalyser.Lexer.DO_KEYWORD;
        case "Begin" : return SyntaxAnalyser.Lexer.BEGIN_KEYWORD;
    }
}

{LoopStart} {
    yylval = new String(yytext());
    yybegin(unaryMinus);
    return SyntaxAnalyser.Lexer.LOOP_START;
}

{Separator} {
    yylval = new String(yytext());

    switch (yytext()) {
        case "," : return SyntaxAnalyser.Lexer.COMMA_SEPARATOR;
        case ")" : return SyntaxAnalyser.Lexer.END_BRACKET;
    }
}

{AppropriationSymbol} {
    yylval = new String(yytext());
    yybegin(unaryMinus);
    return SyntaxAnalyser.Lexer.APPROPRIATION_OPERATOR;
}

{BracketStart} {
    yylval = new String(yytext());
    yybegin(unaryMinus);
    return SyntaxAnalyser.Lexer.START_BRACKET;
}

{BinaryOperator} {
    yylval = new String(yytext());
    yybegin(unaryMinus);

    switch (yytext()) {
        case "+" : return SyntaxAnalyser.Lexer.PLUS;
        case "*" : return SyntaxAnalyser.Lexer.MULTIPLY;
        case "/" : return SyntaxAnalyser.Lexer.DIVIDE;
        case ">" : return SyntaxAnalyser.Lexer.GRATER_OPERATOR;
        case "<" : return SyntaxAnalyser.Lexer.LESS_OPERATOR;
        case "=" : return SyntaxAnalyser.Lexer.EQUALS_OPERATOR;
        case "AND" : return SyntaxAnalyser.Lexer.AND_OPERATOR;
        case "OR" : return SyntaxAnalyser.Lexer.OR_OPERATOR;
        case "XOR" : return SyntaxAnalyser.Lexer.XOR_OPERATOR;
    }
}

<unaryMinus> {
    {NotOperator} {
        yylval = new String(yytext());
        yybegin(unaryMinus);
        return SyntaxAnalyser.Lexer.NOT_OPERATOR;
    }

    {MinusSymbol} {
        yylval = new String(yytext());
        yybegin(unaryMinus);
        return SyntaxAnalyser.Lexer.UNARY_MINUS;
    }

    {BracketStart} {
        yylval = new String(yytext());
        yybegin(unaryMinus);
        return SyntaxAnalyser.Lexer.START_BRACKET;
    }

    {Constant} 	{
        yylval = new Integer(yytext());
        yybegin(binaryMinus);
        return SyntaxAnalyser.Lexer.CONSTANT;
    }

    {Identifier} {
        checkForKeyWords(yytext(), yyline+1, yycolumn);
        yylval = new String(yytext());
        yybegin(binaryMinus);
        return SyntaxAnalyser.Lexer.IDENTIFIER;
    }
}

{Constant}  {
    yylval = new Integer(yytext());
    yybegin(binaryMinus);
    return SyntaxAnalyser.Lexer.CONSTANT;
}

{Identifier} {
    checkForKeyWords(yytext(), yyline+1, yycolumn);
    yylval = new String(yytext());
    yybegin(binaryMinus);
    return SyntaxAnalyser.Lexer.IDENTIFIER;
}

<binaryMinus> {
    {MinusSymbol} {
        yylval = new String(yytext());
        return SyntaxAnalyser.Lexer.BINARY_MINUS;
    }
}

{Whitespaces} {}

. {
    System.out.println();
    System.out.println("------------------------------------------------------");
    System.out.printf("ERROR. Unexpected token: %s - line: %d, start symbol: %d\n", yytext(), yyline+1, yycolumn);
    System.out.println("------------------------------------------------------");
    System.exit(0);
}