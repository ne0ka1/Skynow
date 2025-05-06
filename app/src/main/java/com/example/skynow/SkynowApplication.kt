package com.example.skynow

import android.app.Application
import android.annotation.SuppressLint
import android.content.Context

class SkynowApplication : Application() {

    companion object {

        const val TOKEN = "1S7FeiWzqn1heFFg"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}