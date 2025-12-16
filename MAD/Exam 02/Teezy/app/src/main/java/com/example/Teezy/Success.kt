package com.example.Teezy

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        // Delay by 3 seconds after success message
        Handler(Looper.getMainLooper()).postDelayed({
            finish() // Close after 3 seconds
        }, 3000)
    }
}