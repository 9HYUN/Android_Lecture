package com.goldra9.bts_lec

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//push test

        //1.화면 클릭
        //변수
        val image1 = findViewById<ImageView>(R.id.image_1)
        image1.setOnClickListener {
            //Toast 하단에 메세지 박스
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show();
            //2. 클릭 후 사진 확대

            val intent = Intent(this, BtsActivity::class.java)
            startActivity(intent)
        }
        val image2 = findViewById<ImageView>(R.id.image_2)
        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show();
            val intent = Intent(this, BtsActivity2::class.java)
            startActivity(intent)
        }
        val image3 = findViewById<ImageView>(R.id.image_3)
        image3.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show();
            val intent = Intent(this, BtsActivity3::class.java)
            startActivity(intent)
        }
        val image4 = findViewById<ImageView>(R.id.image_4)
        image4.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show();
            val intent = Intent(this, BtsActivity4::class.java)
            startActivity(intent)
        }
        val image5 = findViewById<ImageView>(R.id.image_5)
        image5.setOnClickListener {
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show();
            val intent = Intent(this, BtsActivity5::class.java)
            startActivity(intent)
        }
        val image6 = findViewById<ImageView>(R.id.image_6)
        image6.setOnClickListener {
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show();
            val intent = Intent(this, BtsActivity6::class.java)
            startActivity(intent)
        }
        val image7 = findViewById<ImageView>(R.id.image_7)
        image7.setOnClickListener {
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show();
            val intent = Intent(this, BtsActivity7::class.java)
            startActivity (intent)
        }
        val image8 = findViewById<ImageView>(R.id.image_8)
        image8.setOnClickListener {
            Toast.makeText(this, "8번 클릭 완료", Toast.LENGTH_LONG).show();
            val intent = Intent(this, SJActivity::class.java)
            startActivity(intent)
        }
    }
}