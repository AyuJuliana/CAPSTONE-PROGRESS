package com.example.medisight.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.medisight.R

import com.example.medisight.data.preferences.UserPreferences

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var userPreferences: UserPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

        userPreferences = UserPreferences(this)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = if (userPreferences.isLoggedIn()) {
                Intent(this, MainActivity::class.java)
            } else {
                Intent(this, OnBoardingActivity::class.java)
            }
            startActivity(intent)
            finish()
        }, SPLASH_DELAY)
    }

    companion object {
        private const val SPLASH_DELAY: Long = 2000
    }
}