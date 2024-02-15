package com.example.payments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

class MyCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_card)
        var btn1 = findViewById<LinearLayout>(R.id.PinCode)
        var btn2 = findViewById<CardView>(R.id.calculator)

        btn1.setOnClickListener {
            var intent = Intent(this@MyCardActivity, PinCodeActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            var intent = Intent(this@MyCardActivity,CalculatorActivity::class.java)
            startActivity(intent)
        }

    }
}