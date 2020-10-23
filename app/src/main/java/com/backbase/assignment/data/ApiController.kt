package com.backbase.assignment.data

import android.util.Log
import com.backbase.assignment.data.retrofit.MoviesApi
import com.backbase.assignment.data.retrofit.RetrofitHelper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ApiController : Callback<String> {
    fun start() {
        val retrofit = RetrofitHelper().getBaseRetrofit()
        val moviesApi = retrofit.create(MoviesApi::class.java)
        val call = moviesApi.getAllMovies()
        call.enqueue(this)
    }

    override fun onResponse(call: Call<String>, response: Response<String>) {
        Log.d(TAG, "$call.\n\n$response")
        TODO("Not yet implemented")
    }

    override fun onFailure(call: Call<String>, t: Throwable) {
        TODO("Not yet implemented")
    }

    companion object {
        val TAG = this::class.java.canonicalName
    }

}