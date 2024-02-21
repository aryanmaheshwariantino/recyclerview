package com.aryan.recyclerview.API

data class NewsData(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)