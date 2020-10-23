package com.backbase.assignment.data.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface MoviesApi {

    @GET(ApiConstants.NOW_PLAYING +
            ApiConstants.START_PARAM +
            ApiConstants.LANGUAGE_KEY + ApiConstants.ENGLISH +
            ApiConstants.ADD_PARAM +
            ApiConstants.API_TOKEN_KEY +
            ApiConstants.API_TOKEN)

    fun getAllMovies(): Call<String>

}