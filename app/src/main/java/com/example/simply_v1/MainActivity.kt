package com.example.simply_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply)


        btnApply.setOnClickListener {

            val firstName = findViewById<EditText>(R.id.edtFirstName).text.toString()
            val lastName = findViewById<EditText>(R.id.edtLastName).text.toString()
            val birthDate = findViewById<EditText>(R.id.edtBirtDate).text.toString()
            val country = findViewById<EditText>(R.id.edtCountry).text.toString()
            Toast.makeText(this, "$firstName $lastName born on $birthDate from $country",Toast.LENGTH_SHORT).show()

        }
    }
    override fun onStart() {
        super.onStart()

    }

}