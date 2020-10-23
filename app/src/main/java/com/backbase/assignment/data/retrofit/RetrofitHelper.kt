package com.backbase.assignment.data.retrofit

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {

    private val gson =
        GsonBuilder()
            .setLenient()
            .create()

    fun getBaseRetrofit() : Retrofit =
        Retrofit.Builder()
            .baseUrl(ApiConstants.ENDPOINT)
            .client(getOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

    private fun getOkHttpClient() : OkHttpClient =
        OkHttpClient.Builder()
            .build()

}