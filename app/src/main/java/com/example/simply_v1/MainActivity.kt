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

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        var tvResult = findViewById<TextView>(R.id.tvResult)
        var firstNumber = findViewById<EditText>(R.id.etFirstNumber)
        var secondNumber = findViewById<EditText>(R.id.etSecondNumber)
//

        btnAdd.setOnClickListener {
            firstNumber.text
            secondNumber.text
//           var result = firstNumber + secondNumber
            tvResult.text = " ${firstNumber} + "


        }
//        btnCount.setOnClickListener {
//            count++
//            tvCount.text = "Lets count together: $count"
//        }
    }

    override fun onStart() {
        super.onStart()

    }

}