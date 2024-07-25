package com.dilip.hiltexample

import android.util.Log
import javax.inject.Inject

const val TAG = "DILIP"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User Saved in DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: User Saved in Firebase")
    }

}