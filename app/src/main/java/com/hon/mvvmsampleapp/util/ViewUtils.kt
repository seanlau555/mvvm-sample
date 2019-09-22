package com.hon.mvvmsampleapp.util

import android.content.Context
import android.widget.Toast

fun Context.toast(message: String) {
    // this is the extension of Context
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}