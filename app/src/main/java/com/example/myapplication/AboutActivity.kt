package com.example.myapplication

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

                val imgCall:ImageView = findViewById(R.id.imageviewcall)
                val web:ImageView = findViewById(R.id.imagebrowser)
        val location:ImageView = findViewById(R.id.imagemaps)

        imgCall.setOnClickListener {
            val callIntent:Intent = Uri.parse("tel:085155163678").let {
                number->Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

        web.setOnClickListener {
            val webIntent:Intent = Uri.parse("https://auth.amikom.ac.id/mhs").let {
            webpage -> Intent(Intent.ACTION_VIEW,webpage)
            }
            startActivity(webIntent)
        }

        location.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:47.6, -122,3?z11")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) !=null) {
                startActivity(mapIntent)
            }
        }

    }
}