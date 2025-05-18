package com.example.tarvel

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

import androidx.core.view.WindowInsetsCompat

class Place1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_place1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val backButton = findViewById<ImageButton>(R.id.backbtn2)
        backButton.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish() // Close the current activity and go back
        }


        val frontButton = findViewById<ImageButton>(R.id.frontbtn2)
        frontButton.setOnClickListener{
            val intent = Intent(this, place2::class.java)
            startActivity(intent)
            finish()

        }
        val bookButton = findViewById<TextView>(R.id.bk)
        bookButton.setOnClickListener{
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
            finish()

        }

    }
}