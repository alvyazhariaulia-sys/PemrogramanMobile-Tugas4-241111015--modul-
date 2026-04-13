package com.utama.aplikasiloginsederhana3a

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 1. Ambil Data dari Intent (Username yang dikirim dari Login)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val username = intent.getStringExtra("username")
        tvUsername.text = "Selamat Datang, ${username ?: "User"}!"

        val cardPromoSeminar = findViewById<androidx.cardview.widget.CardView>(R.id.cardEvent)
        cardPromoSeminar.setOnClickListener {
            Toast.makeText(this, "Seminar Teknologi AI - 10 April 2026", Toast.LENGTH_SHORT).show()
        }
        // 3. Klik Card Event List
        val cardEvent = findViewById<CardView>(R.id.cardEvent)
        cardEvent.setOnClickListener {
            // PASTIKAN EventListActivity sudah kamu buat filenya!
            val intent = Intent(this, EventListActivity::class.java)
            startActivity(intent)
        }

        // 4. Navigasi Bawah (Bottom Navigation)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNav.selectedItemId = R.id.nav_home

        bottomNav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> true
                R.id.nav_event -> {
                    // Pastikan ID nav_event ada di file menu/bottom_menu.xml
                    val intent = Intent(this, EventListActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_ticket -> {
                    Toast.makeText(this, "Fitur tiket belum tersedia", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}
