package com.daniel.ejemplojflex.parser

import android.annotation.SuppressLint
import android.util.Log

class Token (val value: String?, val type:TokenType, val line: Int, val column: Int) {
    private val TAG: String = "Token.kt"

    fun getInfo(){
        Log.println(Log.INFO,TAG, "value ${value}, type: ${type.name}, line${line}, column: ${column}")
    }


}
