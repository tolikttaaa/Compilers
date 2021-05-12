/* A Bison parser, made by GNU Bison 3.5.1.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015, 2018-2020 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */





/**
 * A Bison parser, automatically generated from <tt>SyntaxAnalyser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class SyntaxAnalyser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.5.1";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";







  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>SyntaxAnalyser</tt>.
   */
  public interface Lexer {
    /** Token returned by the scanner to signal the end of its input.  */
    public static final int EOF = 0;

/* Tokens.  */
    /** Token number,to be returned by the scanner.  */
    static final int COMMENT = 258;
    /** Token number,to be returned by the scanner.  */
    static final int END_KEYWORD = 259;
    /** Token number,to be returned by the scanner.  */
    static final int VAR_KEYWORD = 260;
    /** Token number,to be returned by the scanner.  */
    static final int DO_KEYWORD = 261;
    /** Token number,to be returned by the scanner.  */
    static final int BEGIN_KEYWORD = 262;
    /** Token number,to be returned by the scanner.  */
    static final int LOOP_START = 263;
    /** Token number,to be returned by the scanner.  */
    static final int COMMA_SEPARATOR = 264;
    /** Token number,to be returned by the scanner.  */
    static final int END_BRACKET = 265;
    /** Token number,to be returned by the scanner.  */
    static final int APPROPRIATION_OPERATOR = 266;
    /** Token number,to be returned by the scanner.  */
    static final int PLUS = 267;
    /** Token number,to be returned by the scanner.  */
    static final int MULTIPLY = 268;
    /** Token number,to be returned by the scanner.  */
    static final int DIVIDE = 269;
    /** Token number,to be returned by the scanner.  */
    static final int GRATER_OPERATOR = 270;
    /** Token number,to be returned by the scanner.  */
    static final int LESS_OPERATOR = 271;
    /** Token number,to be returned by the scanner.  */
    static final int EQUALS_OPERATOR = 272;
    /** Token number,to be returned by the scanner.  */
    static final int AND_OPERATOR = 273;
    /** Token number,to be returned by the scanner.  */
    static final int OR_OPERATOR = 274;
    /** Token number,to be returned by the scanner.  */
    static final int XOR_OPERATOR = 275;
    /** Token number,to be returned by the scanner.  */
    static final int UNARY_MINUS = 276;
    /** Token number,to be returned by the scanner.  */
    static final int NOT_OPERATOR = 277;
    /** Token number,to be returned by the scanner.  */
    static final int START_BRACKET = 278;
    /** Token number,to be returned by the scanner.  */
    static final int CONSTANT = 279;
    /** Token number,to be returned by the scanner.  */
    static final int IDENTIFIER = 280;
    /** Token number,to be returned by the scanner.  */
    static final int BINARY_MINUS = 281;


    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param msg The string for the error message.
     */
     void yyerror (String msg);
  }

