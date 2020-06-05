package com.example.newswrld.Common

import com.example.newswrld.Interface.NewsService
import com.example.newswrld.Remote.RetrofitClient

object Common {
    val BASE_URL = "https://newsapi.org/"
    val API_KEY = "28345ad68d5f46adbe353360369a3f41"

    val newsService:NewsService
        get()=RetrofitClient.getClient(BASE_URL).create(NewsService::class.java)

    fun getNewsAPI(source:String):String{
        val apiUrl=StringBuilder("https://newsapi.org/v2/top-headlines?sources=")
            .append(source)
            .append("&apiKey=")
            .append(API_KEY)
            .toString()
        return apiUrl
    }
}

