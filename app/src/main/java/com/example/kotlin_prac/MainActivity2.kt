package com.example.kotlin_prac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun buttonClicked(view: View) {
        Toast.makeText(this, "Hello, world", Toast.LENGTH_LONG).show()
    }
}