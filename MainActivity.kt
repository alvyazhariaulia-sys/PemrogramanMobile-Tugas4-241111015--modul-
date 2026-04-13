package com.utama.aplikasiloginsederhana3a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Pastikan nama layout XML-nya sesuai (biasanya activity_main)
        setContentView(R.layout.activity_main)

        // 1. Inisialisasi semua View sesuai ID di activity_main.xml
        val etNama = findViewById<EditText>(R.id.etNama)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etConfirmPassword = findViewById<EditText>(R.id.etConfirmPassword)
        val rgGender = findViewById<RadioGroup>(R.id.rgGender)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)

        // 2. Aksi tombol Daftar
        btnDaftar.setOnClickListener {
            val nama = etNama.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val phone = etPhone.text.toString().trim()
            val pass = etPassword.text.toString().trim()
            val confirmPass = etConfirmPassword.text.toString().trim()
            val genderId = rgGender.checkedRadioButtonId

            // Validasi Input Kosong
            if (nama.isEmpty() || email.isEmpty() || phone.isEmpty() ||
                pass.isEmpty() || confirmPass.isEmpty() || genderId == -1) {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
            }
            // Validasi Password Match
            else if (pass != confirmPass) {
                Toast.makeText(this, "Password tidak cocok!", Toast.LENGTH_SHORT).show()
            }
            // Jika semua benar
            else {
                Toast.makeText(this, "Registrasi sukses! Silakan Login", Toast.LENGTH_LONG).show()

                // ALUR: Setelah daftar, balik ke LoginActivity
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)

                // Menutup MainActivity (Register) agar saat user pencet tombol 'back' di HP,
                // aplikasi tidak balik ke form daftar lagi.
                finish()
            }
        }
    }
}
