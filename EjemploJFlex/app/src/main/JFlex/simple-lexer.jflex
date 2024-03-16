package com.daniel.EjemploJFlex;


%%

%class SimpleLexer
%unicode
%line
%column
%type Token


%{
    private Token token(TokenType type, Object value){
        return new Token(value.toString(), type, yyline, yycolumn);
    }

    private Token token(TokenType type){
        return new Token(null, type, yyline, yycolumn);
    }
%}

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator}|[ \t\f]

integer = 0|[1-9][1-9]*  //[0-9]+  101
decimal = {integer}\.\d
id = [_a-zA-Z][a-zA-Z0-9]*      //_dsif  _varAlgo


%%

<YYINITIAL> {
            {integer}
            {
                return token(TokenType.INTEGER, yytext());
            }
            {decimal}
            {
                return token(TokenType.DECIMAL, yytext());
            }
            {id}
            {
                return token(TokenType.ID, yytext());
            }
            {WhiteSpace}
            {

            }

}

[^]
            {
                System.out.println("Error" + yytext());
            }



