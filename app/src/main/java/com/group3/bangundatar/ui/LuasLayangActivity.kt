package com.group3.bangundatar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.bangundatar.databinding.ActivityLuasLayangBinding

class LuasLayangActivity : AppCompatActivity() {
    private lateinit var layangBinding: ActivityLuasLayangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layangBinding = ActivityLuasLayangBinding.inflate(layoutInflater)
        setContentView(layangBinding.root)
        hitungLuasLayangan()
    }

    private fun hitungLuasLayangan() {
        layangBinding.apply {
            btnHitung.setOnClickListener {
                val diagonal1 = edtDiagonal1.text.toString().trim()
                val diagonal2 = edtDiagonal2.text.toString().trim()
                when {
                    diagonal1.isEmpty() -> {
                        edtDiagonal1.error = "Field ini tidak boleh kosong"
                    }
                    diagonal2.isEmpty() -> {
                        edtDiagonal2.error = "Field ini tidak boleh kosong"
                    }
                    else -> {
                        val hasil = (diagonal1.toDouble() * diagonal2.toDouble())/2
                        tvHasil.text = hasil.toString()
                    }
                }
            }
        }
    }
}