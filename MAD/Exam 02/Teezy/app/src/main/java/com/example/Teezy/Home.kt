package com.example.Teezy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Reference the BottomNavigationView
        val bottomNavigationView = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottomNavigationView)

        val buyButton1 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton1)
        val buyButton2 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton2)
        val buyButton3 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton3)
        val buyButton4 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton4)
        val buyButton5 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton5)
        val buyButton6 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton6)
        val buyButton7 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton7)
        val buyButton8 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton8)
        // Set the selected item to "Home"
        bottomNavigationView.selectedItemId = R.id.nav_home

        buyButton1.setOnClickListener {
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }

        val navigateToProduct: (android.view.View) -> Unit = {
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }

        buyButton2.setOnClickListener(navigateToProduct)
        buyButton3.setOnClickListener(navigateToProduct)
        buyButton4.setOnClickListener(navigateToProduct)
        buyButton5.setOnClickListener(navigateToProduct)
        buyButton6.setOnClickListener(navigateToProduct)
        buyButton7.setOnClickListener(navigateToProduct)
        buyButton8.setOnClickListener(navigateToProduct)



        // Set up navigation listener
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Already on home page, do nothing
                    true
                }
                R.id.nav_wishlist -> {
                    // Navigate to Wishlist activity
                    val intent = Intent(this, Wishlist::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                // In the bottomNavigationView.setOnItemSelectedListener block
                // Replace the existing nav_orders case with:
                
                R.id.nav_orders -> {
                    // Navigate to Orders activity
                    val intent = Intent(this, Orders::class.java)
                    startActivity(intent)
                    finish()
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