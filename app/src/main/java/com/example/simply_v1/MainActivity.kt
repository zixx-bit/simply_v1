package com.example.simply_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply)
        val firstName = findViewById<EditText>(R.id.edtFirstName)
        val lastName = findViewById<EditText>(R.id.edtLastName)
        val birthDate = findViewById<EditText>(R.id.edtBirtDate)
        val country = findViewById<EditText>(R.id.edtCountry)

        btnApply.setOnClickListener {
            firstName.text.toString()
            lastName.text.toString()
            country.text.toString()
            birthDate.text.toString()
            Log.d("MainActivity", "$firstName $lastName born on $birthDate from $country")

        }
    }
    override fun onStart() {
        super.onStart()

    }

}