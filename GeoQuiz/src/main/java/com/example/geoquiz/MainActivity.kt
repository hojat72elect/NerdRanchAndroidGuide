package com.example.geoquiz

import android.os.Bundle
import android.view.Gravity
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
            val toast1 =
                Toast.makeText(
                    this,
                    getString(R.string.string_button_true),
                    Toast.LENGTH_SHORT
                )
            toast1.setGravity(Gravity.TOP, 0, 0)
            toast1.show()
        }
        falseButton.setOnClickListener {
            val toast2 =
                Toast.makeText(
                    this,
                    getString(R.string.String_button_false),
                    Toast.LENGTH_SHORT
                )
            toast2.setGravity(Gravity.CENTER, 0, 0)
            toast2.show()

        }
    }
}