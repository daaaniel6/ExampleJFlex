package com.daniel.ejemplojflex.parser

import java.io.StringReader

class HandleParse {

    fun parse(input: String):Int? {
        val lexer: SimpleLexer = SimpleLexer(StringReader(input))
        val parser = SimpleParser(lexer)

        val result: Int? = parser.parse().value as Int?
        return result

    }

}