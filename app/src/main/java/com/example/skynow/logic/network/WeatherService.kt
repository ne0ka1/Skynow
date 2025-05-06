package com.example.skynow.logic.network

import com.example.skynow.SkynowApplication
import com.example.skynow.logic.model.RealtimeResponse
import com.example.skynow.logic.model.DailyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherService {

    @GET("v2.5/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String,
        @Query("token") token: String = SkynowApplication.TOKEN
    ): Call<RealtimeResponse>

    @GET("v2.5/{lng},{lat}/daily.json")
    fun getDailyWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String,
        @Query("token") token: String = SkynowApplication.TOKEN
    ): Call<DailyResponse>
}