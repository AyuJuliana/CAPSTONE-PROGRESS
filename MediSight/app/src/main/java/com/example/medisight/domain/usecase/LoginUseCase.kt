package com.example.medisight.domain.usecase

import com.example.medisight.data.repository.AuthRepository
import com.example.medisight.data.model.AuthResult

class LoginUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(email: String, password: String): AuthResult {
        return repository.login(email, password)
    }
}