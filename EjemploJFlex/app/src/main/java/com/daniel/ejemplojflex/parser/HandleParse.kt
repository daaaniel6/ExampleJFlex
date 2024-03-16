package com.daniel.ejemplojflex.parser

import java.io.StringReader

class HandleParse {

    fun parse(input: String){
        val lexer: SimpleLexer = SimpleLexer(StringReader(input))
        var token = lexer.yylex()

        while (token != null){
            token.getInfo()
            token = lexer.yylex()
        }

    }

}