package com.example.payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TopUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_up)
        var btn = findViewById<ImageView>(R.id.backImg)

        btn.setOnClickListener {
            var intent = Intent(this@TopUpActivity,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}