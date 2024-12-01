package com.example.harryp.repository

import com.example.harryp.R
import com.example.harryp.model.Elixirs
import com.example.harryp.model.House
import com.example.harryp.model.Ingredient
import com.example.harryp.model.Spells
import com.example.harryp.network.Network
import retrofit2.Call
import retrofit2.Response
class Repository {

    fun getHouses(
        onSuccess: (List<House>) -> Unit,
        onFailure: (Int) -> Unit
    ) {
        Network.service.getHouses().enqueue(object : retrofit2.Callback<List<House>> {

            override fun onResponse(call: Call<List<House>>, response: Response<List<House>>) {
                if (response.isSuccessful) {
                    val houses = response.body()
                    if (houses != null) {
                        onSuccess(houses)
                    } else {
                        onFailure(R.string.error_get_houses)
                    }
                }
            }

            override fun onFailure(call: Call<List<House>>, t: Throwable) {
                onFailure(R.string.error_get_houses)
            }

        })

    }

    fun getIngredients(
        onSuccess: (List<Ingredient>) -> Unit,
        onFailure: (Int) -> Unit
    ) {
        Network.service.getIngredients().enqueue(object : retrofit2.Callback<List<Ingredient>> {

            override fun onResponse(call: Call<List<Ingredient>>, response: Response<List<Ingredient>>) {
                if (response.isSuccessful) {
                    val ingredients = response.body()
                    if (ingredients != null) {
                        onSuccess(ingredients)
                    } else {
                        onFailure(R.string.error_get_ingredients)
                    }
                }
            }

            override fun onFailure(call: Call<List<Ingredient>>, t: Throwable) {
                onFailure(R.string.error_get_ingredients)
            }

        })
    }

    fun getElirixs(
        onSuccess: (List<Elixirs>) -> Unit,
        onFailure: (Int) -> Unit
    ) {
        Network.service.getElirixs().enqueue(object : retrofit2.Callback<List<Elixirs>> {

            override fun onResponse(call: Call<List<Elixirs>>, response: Response<List<Elixirs>>) {
                if (response.isSuccessful) {
                    val elixirs = response.body()
                    if (elixirs != null) {
                        onSuccess(elixirs)
                    } else {
                        onFailure(R.string.error_get_elixirs)
                    }
                }
            }

            override fun onFailure(call: Call<List<Elixirs>>, t: Throwable) {
                onFailure(R.string.error_get_elixirs)
            }

        })
    }

    fun getSpells(
        onSuccess: (List<Spells>) -> Unit,
        onFailure: (Int) -> Unit
    ) {
        Network.service.getSpells().enqueue(object : retrofit2.Callback<List<Spells>> {

            override fun onResponse(call: Call<List<Spells>>, response: Response<List<Spells>>) {
                if (response.isSuccessful) {
                    val spells = response.body()
                    if (spells != null) {
                        onSuccess(spells)
                    } else {
                        onFailure(R.string.error_get_spells)
                    }
                }
            }

            override fun onFailure(call: Call<List<Spells>>, t: Throwable) {
                onFailure(R.string.error_get_spells)
            }

        })
    }
}