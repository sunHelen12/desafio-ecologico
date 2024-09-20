package com.example.desafio_ecologico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ChallengeActivity : AppCompatActivity() {
    // Lista de desafios ecológicos
    private val challenges = listOf(
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
        setContentView(R.layout.activity_challenge)

        // Referenciando o TextView e os Buttons
        val textViewChallenge: TextView = findViewById(R.id.text_View_Challenge)
        val buttonNextChallenge: Button = findViewById(R.id.button_Next_Challenge)
        val buttonHome: Button = findViewById(R.id.button_Home)

        // Exibe um desafio aleatório ao abrir a Activity
        textViewChallenge.text = challenges.random()

        // Ação do botão para exibir o próximo desafio aleatório
        buttonNextChallenge.setOnClickListener {
            // Gera um novo desafio aleatório
            textViewChallenge.text = challenges.random()
        }

        // Ação do botão "Início"
        buttonHome.setOnClickListener {
            // Volta para a tela principal (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
