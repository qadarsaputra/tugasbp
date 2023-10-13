package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnLogin:Button = findViewById(R.id.buttonlogin)
        btnLogin.setOnClickListener{
            val intentHome = Intent(this,HomeActivity::class.java)
            startActivity(intentHome)
        }
    }
}