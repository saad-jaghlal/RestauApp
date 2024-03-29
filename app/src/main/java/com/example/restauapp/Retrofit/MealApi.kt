package com.example.restauapp.Retrofit


import com.example.restauapp.Models.CategoryList
import com.example.restauapp.Models.MealsByCategoryList
import com.example.restauapp.Models.MealList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {
    @GET("random.php")
    fun getRandomMeal(): Call<MealList>
    @GET("lookup.php?")
    fun getMealById(@Query("i") id:String):Call<MealList>
    @GET( "filter.php?")
    fun getPopularItems(@Query("c" ) categoryName: String): Call<MealsByCategoryList>
    @GET("categories.php")
    fun getCategories():Call<CategoryList>
    @GET("filter.php?")
    fun getMealsByCategory(@Query("i") category:String):Call<MealsByCategoryList>
}