package com.example.umc77

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umc77.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.menuVeganIv.setOnClickListener {
            val intent = Intent(this,VeganActivity::class.java)
            startActivity(intent)

        }

        binding.menuCakeIv.setOnClickListener {
            val intent = Intent(this,CakeActivity::class.java)
            startActivity(intent)

        }

        binding.menuCookiesIv.setOnClickListener {
            val intent = Intent(this,CookiesActivity::class.java)
            startActivity(intent)

        }
    }
}