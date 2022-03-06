package com.group3.bangundatar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.bangundatar.databinding.ActivityLuasPersegiBinding

class LuasPersegiActivity : AppCompatActivity() {
    private lateinit var persegiBinding: ActivityLuasPersegiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        persegiBinding = ActivityLuasPersegiBinding.inflate(layoutInflater)
        setContentView(persegiBinding.root)
        hitungLuasPersegi()
    }

    private fun hitungLuasPersegi() {
        persegiBinding.apply {
            btnHitung.setOnClickListener {
                val sisi = edtSisi.text.toString().trim()
                when {
                    sisi.isEmpty() -> {
                        edtSisi.error = "Field ini tidak boleh kosong"
                    }
                    else -> {
                        val hasil = sisi.toDouble() * sisi.toDouble()
                        tvHasil.text = hasil.toString()
                    }
                }
            }
        }
    }
}