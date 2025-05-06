package com.example.skynow.logic.model

data class Weather(
    val realtime: RealtimeResponse.Realtime,
    val daily: DailyResponse.Daily
)