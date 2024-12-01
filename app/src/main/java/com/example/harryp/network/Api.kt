package com.example.harryp.network

import com.example.harryp.model.Elixirs
import com.example.harryp.model.House
import com.example.harryp.model.Ingredient
import com.example.harryp.model.Spells
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("/Houses")
    fun getHouses(): Call<List<House>>

    @GET("/Ingredients")
    fun getIngredients(): Call<List<Ingredient>>

    @GET("/Elixirs")
    fun getElirixs(): Call<List<Elixirs>>

    @GET("/Spells")
    fun getSpells(): Call<List<Spells>>
}

