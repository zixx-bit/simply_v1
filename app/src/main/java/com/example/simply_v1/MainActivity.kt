package com.example.simply_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)

        btnOrder.setOnClickListener {
            val rgMeat = findViewById<RadioGroup>(R.id.rgMeat).checkedRadioButtonId
            val cheese = findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onions = findViewById<CheckBox>(R.id.cbOnions).isChecked
            val salad = findViewById<CheckBox>(R.id.cbSalad).isChecked

        }

    }

}

