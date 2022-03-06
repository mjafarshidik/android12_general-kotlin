package com.group3.bangundatar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.bangundatar.databinding.ActivityLuasSegitigaBinding

class LuasSegitigaActivity : AppCompatActivity() {
    private lateinit var segitigaBinding: ActivityLuasSegitigaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        segitigaBinding = ActivityLuasSegitigaBinding.inflate(layoutInflater)
        setContentView(segitigaBinding.root)
        hitungLuasSegitiga()
    }

    private fun hitungLuasSegitiga() {
        segitigaBinding.apply {
            btnHitung.setOnClickListener {
                val alas = edtAlas.text.toString().trim()
                val tinggi = edtTinggi.text.toString().trim()
                when {
                    alas.isEmpty() -> {
                        edtAlas.error = "Field ini tidak boleh kosong"
                    }
                    tinggi.isEmpty() -> {
                        edtTinggi.error = "Field ini tidak boleh kosong"
                    }
                    else -> {
                        val hasil = 0 //Isikan dulu rumusnya disini ya
                        tvHasil.text = hasil.toString()
                    }
                }
            }
        }
    }
}