package com.example.Teezy
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Load splash screen
        setContentView(R.layout.activity_launching)
        
        // Splash screen delay for 5 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnboardingActivityOne::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}