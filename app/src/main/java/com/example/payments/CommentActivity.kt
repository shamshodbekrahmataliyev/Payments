package com.example.payments

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class CommentActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment)
        var btn = findViewById<Button>(R.id.addComment)

        btn.setOnClickListener {
            var intent = Intent(this@CommentActivity,AddCommentActivity::class.java)
            startActivity(intent)
        }
        var back = findViewById<ImageView>(R.id.backTransfer)

        back.setOnClickListener {
            var intent = Intent(this@CommentActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}