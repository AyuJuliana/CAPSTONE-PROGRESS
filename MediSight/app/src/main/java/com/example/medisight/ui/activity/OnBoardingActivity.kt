package com.example.medisight.ui.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medisight.R
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.view.View
import com.google.android.material.button.MaterialButton

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var btnLogin: MaterialButton
    private lateinit var btnRegister: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_boarding)

        btnLogin = findViewById(R.id.login_button)
        btnRegister = findViewById(R.id.signup_button)

        setupAction()
        playAnimation()
        setupWindowInsets()
    }

    private fun setupAction() {
        btnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun playAnimation() {
        ObjectAnimator.ofFloat(
            findViewById(R.id.onBoardingImageView),
            View.TRANSLATION_X,
            -30f,
            30f
        ).apply {
            duration = 6000
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
        }.start()

        val title = ObjectAnimator.ofFloat(findViewById(R.id.app_title), View.ALPHA, 0f, 1f)
            .setDuration(500)
        val description =
            ObjectAnimator.ofFloat(findViewById(R.id.description_text), View.ALPHA, 0f, 1f)
                .setDuration(500)
        val login = ObjectAnimator.ofFloat(btnLogin, View.ALPHA, 0f, 1f)
            .setDuration(500)
        val register = ObjectAnimator.ofFloat(btnRegister, View.ALPHA, 0f, 1f)
            .setDuration(500)

        val together = AnimatorSet().apply {
            playTogether(login, register)
        }

        AnimatorSet().apply {
            playSequentially(title, description, together)
            startDelay = 500
        }.start()
    }

    private fun setupWindowInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}