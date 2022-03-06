package com.group3.bangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.group3.bangundatar.databinding.ActivityMainBinding
import com.group3.bangundatar.ui.*

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        chooseButton()
    }

    private fun chooseButton() {
        mainBinding.apply {
            btnLingkaran.setOnClickListener {
                val intent = Intent(this@MainActivity, LuasLingkaranActivity::class.java)
                startActivity(intent)
            }
            btnPersegi.setOnClickListener {
                val intent = Intent(this@MainActivity, LuasPersegiActivity::class.java)
                startActivity(intent)
            }
            btnPersegiPanjang.setOnClickListener {
                val intent = Intent(this@MainActivity, LuasPersegiPanjangActivity::class.java)
                startActivity(intent)
            }
            btnSegitiga.setOnClickListener {
                val intent = Intent(this@MainActivity, LuasSegitigaActivity::class.java)
                startActivity(intent)
            }
            btnJajarGenjang.setOnClickListener {
                val intent = Intent(this@MainActivity, LuasJajarGenjangActivity::class.java)
                startActivity(intent)
            }
            btnTrapesium.setOnClickListener {
                val intent = Intent(this@MainActivity, LuasTrapesiumActivity::class.java)
                startActivity(intent)
            }
            btnLayang.setOnClickListener {
                val intent = Intent(this@MainActivity, LuasLayangActivity::class.java)
                startActivity(intent)
            }
            btnBelahketupat.setOnClickListener {
                val intent = Intent(this@MainActivity, LuasBelahKetupatActivity::class.java)
                startActivity(intent)
            }
        }
    }
}