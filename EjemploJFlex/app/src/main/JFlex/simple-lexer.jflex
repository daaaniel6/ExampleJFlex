package com.daniel.EjemploJFlex;
import static com.daniel.ejemplojflex.parser.SimpleParserSym.*;
import java_cup.runtime.*;

%%

%class SimpleLexer
%unicode
%line
%column
%type java_cup.runtime.Symbol
%cup


%{
/*
    private Token token(TokenType type, Object value){
        return new Token(value.toString(), type, yyline, yycolumn);
    }

    private Token token(TokenType type){
        return new Token(null, type, yyline, yycolumn);
    }
 */

    private Symbol symbol(int type, Object value){
            return new Symbol(type, new Token(value.toString(), type, yyline + 1, yycolumn + 1));
    }

    private Symbol symbol(int type){
            return new Symbol(type, new Token(null, type, yyline + 1, yycolumn + 1));
    }

%}

%eofval{
    return symbol(EOF);
%eofval}
%eofclose


LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator}|[ \t\f]

integer = 0|[1-9][0-9]*

sym = [a-zA-Z$]+


%%

<YYINITIAL> {
            "+"
            {
            return symbol(PLUS);
            }
"-"
            {
            return symbol(MINUS);
            }
"*"
            {
            return symbol(TIMES);
            }
"/"
            {
            return symbol(DIVIDES);
            }

 "("
             {
             return symbol(LPAR);
             }
 ")"
             {
             return symbol(RPAR);
             }


            {integer}
            {
                return symbol(INTEGER, yytext());
            }
            {WhiteSpace}
            {
            }
            {sym}
            {
            System.out.println("Error Lexico: --> " + yytext());
            return symbol(SYM);
            }


}

[^]
            {
                System.out.println("Otro Error" + yytext());
            }



