package com.example.simply_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCount = findViewById<Button>(R.id.btnCount)
        val tvCount = findViewById<TextView>(R.id.tvCount)
            var count = 0
        btnCount.setOnClickListener {
            count++
            tvCount.text = "Lets count together: $count"
        }
    }
    override fun onStart() {
        super.onStart()

    }

}