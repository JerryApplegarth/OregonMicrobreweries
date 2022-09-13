package com.example.oregonmicrobreweries.domain



import com.example.oregonmicrobreweries.data.local.Brewery
import retrofit2.Call
import retrofit2.http.GET


interface BreweriesApiService {
    @GET("breweries.json")
    fun getBreweries(): Call<List<Brewery>>
}