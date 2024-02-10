package com.example.manual_di.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.manual_di.domain.AuthRepository
import kotlinx.coroutines.launch

class MainViewModel(
    private val authRepository: AuthRepository
): ViewModel() {
    fun login() {
        viewModelScope.launch {
            authRepository.login("testEmail", "testing")
        }
    }
}