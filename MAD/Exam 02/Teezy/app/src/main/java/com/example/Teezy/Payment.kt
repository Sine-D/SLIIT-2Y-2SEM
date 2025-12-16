package com.example.Teezy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.Teezy.R.*
import com.example.Teezy.R.id.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_payment)

        // Reference the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Set the selected item to "Home" (since payment is not a main nav item)
        bottomNavigationView.selectedItemId = R.id.nav_home

        val Press = findViewById<androidx.appcompat.widget.AppCompatButton>(PayBtnLast)
        Press.setOnClickListener {
            val intent = Intent(this, Success::class.java)
            startActivity(intent)
            finish()
        }

        // Set up navigation listener
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Navigate to Home activity
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_wishlist -> {
                    // Navigate to Wishlist activity
                    val intent = Intent(this, Wishlist::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_orders -> {
                    // Navigate to Orders activity (you can create this later)
                    // For now, just return true to prevent default behavior
                    true
                }
                R.id.nav_profile -> {
                    // Navigate to Profile activity
                    val intent = Intent(this, Account::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}