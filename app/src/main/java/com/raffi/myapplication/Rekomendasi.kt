package com.raffi.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Rekomendasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rekomendasi)
        val btnkembali = findViewById<Button>(R.id.button)

        btnkembali.setOnClickListener {
            val intents = Intent(this, Berandaa::class.java)
            startActivity(intents)
        }
    }
}