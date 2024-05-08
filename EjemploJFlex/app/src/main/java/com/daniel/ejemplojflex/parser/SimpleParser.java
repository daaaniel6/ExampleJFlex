
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.daniel.ejemplojflex.parser;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class SimpleParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return SimpleParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public SimpleParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public SimpleParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SimpleParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\013\000\002\002\005\000\002\002\004\000\002\002" +
    "\005\000\002\002\003\000\002\003\005\000\002\003\005" +
    "\000\002\003\003\000\002\004\003\000\002\004\004\000" +
    "\002\005\003\000\002\005\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\010\003\007\005\010\010\004\001\002\000" +
    "\014\002\ufff8\004\ufff8\005\ufff8\006\ufff8\007\ufff8\001\002" +
    "\000\014\002\ufffe\004\ufffe\005\ufffe\006\022\007\021\001" +
    "\002\000\010\002\017\004\015\005\016\001\002\000\004" +
    "\010\014\001\002\000\006\003\007\010\004\001\002\000" +
    "\014\002\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa\001\002" +
    "\000\014\002\ufffb\004\ufffb\005\ufffb\006\ufffb\007\ufffb\001" +
    "\002\000\014\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9" +
    "\001\002\000\014\002\ufff7\004\ufff7\005\ufff7\006\ufff7\007" +
    "\ufff7\001\002\000\010\003\007\005\010\010\004\001\002" +
    "\000\010\003\007\005\010\010\004\001\002\000\004\002" +
    "\000\001\002\000\014\002\uffff\004\uffff\005\uffff\006\022" +
    "\007\021\001\002\000\010\003\007\005\010\010\004\001" +
    "\002\000\010\003\007\005\010\010\004\001\002\000\014" +
    "\002\ufffd\004\ufffd\005\ufffd\006\ufffd\007\ufffd\001\002\000" +
    "\014\002\ufffc\004\ufffc\005\ufffc\006\ufffc\007\ufffc\001\002" +
    "\000\014\002\001\004\001\005\001\006\022\007\021\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\012\002\005\003\004\004\011\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\003\024\004\011\005\010\001\001\000\010\003" +
    "\017\004\011\005\010\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\004\023\005\010\001\001\000\006\004" +
    "\022\005\010\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SimpleParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SimpleParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$SimpleParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public SimpleParser(SimpleLexer lexer){
    super(lexer);
    }

    public void report_error(String message, Object info){

    Symbol err = (Symbol) info;
    Token tokenError = (Token) err.value;
    System.out.println("Error reportado: " + message + tokenError.toString()+ this.symbl_name_from_id(tokenError.getType()));
    this.report_expected_token_ids();
    }

    public void syntax_error(Symbol cur_token){
        System.out.println(" Se encontro un error sintactico" );
    }

    public Symbol scan() throws Exception {
            Symbol sym = this.getScanner().next_token();
            if(sym == null){
                return this.getSymbolFactory().newSymbol("END_OF_FILE", this.EOF_sym());
            }

            while ( sym != null && sym.sym == SimpleParserSym.SYM){
                this.report_expected_token_ids();
                System.out.println("Erro lexico ignorado" + sym.value.toString());
                sym = this.getScanner().next_token();
            }

            return sym;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$SimpleParser$actions {
  private final SimpleParser parser;

  /** Constructor */
  CUP$SimpleParser$actions(SimpleParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$SimpleParser$do_action_part00000000(
    int                        CUP$SimpleParser$act_num,
    java_cup.runtime.lr_parser CUP$SimpleParser$parser,
    java.util.Stack            CUP$SimpleParser$stack,
    int                        CUP$SimpleParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SimpleParser$result;

      /* select the action based on the action number */
      switch (CUP$SimpleParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // a ::= a PLUS b 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		
        if(n1==null)
            n1 = 0;
        if(n2==null)
            n2 = 0;
        RESULT =  n1+n2;
        
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= a EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).right;
		Integer start_val = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).value;
		RESULT = start_val;
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SimpleParser$parser.done_parsing();
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // a ::= a MINUS b 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT =  n1-n2; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // a ::= b 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT = n1; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // b ::= b TIMES c 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT =  n1*n2; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // b ::= b DIVIDES c 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer n2 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		
        if(n2 == 0){
            throw new IllegalArgumentException("Dividiendo por cero");
        }
        RESULT =  n1/n2;
        
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-2)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // b ::= c 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT = n1; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // c ::= d 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		RESULT = n1; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // c ::= MINUS d 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Integer n1 = (Integer)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		 RESULT = n1 * -1; 
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // d ::= INTEGER 
            {
              Integer RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()).right;
		Token n1 = (Token)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.peek()).value;
		
    if(n1.getValue() == null)
    RESULT = 0;
    RESULT = Integer.valueOf(n1.getValue());
    
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // d ::= error INTEGER 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)).value;
		

        System.out.println("mensaje del AS: " + e + eleft +eright);
        report_error("error enviado por mi en : ", cur_err_token());
    
              CUP$SimpleParser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.elementAt(CUP$SimpleParser$top-1)), ((java_cup.runtime.Symbol)CUP$SimpleParser$stack.peek()), RESULT);
            }
          return CUP$SimpleParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$SimpleParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$SimpleParser$do_action(
    int                        CUP$SimpleParser$act_num,
    java_cup.runtime.lr_parser CUP$SimpleParser$parser,
    java.util.Stack            CUP$SimpleParser$stack,
    int                        CUP$SimpleParser$top)
    throws java.lang.Exception
    {
              return CUP$SimpleParser$do_action_part00000000(
                               CUP$SimpleParser$act_num,
                               CUP$SimpleParser$parser,
                               CUP$SimpleParser$stack,
                               CUP$SimpleParser$top);
    }
}

}
