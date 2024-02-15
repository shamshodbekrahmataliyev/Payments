package com.example.payments

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.payments.Fragment.BookFragment
import com.example.payments.Fragment.GiftFragment
import com.example.payments.Fragment.HomeFragment
import com.example.payments.Fragment.SuitcasesFragment
import com.example.payments.databinding.ActivityMain2Binding
import com.example.payments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when (it.itemId) {


                R.id.home -> replaceFragment(HomeFragment())
                R.id.medical_book -> replaceFragment(BookFragment())

                else -> {


                }

            }
            true

        }

        var btn = findViewById<CardView>(R.id.myCardUp)
        var btn1 = findViewById<ImageView>(R.id.transferToCard)


        btn.setOnClickListener {
            var intent = Intent(this@MainActivity, MyCardActivity::class.java)
            startActivity(intent)
        }
        btn1.setOnClickListener {
            var intent = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
        }

    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()

    }
}