package com.example.manual_di.data

import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("login")
    suspend fun login(
        @Body body: LoginRequest
    )
}

data class LoginRequest(
    val email: String,
    val password: String
)