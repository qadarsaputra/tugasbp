package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val BtnMore:Button = findViewById(R.id.menu4)
        val BookKid:Button = findViewById(R.id.menu1)

        BtnMore.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        BookKid.setOnClickListener {
            val intent = Intent(this, BookKidActivity::class.java)
            startActivity(intent)
        }
    }
}