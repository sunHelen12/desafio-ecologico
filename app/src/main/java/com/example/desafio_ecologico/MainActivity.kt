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
        setContentView(R.layout.activity_main)

        // Referenciando o botão do XML
        val buttonViewChallenge: Button = findViewById(R.id.button_View_Challenge)
        // Referencia os botões do menu_buttons
        val buttonAbout: Button = findViewById(R.id.button_About)
        val buttonClose: Button = findViewById(R.id.button_Close)

        // Ação do botão para abrir a ChallengeActivity
        buttonViewChallenge.setOnClickListener {
            // Cria um Intent para abrir a próxima Activity
            val intent = Intent(this, ChallengeActivity::class.java)
            startActivity(intent)
        }

        // Sobre - abre a Activity Sobre
        buttonAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        // Sair do app - encerra o aplicativo
        buttonClose.setOnClickListener {
            finishAffinity()  // Encerra todas as atividades do app
        }
    }
}