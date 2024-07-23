package com.dilip.hiltexample

import javax.inject.Inject

const val TAG = "DILIP"

class UserRepository @Inject constructor(val loggerService: LoggerService) {
    fun saveUser(email: String, password: String) {
        loggerService.log("saveUser: User Saved in DB")
    }
}