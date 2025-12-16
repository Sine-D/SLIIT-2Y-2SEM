package com.example.Teezy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Orders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        // Reference the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Set the selected item to "Orders"
        bottomNavigationView.selectedItemId = R.id.nav_orders

        // Set up Shop Now button
        val shopNowButton = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.shopNowButton)
        shopNowButton.setOnClickListener {
            val intent = Intent(this, Home::class.java)
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
                    // Already on Orders page, do nothing
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