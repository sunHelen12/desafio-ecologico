package com.example.desafio_ecologico

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SobreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sobre_activity)

        val buttonInicio: Button = findViewById(R.id.buttonVoltar)

        buttonInicio.setOnClickListener {
            // Volta para a tela principal (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
