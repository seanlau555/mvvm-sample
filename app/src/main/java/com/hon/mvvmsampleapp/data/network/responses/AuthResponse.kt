package com.hon.mvvmsampleapp.data.network.responses

import com.hon.mvvmsampleapp.data.db.entities.User

data class AuthResponse (
    val isSuccessful: Boolean?,
    val message: String?,
    val user: User?
)