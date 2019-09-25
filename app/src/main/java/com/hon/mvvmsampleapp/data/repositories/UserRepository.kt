package com.hon.mvvmsampleapp.data.repositories

import com.hon.mvvmsampleapp.data.network.MyApi
import com.hon.mvvmsampleapp.data.network.responses.AuthResponse
import retrofit2.Response

class UserRepository {
    suspend fun userLogin(email: String, password: String): Response<AuthResponse> {
        return MyApi().userLogin(email, password)
    }
//    fun userLogin(email: String, password: String): LiveData<String> {
//        val loginResponse = MutableLiveData<String>()
//
//        MyApi().userLogin(email, password)
//            .enqueue(object : Callback<ResponseBody> {
//                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                    loginResponse.value = t.message
//                }
//
//                override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
//                    if (response.isSuccessful){
//                        loginResponse.value = response.body()?.string()
//
//                    } else {
//                        loginResponse.value = response.errorBody()?.string()
//                    }
//                }
//
//            })
//        return loginResponse
//    }
}