package com.group3.bangundatar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.bangundatar.databinding.ActivityLuasBelahKetupatBinding

class LuasBelahKetupatActivity : AppCompatActivity() {
    private lateinit var bkBinding: ActivityLuasBelahKetupatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bkBinding = ActivityLuasBelahKetupatBinding.inflate(layoutInflater)
        setContentView(bkBinding.root)
        hitungLuasBelahKetupat()
    }

    private fun hitungLuasBelahKetupat() {
        bkBinding.apply {
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
                        val hasil = 0 //Isikan dulu rumusnya disini ya
                        tvHasil.text = hasil.toString()
                    }
                }
            }
        }
    }
}