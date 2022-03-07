package com.group3.bangundatar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.bangundatar.databinding.ActivityLuasTrapesiumBinding

class LuasTrapesiumActivity : AppCompatActivity() {
    private lateinit var trapesiumBinding: ActivityLuasTrapesiumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trapesiumBinding = ActivityLuasTrapesiumBinding.inflate(layoutInflater)
        setContentView(trapesiumBinding.root)
        hitungLuasTrapesium()
    }

    private fun hitungLuasTrapesium() {
        trapesiumBinding.apply {
            btnHitung.setOnClickListener {
                val sisi1 = edtSisi1.text.toString().trim()
                val sisi2 = edtSisi2.text.toString().trim()
                val tinggi = edtTinggi.text.toString().trim()

                when {
                    sisi1.isEmpty() -> {
                        edtSisi1.error = "Field ini tidak boleh kosong"
                    }
                    sisi2.isEmpty() -> {
                        edtSisi2.error = "Field ini tidak boleh kosong"
                    }
                    tinggi.isEmpty() -> {
                        edtTinggi.error = "Field ini tidak boleh kosong"
                    }
                    else -> {
                        val hasil = 0.5 * (sisi1.toDouble() + sisi2.toDouble()) * tinggi.toDouble()
                        tvHasil.text = hasil.toString()
                    }
                }
            }
        }
    }
}