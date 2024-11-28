package com.example.medisight.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.medisight.R
import com.example.medisight.data.model.AuthResult
import com.example.medisight.data.preferences.UserPreferences
import com.example.medisight.data.repository.AuthRepository
import com.example.medisight.databinding.ActivityRegisterBinding
import com.example.medisight.domain.usecase.LoginUseCase
import com.example.medisight.domain.usecase.RegisterUseCase
import com.example.medisight.ui.viewmodel.AuthViewModel
import com.example.medisight.factory.AuthViewModelFactory
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    private val viewModel: AuthViewModel by viewModels {
        AuthViewModelFactory(
            LoginUseCase(AuthRepository(FirebaseAuth.getInstance())),
            RegisterUseCase(AuthRepository(FirebaseAuth.getInstance()))
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
        observeViewModel()
    }

    private fun setupUI() {
        binding.btnSignUp.setOnClickListener {
            val name = binding.edRegisterName.text.toString().trim()
            val email = binding.edRegisterEmail.text.toString().trim()
            val password = binding.edRegisterPassword.text.toString().trim()
            val confirmPassword = binding.editTextConfirmPassword.text.toString().trim()

            if (validateInput(name, email, password, confirmPassword)) {
                binding.progressBarLoading.visibility = View.VISIBLE
                viewModel.register(email, password)
            }
        }

        binding.btnBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }

    private fun observeViewModel() {
        lifecycleScope.launchWhenStarted {
            viewModel.authState.collect { result ->
                binding.progressBarLoading.visibility = View.GONE
                when (result) {
                    is AuthResult.Success -> {
                        val userPreferences = UserPreferences(this@RegisterActivity)
                        userPreferences.setLoggedIn(true)

                        Toast.makeText(
                            this@RegisterActivity,
                            getString(R.string.registration_success),
                            Toast.LENGTH_SHORT
                        ).show()

                        startActivity(Intent(this@RegisterActivity, MainActivity::class.java))
                        finish()
                    }
                    is AuthResult.Error -> {
                        Toast.makeText(this@RegisterActivity, result.message, Toast.LENGTH_SHORT)
                            .show()
                    }
                    else -> {}
                }
            }
        }
    }

    private fun validateInput(
        name: String,
        email: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (name.isEmpty()) {
            binding.edRegisterName.error = getString(R.string.error_empty_username)
            return false
        }
        if (email.isEmpty()) {
            binding.edRegisterEmail.error = getString(R.string.error_empty_email)
            return false
        }
        if (password.isEmpty()) {
            binding.edRegisterPassword.error = getString(R.string.error_empty_password)
            return false
        }
        if (confirmPassword.isEmpty()) {
            binding.editTextConfirmPassword.error = getString(R.string.error_empty_confirm_password)
            return false
        }
        if (password != confirmPassword) {
            binding.editTextConfirmPassword.error = getString(R.string.error_password_mismatch)
            return false
        }
        return true
    }
}