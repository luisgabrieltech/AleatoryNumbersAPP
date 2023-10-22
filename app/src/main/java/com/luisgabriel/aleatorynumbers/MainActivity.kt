package com.luisgabriel.aleatorynumbers

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val botaogerarnumero: Button = findViewById(R.id.generatorButton)
        val resultadogeradornumero: TextView = findViewById(R.id.generatorResult)

        botaogerarnumero.setOnClickListener{

            val numeroAleatorio = Random.nextInt(21)
            resultadogeradornumero.text = "Numero gerado: $numeroAleatorio"

        //val mensagemGerador = Toast.makeText( this, "O Número foi gerado!", Toast.LENGTH_LONG )
        //mensagemGerador.show()
        }
    }

    class Dice () {

    }

}