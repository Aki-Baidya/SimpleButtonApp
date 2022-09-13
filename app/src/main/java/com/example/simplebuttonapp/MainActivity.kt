package com.example.simplebuttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                         // Reference
        val myTextView = findViewById<TextView>(R.id.myTextView)

        myTextView.setOnClickListener{
            Log.i("Aki", "Clicked on hello world!")
        }
    }
}