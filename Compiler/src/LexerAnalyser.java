/* The following code was generated by JFlex 1.7.0 */

import java.lang.String;
import java.util.ArrayList;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>lex.flex</tt>
 */
class LexerAnalyser implements SyntaxAnalyser.Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int unaryMinus = 2;
  public static final int binaryMinus = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\34\1\2\1\3\1\3\1\2\22\0\1\34\7\0\1\35"+
    "\1\20\1\22\1\22\1\20\1\27\1\0\1\1\12\32\1\0\1\20"+
    "\1\22\1\21\1\22\2\0\1\23\1\14\1\33\1\12\1\4\2\33"+
    "\1\37\1\40\2\33\1\41\1\33\1\24\1\13\2\33\1\25\3\33"+
    "\1\7\1\36\1\26\2\33\6\0\1\10\2\33\1\6\1\15\1\33"+
    "\1\16\1\33\1\17\4\33\1\5\1\30\2\33\1\11\1\33\1\31"+
    "\6\33\12\0\1\3\u1fa2\0\1\3\1\3\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\6\5\1\6\1\7"+
    "\1\2\2\5\1\10\1\11\1\5\11\12\1\13\1\14"+
    "\1\12\1\15\1\16\2\5\1\17\1\2\3\5\3\12"+
    "\1\17\1\2\3\12\2\5\1\20\2\12\2\5\2\12"+
    "\2\21";

  private static int [] zzUnpackAction() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\146\0\210\0\146\0\146\0\252"+
    "\0\314\0\356\0\u0110\0\u0132\0\u0154\0\146\0\u0176\0\146"+
    "\0\u0198\0\u01ba\0\u01dc\0\146\0\u01fe\0\u0220\0\u0242\0\u0264"+
    "\0\u0286\0\u02a8\0\u02ca\0\u02ec\0\u030e\0\u0330\0\146\0\u0352"+
    "\0\u0374\0\146\0\u0396\0\u03b8\0\u03da\0\314\0\314\0\u03fc"+
    "\0\u041e\0\u0440\0\u0462\0\u0484\0\u04a6\0\u0264\0\u0264\0\u04c8"+
    "\0\u04ea\0\u050c\0\u052e\0\u0550\0\u0264\0\u0572\0\u0594\0\u05b6"+
    "\0\u05d8\0\u05fa\0\u061c\0\314\0\u0264";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\2\11\1\12\2\11"+
    "\1\13\1\14\1\15\3\11\1\16\1\17\1\20\1\21"+
    "\2\11\1\22\1\4\2\11\1\23\1\11\1\6\1\24"+
    "\1\25\3\11\1\4\1\5\1\6\1\7\1\26\1\27"+
    "\1\30\1\31\2\30\1\32\1\33\1\34\3\30\1\16"+
    "\1\17\1\20\1\35\2\30\1\36\1\37\2\30\1\40"+
    "\1\30\1\6\1\24\1\41\3\30\1\4\1\5\1\6"+
    "\1\7\1\10\2\11\1\12\2\11\1\13\1\14\1\15"+
    "\3\11\1\16\1\17\1\20\1\21\2\11\1\22\1\42"+
    "\2\11\1\23\1\11\1\6\1\24\1\25\3\11\43\0"+
    "\1\43\44\0\1\11\1\44\12\11\3\0\4\11\1\0"+
    "\2\11\1\0\1\11\2\0\4\11\4\0\14\11\3\0"+
    "\4\11\1\0\2\11\1\0\1\11\2\0\4\11\4\0"+
    "\4\11\1\45\7\11\3\0\4\11\1\0\2\11\1\0"+
    "\1\11\2\0\4\11\4\0\7\11\1\46\4\11\3\0"+
    "\4\11\1\0\2\11\1\0\1\11\2\0\4\11\4\0"+
    "\14\11\3\0\2\11\1\47\1\11\1\0\2\11\1\0"+
    "\1\11\2\0\4\11\4\0\11\11\1\50\2\11\3\0"+
    "\4\11\1\0\2\11\1\0\1\11\2\0\4\11\21\0"+
    "\1\20\24\0\14\11\3\0\1\11\1\51\2\11\1\0"+
    "\2\11\1\0\1\11\2\0\4\11\4\0\7\11\1\14"+
    "\4\11\3\0\4\11\1\0\2\11\1\0\1\11\2\0"+
    "\4\11\32\0\1\23\13\0\14\11\3\0\4\11\1\0"+
    "\2\11\1\0\1\11\2\0\1\11\1\52\2\11\4\0"+
    "\1\30\1\53\12\30\3\0\4\30\1\0\2\30\1\0"+
    "\1\30\2\0\4\30\4\0\14\30\3\0\4\30\1\0"+
    "\1\54\1\30\1\0\1\30\2\0\4\30\4\0\14\30"+
    "\3\0\4\30\1\0\2\30\1\0\1\30\2\0\4\30"+
    "\4\0\4\30\1\55\7\30\3\0\4\30\1\0\2\30"+
    "\1\0\1\30\2\0\4\30\4\0\7\30\1\56\4\30"+
    "\3\0\4\30\1\0\2\30\1\0\1\30\2\0\4\30"+
    "\4\0\14\30\3\0\2\30\1\57\1\30\1\0\2\30"+
    "\1\0\1\30\2\0\4\30\4\0\11\30\1\60\2\30"+
    "\3\0\4\30\1\0\2\30\1\0\1\30\2\0\4\30"+
    "\4\0\14\30\3\0\1\30\1\61\2\30\1\0\2\30"+
    "\1\0\1\30\2\0\4\30\4\0\7\30\1\33\4\30"+
    "\3\0\4\30\1\0\2\30\1\0\1\30\2\0\4\30"+
    "\32\0\1\40\13\0\14\30\3\0\4\30\1\0\2\30"+
    "\1\0\1\30\2\0\1\30\1\62\2\30\2\43\2\0"+
    "\36\43\4\0\2\11\1\46\11\11\3\0\4\11\1\0"+
    "\2\11\1\0\1\11\2\0\4\11\4\0\5\11\1\46"+
    "\6\11\3\0\4\11\1\0\2\11\1\0\1\11\2\0"+
    "\4\11\4\0\12\11\1\63\1\11\3\0\4\11\1\0"+
    "\2\11\1\0\1\11\2\0\4\11\4\0\6\11\1\47"+
    "\5\11\3\0\4\11\1\0\2\11\1\0\1\11\2\0"+
    "\4\11\4\0\14\11\3\0\4\11\1\0\2\11\1\0"+
    "\1\11\2\0\2\11\1\64\1\11\4\0\2\30\1\56"+
    "\11\30\3\0\4\30\1\0\2\30\1\0\1\30\2\0"+
    "\4\30\4\0\14\30\3\0\4\30\1\0\1\30\1\65"+
    "\1\0\1\30\2\0\4\30\4\0\5\30\1\56\6\30"+
    "\3\0\4\30\1\0\2\30\1\0\1\30\2\0\4\30"+
    "\4\0\12\30\1\66\1\30\3\0\4\30\1\0\2\30"+
    "\1\0\1\30\2\0\4\30\4\0\6\30\1\57\5\30"+
    "\3\0\4\30\1\0\2\30\1\0\1\30\2\0\4\30"+
    "\4\0\14\30\3\0\4\30\1\0\2\30\1\0\1\30"+
    "\2\0\2\30\1\67\1\30\4\0\13\11\1\70\3\0"+
    "\4\11\1\0\2\11\1\0\1\11\2\0\4\11\4\0"+
    "\14\11\3\0\4\11\1\0\2\11\1\0\1\11\2\0"+
    "\3\11\1\71\4\0\13\30\1\72\3\0\4\30\1\0"+
    "\2\30\1\0\1\30\2\0\4\30\4\0\14\30\3\0"+
    "\4\30\1\0\2\30\1\0\1\30\2\0\3\30\1\73"+
    "\4\0\1\11\1\46\12\11\3\0\4\11\1\0\2\11"+
    "\1\0\1\11\2\0\4\11\4\0\1\74\13\11\3\0"+
    "\4\11\1\0\2\11\1\0\1\11\2\0\4\11\4\0"+
    "\1\30\1\56\12\30\3\0\4\30\1\0\2\30\1\0"+
    "\1\30\2\0\4\30\4\0\1\75\13\30\3\0\4\30"+
    "\1\0\2\30\1\0\1\30\2\0\4\30";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1598];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\2\11\6\1\1\11\1\1\1\11"+
    "\3\1\1\11\12\1\1\11\2\1\1\11\33\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerAnalyser(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println();
    System.out.println("------------------------------------------------------");
    System.out.printf("ERROR. Unexpected token: %s - line: %d, start symbol: %d\n", yytext(), yyline+1, yycolumn);
    System.out.println("------------------------------------------------------");
    System.exit(0);
            } 
            // fall through
          case 18: break;
          case 2: 
            { yylval = new String(yytext());
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
            // fall through
          case 19: break;
          case 3: 
            { 
            } 
            // fall through
          case 20: break;
          case 4: 
            { System.out.print(yytext());
            } 
            // fall through
          case 21: break;
          case 5: 
            { checkForKeyWords(yytext(), yyline+1, yycolumn);
    yylval = new String(yytext());
    yybegin(binaryMinus);
    return SyntaxAnalyser.Lexer.IDENTIFIER;
            } 
            // fall through
          case 22: break;
          case 6: 
            { yylval = new String(yytext());

    switch (yytext()) {
        case "," : return SyntaxAnalyser.Lexer.COMMA_SEPARATOR;
        case ")" : return SyntaxAnalyser.Lexer.END_BRACKET;
    }
            } 
            // fall through
          case 23: break;
          case 7: 
            { yylval = new String(yytext());
    yybegin(unaryMinus);
    return SyntaxAnalyser.Lexer.APPROPRIATION_OPERATOR;
            } 
            // fall through
          case 24: break;
          case 8: 
            { yylval = new Integer(yytext());
    yybegin(binaryMinus);
    return SyntaxAnalyser.Lexer.CONSTANT;
            } 
            // fall through
          case 25: break;
          case 9: 
            { yylval = new String(yytext());
    yybegin(unaryMinus);
    return SyntaxAnalyser.Lexer.START_BRACKET;
            } 
            // fall through
          case 26: break;
          case 10: 
            { checkForKeyWords(yytext(), yyline+1, yycolumn);
        yylval = new String(yytext());
        yybegin(binaryMinus);
        return SyntaxAnalyser.Lexer.IDENTIFIER;
            } 
            // fall through
          case 27: break;
          case 11: 
            { yylval = new String(yytext());
        yybegin(unaryMinus);
        return SyntaxAnalyser.Lexer.UNARY_MINUS;
            } 
            // fall through
          case 28: break;
          case 12: 
            { yylval = new Integer(yytext());
        yybegin(binaryMinus);
        return SyntaxAnalyser.Lexer.CONSTANT;
            } 
            // fall through
          case 29: break;
          case 13: 
            { yylval = new String(yytext());
        return SyntaxAnalyser.Lexer.BINARY_MINUS;
            } 
            // fall through
          case 30: break;
          case 14: 
            { yylval = new String(yytext());
            } 
            // fall through
          case 31: break;
          case 15: 
            { yylval = new String(yytext());
    switch (yytext()) {
        case "End" : return SyntaxAnalyser.Lexer.END_KEYWORD;
        case "Var" : return SyntaxAnalyser.Lexer.VAR_KEYWORD;
        case "DO" : return SyntaxAnalyser.Lexer.DO_KEYWORD;
        case "Begin" : return SyntaxAnalyser.Lexer.BEGIN_KEYWORD;
    }
            } 
            // fall through
          case 32: break;
          case 16: 
            { yylval = new String(yytext());
        yybegin(unaryMinus);
        return SyntaxAnalyser.Lexer.NOT_OPERATOR;
            } 
            // fall through
          case 33: break;
          case 17: 
            { yylval = new String(yytext());
    yybegin(unaryMinus);
    return SyntaxAnalyser.Lexer.LOOP_START;
            } 
            // fall through
          case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java LexerAnalyser [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        LexerAnalyser scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new LexerAnalyser(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
