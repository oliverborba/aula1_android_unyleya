package com.lob.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private var num1: EditText? = null
    private var num2: EditText? = null
    private var soma: Button? = null
    private lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.edtNum1)
        num2 = findViewById(R.id.edtNum2)
        soma = findViewById(R.id.btnSoma)
        resultado = findViewById(R.id.tvResultado)

        soma?.setOnClickListener{
            val valor1 = num1?.text.toString().toFloat()
            val valor2 = num2?.text.toString().toFloat()
            resultado.text = "Resultado: ${valor1 + valor2}"
            Log.d("LM", "Resultado: ${valor1 + valor2}" )
        }
    }
    override fun onResume(){
        super.onResume()
        resultado.text = ""
    }
}