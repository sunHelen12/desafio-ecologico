package com.example.desafio_ecologico

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val buttonHome: Button = findViewById(R.id.button_Home)

        buttonHome.setOnClickListener {
            // Volta para a tela principal (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
