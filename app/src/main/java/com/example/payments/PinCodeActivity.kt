package com.example.payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class PinCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin_code)
        var btn2 = findViewById<Button>(R.id.Continue)
        var btn3 = findViewById<ImageView>(R.id.backPin)

        btn2.setOnClickListener {
            var intent = Intent(this@PinCodeActivity,MainActivity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            var intent = Intent(this@PinCodeActivity,MyCardActivity::class.java)
            startActivity(intent)
        }
    }
}