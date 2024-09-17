package com.example.desafio_ecologico


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class FooterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.footer_activity)

        val calendar = Calendar.getInstance()

        val textFooter: TextView = findViewById(R.id.textFooter)

        textFooter.text = "DroidSmiths ${calendar.get(Calendar.YEAR)}"
    }
}