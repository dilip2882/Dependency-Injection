package com.dilip.hiltexample

import android.util.Log
import javax.inject.Inject

const val TAG = "DILIP"

class UserRepository @Inject  constructor(){
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User Saved in DB")
    }
}