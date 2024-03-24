package com.example.tweeties.models

data class Tweet(
    val category: String,
    val date: String,
    val gifs: List<String>,
    val link: String,
    val pictures: List<String>,
    val stats: Stats,
    val text: String,
    val user: User,
    val videos: List<String>
)