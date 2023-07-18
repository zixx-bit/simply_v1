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
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToat = findViewById<Button>(R.id.btnToast)

        btnToat.setOnClickListener {
//            Toast.makeText(this, "I am a toast", LENGTH_SHORT).show()
            Toast(this).apply {
                duration = LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast,  null)

                show()
            }
        }



    }

}

