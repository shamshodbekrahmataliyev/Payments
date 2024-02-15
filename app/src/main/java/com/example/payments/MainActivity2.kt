package com.example.payments

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.payments.Fragment.BookFragment

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn = findViewById<ImageView>(R.id.imgback)
        var comment = findViewById<ConstraintLayout>(R.id.mono)
        var comment2 = findViewById<ConstraintLayout>(R.id.mono2)

        btn.setOnClickListener {
            var intent = Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(intent)
        }
        comment.setOnClickListener {
            var intent = Intent(this@MainActivity2,CommentActivity::class.java)
            startActivity(intent)
        }
        comment2.setOnClickListener {
            var intent = Intent(this@MainActivity2,TopUpActivity::class.java)
            startActivity(intent)
        }
    }
}