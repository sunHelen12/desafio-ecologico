package com.example.desafio_ecologico

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)

        // Referenciando o botão do XML
        val buttonVerDesafio: Button = findViewById(R.id.buttonVerDesafio)
        // Referencia os botões do menu
        val buttonSobre: Button = findViewById(R.id.buttonSobre)
        val buttonSair: Button = findViewById(R.id.buttonSair)

        // Ação do botão para abrir a ChallengeActivity
        buttonVerDesafio.setOnClickListener {
            // Cria um Intent para abrir a próxima Activity
            val intent = Intent(this, ChallengeActivity::class.java)
            startActivity(intent)
        }

        // Sobre - abre a Activity Sobre
        buttonSobre.setOnClickListener {
            val intent = Intent(this, SobreActivity::class.java)
            startActivity(intent)
        }

        // Sair do App - encerra o aplicativo
        buttonSair.setOnClickListener {
            finishAffinity()  // Encerra todas as atividades do app
        }
    }
}