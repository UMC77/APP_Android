package com.example.umc77

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.umc77.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //바인딩 겍체 획득
        var binding = ActivityMainBinding.inflate(layoutInflater)
        //액티비티 화면 출력
        setContentView(binding.root)

        //뷰 객체 이용
        //안드로이드 스튜디오에서는 id에서 설정한 _를 자동으로 생략
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

        binding.menuDonutIv.setOnClickListener {
            val intent = Intent(this,DonutActivity::class.java)
            startActivity(intent)
        }

        binding.menuBreadIv.setOnClickListener {
            val intent = Intent(this,BreadActivity::class.java)
            startActivity(intent)
        }
    }
}