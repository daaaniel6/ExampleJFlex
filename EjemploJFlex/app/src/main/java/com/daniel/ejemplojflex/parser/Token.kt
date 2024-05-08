package com.daniel.ejemplojflex.parser

import android.annotation.SuppressLint
import android.util.Log

class Token (val value: String?, val type:Int, val line: Int, val column: Int) {
    private val TAG: String = "Token.kt"

    fun getInfo(){
        Log.println(Log.INFO,TAG, "value ${value}, type: ${type}, line${line}, column: ${column}")
    }

    override fun toString(): String {
        return "Token(value=$value, type=$type, line=$line, column=$column, TAG='$TAG')"
    }


}
