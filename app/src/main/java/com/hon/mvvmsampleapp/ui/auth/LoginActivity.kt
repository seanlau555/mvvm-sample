package com.hon.mvvmsampleapp.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.hon.mvvmsampleapp.R
import com.hon.mvvmsampleapp.data.db.entities.User
import com.hon.mvvmsampleapp.databinding.ActivityLoginBinding
import com.hon.mvvmsampleapp.util.hide
import com.hon.mvvmsampleapp.util.show
import com.hon.mvvmsampleapp.util.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login)
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.authListener = this
    }

    override fun onStarted() {
        progress_bar.show()
    }

    override fun onSuccess(user: User) {
        progress_bar.hide()
        toast("${user.name} is logged in")
//        loginResponse.observe(this, Observer {
//            progress_bar.hide()
//            toast(it)
//        })
    }

    override fun onFailure(message: String) {
        progress_bar.hide()
        toast(message)
    }

}