package com.example.manual_di

import android.app.Application
import com.example.manual_di.di.AppModule
import com.example.manual_di.di.AppModuleImpl

class MyApp: Application() {
    // to make appModule as singleton
    companion object {
        lateinit var appModule: AppModule
    }

    override fun onCreate() {
        super.onCreate()
        appModule = AppModuleImpl(this)
    }
}