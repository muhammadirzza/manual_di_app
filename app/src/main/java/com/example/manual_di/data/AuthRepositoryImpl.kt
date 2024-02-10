package com.example.manual_di.data

import com.example.manual_di.domain.AuthRepository
import java.lang.Exception

class AuthRepositoryImpl(
    private val service: AuthService
): AuthRepository {
    override suspend fun login(email: String, password: String) {
        try {
            println("Logging in...")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}