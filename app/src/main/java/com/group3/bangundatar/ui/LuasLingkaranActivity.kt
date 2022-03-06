package com.group3.bangundatar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.bangundatar.databinding.ActivityLuasLingkaranBinding

class LuasLingkaranActivity : AppCompatActivity() {
    private lateinit var lingkaranBinding: ActivityLuasLingkaranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lingkaranBinding = ActivityLuasLingkaranBinding.inflate(layoutInflater)
        setContentView(lingkaranBinding.root)
        hitungLuasLingkaran()
    }

    private fun hitungLuasLingkaran() {
        lingkaranBinding.apply {
            btnHitung.setOnClickListener {
                val jariJari = edtJari.text.toString().trim()
                when {
                    jariJari.isEmpty() -> {
                        edtJari.error = "Field ini tidak boleh kosong"
                    }
                    else -> {
                        val phi = 3.14
                        val hasil = 0 //Isikan dulu rumusnya disini ya
                        tvHasil.text = hasil.toString()
                    }
                }
            }
        }
    }
}
