package com.example.simply_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)

        btnAdd.setOnClickListener {
            var tvResult = findViewById<TextView>(R.id.tvResult)
            var firstNumber = findViewById<EditText>(R.id.etFirstNumber).text.toString().toInt()
            var secondNumber = findViewById<EditText>(R.id.etSecondNumber).text.toString().toInt()

           var result = firstNumber + secondNumber
            tvResult.text = result.toString()

        }
    }

    override fun onStart() {
        super.onStart()

    }

}

