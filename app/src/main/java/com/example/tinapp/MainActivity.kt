package com.example.tinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var num:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickTest(view : View) {
        val myText = findViewById<TextView>(R.id.myText)
        if (num % 2 == 0) myText.text = "First Test" else myText.text = "Second Test"
        num++
     }
    //тестовая запись для проверки Git
}