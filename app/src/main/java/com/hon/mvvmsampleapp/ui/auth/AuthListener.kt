package com.hon.mvvmsampleapp.ui.auth

import com.hon.mvvmsampleapp.data.db.entities.User

interface AuthListener {
    fun onStarted()
    fun onSuccess(user: User)
    fun onFailure(message: String)
}