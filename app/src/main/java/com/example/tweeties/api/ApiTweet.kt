package com.example.tweeties.api

import com.example.tweeties.models.Tweet
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiTweet {

    @GET("https://api.jsonbin.io/v3/b/65ff3211c15d220e4399cfe6?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path")category: String) : Response<List<Tweet>>

    @GET("https://api.jsonbin.io/v3/b/65ff3211c15d220e4399cfe6?meta=false")
    @Headers("X-JSON-Path:tweets..category")
    suspend fun getCategory() : Response<List<String>>
}