package com.example.recipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


//*** Using Retrofit, the Suspend Key and Coroutines to get Access to Categories

// Retrofit Initialization: Define Retrofit instance
private val retrofit:Retrofit = Retrofit.Builder()
    .baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// Define ApiService interface
interface ApiService {
    @GET("categories.php")
    suspend fun getCategories():CategoriesResponse
}

// Create an instance of ApiService using Retrofit
val apiService:ApiService = retrofit.create(ApiService::class.java)


