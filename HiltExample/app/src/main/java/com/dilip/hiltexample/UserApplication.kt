package com.dilip.hiltexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application() {

    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

        userRepository.saveUser("dilip@gmail.com", "1212")
    }
}