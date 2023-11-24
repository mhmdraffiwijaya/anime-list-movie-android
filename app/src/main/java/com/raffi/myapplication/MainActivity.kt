package com.raffi.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnlogin = findViewById<Button>(R.id.btnLogin)
        val nmuser = findViewById<EditText>(R.id.txtLayout)
        val password = findViewById<EditText>(R.id.txtLayoutPass)

        btnlogin.setOnClickListener {
            val user = nmuser.text.toString()
            val pass = password.text.toString()
            if (user == "raffi" && pass == "admin"){
                val intent = Intent(this@MainActivity, Berandaa::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Maaf username atau password anda salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }
    }
