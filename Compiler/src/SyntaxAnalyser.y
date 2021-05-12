  %language "Java"

  %define api.parser.class {SyntaxAnalyser}
  %define api.parser.public


  %token COMMENT
  %token END_KEYWORD VAR_KEYWORD DO_KEYWORD BEGIN_KEYWORD
  %token LOOP_START
  %token COMMA_SEPARATOR END_BRACKET
  %token APPROPRIATION_OPERATOR
  %token PLUS MULTIPLY DIVIDE GRATER_OPERATOR LESS_OPERATOR EQUALS_OPERATOR AND_OPERATOR OR_OPERATOR XOR_OPERATOR
  %token UNARY_MINUS NOT_OPERATOR
  %token START_BRACKET
  %token <Integer> CONSTANT
  %token IDENTIFIER
  %token BINARY_MINUS

  %type <Tree> program programBody variablesDeclarations variables operators operator expression


  %start program

  %code {
  	public Compiler compiler = new Compiler();
  }

  %%

  program:
      variablesDeclarations programBody { $$ = compiler.astNode("ROOT", $1, $2); }
      ;

  programBody:
      BEGIN_KEYWORD operators END_KEYWORD { $$ = compiler.astNode("Program Body", $2); }
      ;

  variablesDeclarations:
      VAR_KEYWORD variables { $$ = compiler.astNode("Variables Declaration", new Tree("Var"), $2); }
      ;

  variables:
      IDENTIFIER { $$ = compiler.addVariable(yyval.toString(), null); }
      | IDENTIFIER COMMA_SEPARATOR variables { $$ = compiler.addVariable(yyval.toString(), $3); }
      ;

  operators:
      operator { $$ = $1; }
      | operator operators { $$ = compiler.astNode("Operators", $1, $2); }
      ;

  operator:
     IDENTIFIER APPROPRIATION_OPERATOR expression { $$ = compiler.newAppropriation(yyval.toString(), $3); }
     | BEGIN_KEYWORD operators END_KEYWORD { $$ = compiler.astNode("Operators", $2); }
     | LOOP_START expression DO_KEYWORD operator { $$ = compiler.astNode("Loop", $2, $4); }
     ;


  expression:
      UNARY_MINUS expression { $$ = compiler.astNode("Expression", $2, new Tree("U")); }
      | NOT_OPERATOR expression {$$ = compiler.astNode("Expression", $2, new Tree("not")); }
      | START_BRACKET expression END_BRACKET { $$ = $2; }
      | expression PLUS expression { $$ = compiler.astNode("Expression", $1, new Tree("+"), $3); }
      | expression MULTIPLY expression { $$ = compiler.astNode("Expression", $1, new Tree("*"), $3); }
      | expression DIVIDE expression { $$ = compiler.astNode("Expression", $1, new Tree("/"), $3); }
      | expression BINARY_MINUS expression { $$ = compiler.astNode("Expression", $1, new Tree("-"), $3); }
      | expression GRATER_OPERATOR expression { $$ = compiler.astNode("Expression", $1, new Tree(">"), $3); }
      | expression LESS_OPERATOR expression { $$ = compiler.astNode("Expression", $1, new Tree("<+>"), $3); }
      | expression EQUALS_OPERATOR expression { $$ = compiler.astNode("Expression", $1, new Tree("="), $3); }
      | expression AND_OPERATOR expression { $$ = compiler.astNode("Expression", $1, new Tree("&"), $3); }
      | expression OR_OPERATOR expression   { $$ = compiler.astNode("Expression", $1, new Tree("|"), $3); }
      | expression XOR_OPERATOR expression  { $$ = compiler.astNode("Expression", $1, new Tree("^"), $3); }
      | IDENTIFIER { $$ = compiler.identifierReference(yyval.toString()); }
      | CONSTANT { $$ = compiler.constant(yyval.toString()); }
      ;

  %%