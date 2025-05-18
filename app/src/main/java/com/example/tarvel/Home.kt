package com.example.tarvel

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<TextView>(R.id.nm)
        button.setOnClickListener {

            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
            finish()
        }

        // In your Activity/Fragment
        val imageView1 = findViewById<ImageView>(R.id.image6) // Correct type

        imageView1.setOnClickListener {
            val intent = Intent(this, Place1::class.java)
            startActivity(intent)
            // finish() // Only include if you want to close current activity
        }
        val imageView2 = findViewById<ImageView>(R.id.image5) // Correct type

        imageView2.setOnClickListener {
            val intent = Intent(this, place2::class.java)
            startActivity(intent)
            // finish() // Only include if you want to close current activity
        }
        val imageView = findViewById<ImageView>(R.id.image9) // Correct type

        imageView.setOnClickListener {
            val intent = Intent(this, Place3::class.java)
            startActivity(intent)
            // finish() // Only include if you want to close current activity
        }


    }
}