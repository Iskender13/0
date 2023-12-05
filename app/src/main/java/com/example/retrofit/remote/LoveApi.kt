package com.example.retrofit.remote

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
/*'X-RapidAPI-Key': 'adb0bdc4e8msh4e7ba6972056bc5p16ba26jsn8364cfff0d4e',
'X-RapidAPI-Host': 'love-calculator.p.rapidapi.com'*/

interface LoveApi {
    @GET("getPercentage")
    fun getLove(@Query("sname") secondName: String, @Query("fname") firstName: String,
                @Header ("X-RapidAPI-Key")
                key: String= "adb0bdc4e8msh4e7ba6972056bc5p16ba26jsn8364cfff0d4e",
                @Header ("X-RapidAPI-Host") host: String="love-calculator.p.rapidapi.com"): Call<LoveModel>
}