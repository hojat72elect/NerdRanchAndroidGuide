package com.example.geoquiz

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.button_true)
        falseButton = findViewById(R.id.button_false)

        trueButton.setOnClickListener {
            Toast.makeText(this, getString(R.string.string_button_true), Toast.LENGTH_SHORT).show()
        }
        falseButton.setOnClickListener {
            Toast.makeText(this, getString(R.string.String_button_false), Toast.LENGTH_SHORT).show()
        }
    }
}