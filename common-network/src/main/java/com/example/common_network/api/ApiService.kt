package com.example.common_network.api

import com.example.common_network.response.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {

    @GET(EndPoints.TOP_HEADLINES)
    suspend fun getHeadLines(@QueryMap queryMap: HashMap<String, String>) :Response<NewsResponse>
}