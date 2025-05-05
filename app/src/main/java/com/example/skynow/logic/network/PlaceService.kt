package com.example.skynow.logic.network

import com.example.skynow.SkynowApplication
import com.example.skynow.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place")
    fun searchPlaces(
        @Query("query") query: String,
        @Query("token") token: String = SkynowApplication.TOKEN,
        @Query("lang") lang: String = "zh_CN"
    ): Call<PlaceResponse>
}