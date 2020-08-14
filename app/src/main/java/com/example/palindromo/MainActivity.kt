package com.example.palindromo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.palindromo.domain.Palindromo

class MainActivity : AppCompatActivity(){

    lateinit var txt_palindromo: EditText
    lateinit var bt_verificar: Button
    lateinit var txt_resposta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_palindromo = findViewById(R.id.txt_palindromo)
        bt_verificar = findViewById(R.id.btn_verificar)
        txt_resposta = findViewById(R.id.txt_resposta)

        bt_verificar.setOnClickListener() {
            val palindromo = Palindromo(txt_palindromo.text.toString())

            txt_resposta.text = if(palindromo.ehPalindromo())
                "${palindromo.conteudo}: É um palindromo"
            else
                "${palindromo.conteudo}: Não é um palindromo"

        }
    }

}