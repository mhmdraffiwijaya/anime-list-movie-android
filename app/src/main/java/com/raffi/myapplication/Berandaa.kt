package com.raffi.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Berandaa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berandaa)
        val btnabout = findViewById<Button>(R.id.button15)
        val btngenre = findViewById<Button>(R.id.button14)
        val btnrekomen = findViewById<Button>(R.id.button13)

        btnabout.setOnClickListener {
                val intents = Intent(this, Aboutt::class.java)
                startActivity(intents)
            }
        btngenre.setOnClickListener {
            val intents = Intent(this, CardActivity::class.java)
            startActivity(intents)
        }
        btnrekomen.setOnClickListener {
            val intents = Intent(this, Rekomendasi::class.java)
            startActivity(intents)
        }
        }

    }
