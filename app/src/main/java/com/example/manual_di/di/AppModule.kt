package com.example.manual_di.di

import android.content.Context
import com.example.manual_di.data.AuthRepositoryImpl
import com.example.manual_di.data.AuthService
import com.example.manual_di.domain.AuthRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

interface AppModule {
    val service: AuthService
    val authRepository: AuthRepository
}

class AppModuleImpl(
    private val appContext: Context
): AppModule {
    override val service: AuthService by lazy {
        Retrofit.Builder()
            .baseUrl("https://my-url.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }

    override val authRepository: AuthRepository by lazy {
        AuthRepositoryImpl(service)
    }
}