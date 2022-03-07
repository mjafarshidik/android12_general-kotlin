package com.group3.bangundatar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.bangundatar.databinding.ActivityLuasPersegiPanjangBinding

class LuasPersegiPanjangActivity : AppCompatActivity() {
    private lateinit var ppBinding: ActivityLuasPersegiPanjangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ppBinding = ActivityLuasPersegiPanjangBinding.inflate(layoutInflater)
        setContentView(ppBinding.root)
        hitungLuasPersegiPanjang()
    }

    private fun hitungLuasPersegiPanjang() {
        ppBinding.apply {
            btnHitung.setOnClickListener {
                val panjang = edtPanjang.text.toString().trim()
                val lebar = edtLebar.text.toString().trim()
                when {
                    panjang.isEmpty() -> {
                        edtPanjang.error = "Field ini tidak boleh kosong"
                    }
                    lebar.isEmpty() -> {
                        edtLebar.error = "Field ini tidak boleh kosong"
                    }
                    else -> {
                        val hasil = panjang.toDouble() * lebar.toDouble()
                        tvHasil.text = hasil.toString()
                    }
                }
            }
        }
    }
}