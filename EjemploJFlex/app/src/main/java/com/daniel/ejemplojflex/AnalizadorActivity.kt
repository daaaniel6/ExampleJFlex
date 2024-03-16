package com.daniel.ejemplojflex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.daniel.ejemplojflex.parser.HandleParse
import com.google.android.material.textfield.TextInputEditText

class AnalizadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_analizador)

        val analizarButton = findViewById<Button>(R.id.analizarButton)
        val codeTextArea = findViewById<TextInputEditText>(R.id.codigoTextArea)
        val algo= "dafss"

        analizarButton.setOnClickListener{
            Log.i("DanielApp", "El texto es: ${codeTextArea.text.toString()}" )
            var code = codeTextArea.text.toString()
            if (code.isNotEmpty()){
                compile(code)
            }
        }


    }

    fun compile(input: String){
        val parser: HandleParse = HandleParse()
        parser.parse(input)
    }


}