package com.example.common_network.response

import com.example.common_network.response.Source

data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)