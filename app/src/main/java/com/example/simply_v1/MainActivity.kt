package com.example.simply_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)

        btnOrder.setOnClickListener {
            val rgMeat = findViewById<RadioGroup>(R.id.rgMeat)
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onions = findViewById<CheckBox>(R.id.cbOnions).isChecked
            val salad = findViewById<CheckBox>(R.id.cbSalad).isChecked
            val orderString = "You ordered a burger with :\n" + 
                    "${meat.text}" +
                    (if (cheese)" \n Cheese" else "") +
                    (if (onions) " \n Onions" else "") +
                    (if (salad) " \n salad" else "")
            val tvOrder = findViewById<TextView>(R.id.tvOrder)
            tvOrder.text = orderString
        }
    }

}

