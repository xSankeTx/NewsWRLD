package com.example.newswrld.Interface

import android.provider.ContactsContract
import android.telecom.Call
import com.example.newswrld.Model.News
import com.example.newswrld.Model.WebSite
import retrofit2.http.GET
import retrofit2.http.Url

interface NewsService {
    @get:GET( "v2/sources?apiKey=28345ad68d5f46adbe353360369a3f41")
    val sources:retrofit2.Call<WebSite>

    @GET
    fun getNewsFromSource(@Url url:String):retrofit2.Call<News>
}