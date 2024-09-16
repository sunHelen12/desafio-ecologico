package com.example.desafio_ecologico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ChallengeActivity : AppCompatActivity() {
    // Lista de desafios ecológicos
    private val desafios = listOf(
        "Economize água hoje!",
        "Recicle todo o plástico usado!",
        "Desligue as luzes ao sair do cômodo!",
        "Use transporte público ou bicicleta!",
        "Reduza o consumo de carne por um dia!",
        "Use menos papel e opte por digital!",
        "Doe roupas que não usa mais!"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.challenge_activity)

        // Referenciando o TextView e os Buttons
        val textViewDesafio: TextView = findViewById(R.id.textViewDesafio)
        val buttonProximoDesafio: Button = findViewById(R.id.buttonProximoDesafio)
        val buttonInicio: Button = findViewById(R.id.buttonInicio)

        // Exibe um desafio aleatório ao abrir a Activity
        textViewDesafio.text = desafios.random()

        // Ação do botão para exibir o próximo desafio aleatório
        buttonProximoDesafio.setOnClickListener {
            // Gera um novo desafio aleatório
            textViewDesafio.text = desafios.random()
        }

        // Ação do botão "Início"
        buttonInicio.setOnClickListener {
            // Volta para a tela principal (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
