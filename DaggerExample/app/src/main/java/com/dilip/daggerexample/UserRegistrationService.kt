package com.dilip.daggerexample

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "abc@gmail.com", "User registered")
    }
}

/*
Unit testing
Single responsibility
Lifetime of these objects
Extensible
*/