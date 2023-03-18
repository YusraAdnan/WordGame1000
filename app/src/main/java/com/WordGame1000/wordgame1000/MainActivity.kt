package com.WordGame1000.wordgame1000

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
         btnSubmit.setOnClickListener{
             val intent = Intent(this,MainActivity2::class.java)
             startActivity(intent)


         }

    }
}