package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMore:Button = findViewById(R.id.menu4)
        val bookKid:Button = findViewById(R.id.menu1)
        val rvBuku:RecyclerView = findViewById(R.id.recyclerviewbuku)

        btnMore.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        bookKid.setOnClickListener {
            val intent = Intent(this, BookKidActivity::class.java)
            startActivity(intent)
        }

        rvBuku.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<BukuModel>()

        data.add(BukuModel(R.drawable.book1, "Emi's Beach Adventure",
            "Ini adalah buku yang Berjudul Emi'S Beach adventure"))

        data.add(BukuModel(R.drawable.book2, "Ade's Adventure",
            "Ini adalah buku yang Berjudul Emi'S Beach adventure"))

        data.add(BukuModel(R.drawable.book4, "Mermaid To Rescue",
            "Ini adalah buku yang Berjudul Emi'S Beach adventure"))
    }
}