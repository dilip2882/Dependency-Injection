package com.dilip.daggerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()

        userRegistrationService.registerUser("aaa@gmail.com", "1234")
        emailService.send("aaa@gmail.com", "owner@gmail.com", "Thank you for Registration")

    }
}