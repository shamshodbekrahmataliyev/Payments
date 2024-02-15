package com.example.payments

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class AddCommentActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_comment)
        var comment = findViewById<ImageView>(R.id.nextbtn)

        comment.setOnClickListener {
            var intent = Intent(this@AddCommentActivity,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}