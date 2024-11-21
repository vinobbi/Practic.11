package com.example.practice11

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var isImageOne = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val but = findViewById<Button>(R.id.button)
        val btn = findViewById<ImageButton>(R.id.imageButton)
        btn.setOnClickListener {
            onClickImage()
        }
        but.setOnClickListener {
            val img = findViewById<ImageView>(R.id.imageView2)
            img.setImageResource(R.drawable.sunny_weather_icon_150663)
            Toast.makeText(this, "Image Added", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickImage() {
        val btn = findViewById<ImageButton>(R.id.imageButton)
        isImageOne = !isImageOne

        if (isImageOne) {
            btn.setImageResource(R.drawable.sunny_rain_weather_icon_150661)
        } else {
            btn.setImageResource(R.drawable.sunny_weather_icon_150663)
        }
    }
}