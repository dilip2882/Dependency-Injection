package com.dilip.hiltexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UserApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }
}