/**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;

  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public SyntaxAnalyser (Lexer yylexer) 
  {
    
    this.yylexer = yylexer;
    
  }



  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror (String msg)
  {
    yylexer.yyerror (msg);
  }



  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value                            ) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;
          

          Object[] newValueStack = new Object[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (0 < num) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out) {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yyLRGotoState (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - yyntokens_] + yystate;
    if (0 <= yyr && yyr <= yylast_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - yyntokens_];
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    Object yyval = (0 < yylen) ? yystack.valueAt (yylen - 1) : yystack.valueAt (0);
    

    switch (yyn)
      {
          case 2:
  if (yyn == 2)
    /* "SyntaxAnalyser.y":31  */
                                        { yyval = compiler.astNode("ROOT", ((Tree)(yystack.valueAt (1))), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 3:
  if (yyn == 3)
    /* "SyntaxAnalyser.y":35  */
                                          { yyval = compiler.astNode("Program Body", ((Tree)(yystack.valueAt (1)))); };
  break;
    

  case 4:
  if (yyn == 4)
    /* "SyntaxAnalyser.y":39  */
                            { yyval = compiler.astNode("Variables Declaration", new Tree("Var"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 5:
  if (yyn == 5)
    /* "SyntaxAnalyser.y":43  */
                 { yyval = compiler.addVariable(yyval.toString(), null); };
  break;
    

  case 6:
  if (yyn == 6)
    /* "SyntaxAnalyser.y":44  */
                                             { yyval = compiler.addVariable(yyval.toString(), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 7:
  if (yyn == 7)
    /* "SyntaxAnalyser.y":48  */
               { yyval = ((Tree)(yystack.valueAt (0))); };
  break;
    

  case 8:
  if (yyn == 8)
    /* "SyntaxAnalyser.y":49  */
                           { yyval = compiler.astNode("Operators", ((Tree)(yystack.valueAt (1))), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 9:
  if (yyn == 9)
    /* "SyntaxAnalyser.y":53  */
                                                  { yyval = compiler.newAppropriation(yyval.toString(), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 10:
  if (yyn == 10)
    /* "SyntaxAnalyser.y":54  */
                                           { yyval = compiler.astNode("Operators", ((Tree)(yystack.valueAt (1)))); };
  break;
    

  case 11:
  if (yyn == 11)
    /* "SyntaxAnalyser.y":55  */
                                                 { yyval = compiler.astNode("Loop", ((Tree)(yystack.valueAt (2))), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 12:
  if (yyn == 12)
    /* "SyntaxAnalyser.y":60  */
                             { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (0))), new Tree("U")); };
  break;
    

  case 13:
  if (yyn == 13)
    /* "SyntaxAnalyser.y":61  */
                                {yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (0))), new Tree("not")); };
  break;
    

  case 14:
  if (yyn == 14)
    /* "SyntaxAnalyser.y":62  */
                                             { yyval = ((Tree)(yystack.valueAt (1))); };
  break;
    

  case 15:
  if (yyn == 15)
    /* "SyntaxAnalyser.y":63  */
                                   { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("+"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 16:
  if (yyn == 16)
    /* "SyntaxAnalyser.y":64  */
                                       { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("*"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 17:
  if (yyn == 17)
    /* "SyntaxAnalyser.y":65  */
                                     { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("/"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 18:
  if (yyn == 18)
    /* "SyntaxAnalyser.y":66  */
                                           { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("-"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 19:
  if (yyn == 19)
    /* "SyntaxAnalyser.y":67  */
                                              { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree(">"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 20:
  if (yyn == 20)
    /* "SyntaxAnalyser.y":68  */
                                            { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("<+>"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 21:
  if (yyn == 21)
    /* "SyntaxAnalyser.y":69  */
                                              { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("="), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 22:
  if (yyn == 22)
    /* "SyntaxAnalyser.y":70  */
                                           { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("&"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 23:
  if (yyn == 23)
    /* "SyntaxAnalyser.y":71  */
                                            { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("|"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 24:
  if (yyn == 24)
    /* "SyntaxAnalyser.y":72  */
                                            { yyval = compiler.astNode("Expression", ((Tree)(yystack.valueAt (2))), new Tree("^"), ((Tree)(yystack.valueAt (0)))); };
  break;
    

  case 25:
  if (yyn == 25)
    /* "SyntaxAnalyser.y":73  */
                   { yyval = compiler.identifierReference(yyval.toString()); };
  break;
    

  case 26:
  if (yyn == 26)
    /* "SyntaxAnalyser.y":74  */
                 { yyval = compiler.constant(yyval.toString()); };
  break;
    


/* "SyntaxAnalyser.java":486  */

        default: break;
      }

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    int yystate = yyLRGotoState (yystack.stateAt (0), yyr1_[yyn]);
    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }





  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException

  {
    


    /* Lookahead and lookahead in internal form.  */
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yyerrstatus_ = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval );



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyPactValueIsDefault (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {

            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal ();

          }

        /* Convert token to internal form.  */
        yytoken = yytranslate_ (yychar);

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
            if (yyTableValueIsError (yyn))
              label = YYERRLAB;
            else
              {
                yyn = -yyn;
                label = YYREDUCE;
              }
          }

        else
          {
            /* Shift the lookahead token.  */
            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
            /* If just tried and failed to reuse lookahead token after an
               error, discard it.  */

            if (yychar <= Lexer.EOF)
              {
                /* Return failure if at end of input.  */
                if (yychar == Lexer.EOF)
                  return false;
              }
            else
              yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:
        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yyPactValueIsDefault (yyn))
              {
                yyn += yy_error_token_;
                if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yy_error_token_)
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;

            
            yystack.pop ();
            yystate = yystack.stateAt (0);
          }

        if (label == YYABORT)
            /* Leave the switch.  */
            break;



        /* Shift the error token.  */

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yyPactValueIsDefault (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yyTableValueIsError (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final byte yypact_ninf_ = -22;
  private static final byte yytable_ninf_ = -1;

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final byte yypact_[] = yypact_init();
  private static final byte[] yypact_init()
  {
    return new byte[]
    {
      -2,   -21,     5,    19,    20,   -22,   -22,     0,   -22,   -21,
       0,   -12,    16,    24,     0,   -22,    35,   -12,   -12,   -12,
     -22,   -22,    18,   -12,   -22,   -22,   -22,    48,    48,    33,
       0,   -12,   -12,   -12,   -12,   -12,   -12,   -12,   -12,   -12,
     -12,    48,   -22,   -22,    48,    48,    48,    48,    48,    48,
      48,    48,    48,    48
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final byte yydefact_[] = yydefact_init();
  private static final byte[] yydefact_init()
  {
    return new byte[]
    {
       0,     0,     0,     0,     5,     4,     1,     0,     2,     0,
       0,     0,     0,     0,     7,     6,     0,     0,     0,     0,
      26,    25,     0,     0,     3,     8,    10,    12,    13,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     9,    14,    11,    15,    16,    17,    19,    20,    21,
      22,    23,    24,    18
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final byte yypgoto_[] = yypgoto_init();
  private static final byte[] yypgoto_init()
  {
    return new byte[]
    {
     -22,   -22,   -22,   -22,    31,    44,    11,   -17
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final byte yydefgoto_[] = yydefgoto_init();
  private static final byte[] yydefgoto_init()
  {
    return new byte[]
    {
      -1,     2,     8,     3,     5,    13,    14,    22
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final byte yytable_[] = yytable_init();
  private static final byte[] yytable_init()
  {
    return new byte[]
    {
      27,    28,    29,     1,     4,     6,    41,    10,    11,    17,
      18,    19,    20,    21,    44,    45,    46,    47,    48,    49,
      50,    51,    52,    53,    30,    12,     7,    23,    24,     9,
      31,    32,    33,    34,    35,    36,    37,    38,    39,    26,
      15,    43,     0,    42,    40,    31,    32,    33,    34,    35,
      36,    37,    38,    39,    16,     0,     0,     0,    25,    40,
      31,    32,    33,    34,    35,    36,    37,    38,    39,     0,
       0,     0,     0,     0,    40
    };
  }

private static final byte yycheck_[] = yycheck_init();
  private static final byte[] yycheck_init()
  {
    return new byte[]
    {
      17,    18,    19,     5,    25,     0,    23,     7,     8,    21,
      22,    23,    24,    25,    31,    32,    33,    34,    35,    36,
      37,    38,    39,    40,     6,    25,     7,    11,     4,     9,
      12,    13,    14,    15,    16,    17,    18,    19,    20,     4,
       9,    30,    -1,    10,    26,    12,    13,    14,    15,    16,
      17,    18,    19,    20,    10,    -1,    -1,    -1,    14,    26,
      12,    13,    14,    15,    16,    17,    18,    19,    20,    -1,
      -1,    -1,    -1,    -1,    26
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final byte yystos_[] = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
    {
       0,     5,    28,    30,    25,    31,     0,     7,    29,     9,
       7,     8,    25,    32,    33,    31,    32,    21,    22,    23,
      24,    25,    34,    11,     4,    32,     4,    34,    34,    34,
       6,    12,    13,    14,    15,    16,    17,    18,    19,    20,
      26,    34,    10,    33,    34,    34,    34,    34,    34,    34,
      34,    34,    34,    34
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte yyr1_[] = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
    {
       0,    27,    28,    29,    30,    31,    31,    32,    32,    33,
      33,    33,    34,    34,    34,    34,    34,    34,    34,    34,
      34,    34,    34,    34,    34,    34,    34
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte yyr2_[] = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     2,     3,     2,     1,     3,     1,     2,     3,
       3,     4,     2,     2,     3,     3,     3,     3,     3,     3,
       3,     3,     3,     3,     3,     1,     1
    };
  }


  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "$end", "error", "$undefined", "COMMENT", "END_KEYWORD", "VAR_KEYWORD",
  "DO_KEYWORD", "BEGIN_KEYWORD", "LOOP_START", "COMMA_SEPARATOR",
  "END_BRACKET", "APPROPRIATION_OPERATOR", "PLUS", "MULTIPLY", "DIVIDE",
  "GRATER_OPERATOR", "LESS_OPERATOR", "EQUALS_OPERATOR", "AND_OPERATOR",
  "OR_OPERATOR", "XOR_OPERATOR", "UNARY_MINUS", "NOT_OPERATOR",
  "START_BRACKET", "CONSTANT", "IDENTIFIER", "BINARY_MINUS", "$accept",
  "program", "programBody", "variablesDeclarations", "variables",
  "operators", "operator", "expression", null
    };
  }



  /* YYTRANSLATE_(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
     as returned by yylex, with out-of-bounds checking.  */
  private static final byte yytranslate_ (int t)
  {
    int user_token_number_max_ = 281;
    byte undef_token_ = 2;

    if (t <= 0)
      return Lexer.EOF;
    else if (t <= user_token_number_max_)
      return yytranslate_table_[t];
    else
      return undef_token_;
  }
  private static final byte yytranslate_table_[] = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26
    };
  }


  private static final byte yy_error_token_ = 1;

  private static final int yylast_ = 74;
  private static final int yynnts_ = 8;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 6;
  private static final int yyntokens_ = 27;

/* User implementation code.  */
/* Unqualified %code blocks.  */
/* "SyntaxAnalyser.y":24  */

  	public Compiler compiler = new Compiler();
  

/* "SyntaxAnalyser.java":975  */

}

/* "SyntaxAnalyser.y":77  */
