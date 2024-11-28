package com.example.medisight.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.medisight.R
import com.example.medisight.data.preferences.UserPreferences
import com.example.medisight.ui.custom.EmailEditText
import com.example.medisight.ui.custom.PasswordEditText
import com.google.android.material.button.MaterialButton
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var emailInput: EmailEditText
    private lateinit var passwordInput: PasswordEditText
    private lateinit var loginButton: MaterialButton
    private lateinit var googleSignInButton: View
    private lateinit var forgotPasswordText: View
    private lateinit var progressBar: ProgressBar
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        emailInput = findViewById(R.id.ed_login_email)
        passwordInput = findViewById(R.id.ed_login_password)
        loginButton = findViewById(R.id.btnLogin)
        googleSignInButton = findViewById(R.id.btnGoogleSignIn)
        forgotPasswordText = findViewById(R.id.tv_forgot_password)
        progressBar = findViewById(R.id.progressBarLoading)
        progressBar.visibility = View.GONE
        firebaseAuth = FirebaseAuth.getInstance()
        loginButton.setOnClickListener { onLoginClick() }
        googleSignInButton.setOnClickListener { onGoogleSignInClick() }
        forgotPasswordText.setOnClickListener { navigateToForgotPassword() }
    }

    private fun onLoginClick() {
        val email = emailInput.text.toString().trim()
        val password = passwordInput.text.toString().trim()

        if (validateInputs(email, password)) {
            progressBar.visibility = View.VISIBLE
            loginUser(email, password)
        }
    }

    private fun validateInputs(email: String, password: String): Boolean {
        if (email.isEmpty()) {
            emailInput.error = getString(R.string.error_empty_email)
            return false
        }
        if (password.isEmpty()) {
            passwordInput.error = getString(R.string.error_empty_password)
            return false
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailInput.error = getString(R.string.error_invalid_email)
            return false
        }
        return true
    }

    private fun loginUser(email: String, password: String) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                progressBar.visibility = View.GONE
                if (task.isSuccessful) {
                    val userPreferences = UserPreferences(this)
                    userPreferences.setLoggedIn(true)

                    Toast.makeText(this, getString(R.string.login_success), Toast.LENGTH_SHORT)
                        .show()
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(
                        this,
                        getString(R.string.error_invalid_credentials),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }

    private fun onGoogleSignInClick() {
        Toast.makeText(this, getString(R.string.google_sign_in_toast), Toast.LENGTH_SHORT).show()
    }

    private fun navigateToForgotPassword() {
        val intent = Intent(this, ForgotPasswordActivity::class.java)
        startActivity(intent)
    }
}