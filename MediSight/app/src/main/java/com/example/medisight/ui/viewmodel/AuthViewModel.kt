package com.example.medisight.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.medisight.data.model.AuthResult
import com.example.medisight.domain.usecase.LoginUseCase
import com.example.medisight.domain.usecase.RegisterUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuthViewModel(
    private val loginUseCase: LoginUseCase,
    private val registerUseCase: RegisterUseCase
) : ViewModel() {

    private val _authState = MutableStateFlow<AuthResult?>(null)
    val authState: StateFlow<AuthResult?> get() = _authState

    fun login(email: String, password: String) {
        viewModelScope.launch {
            val result = loginUseCase(email, password)
            _authState.value = result
        }
    }

    fun register(email: String, password: String) {
        viewModelScope.launch {
            val result = registerUseCase(email, password)
            _authState.value = result
        }
    }
}
