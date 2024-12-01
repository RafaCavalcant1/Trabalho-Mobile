package com.example.harryp.ui.home.ingredients

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.harryp.model.Ingredient
import com.example.harryp.repository.Repository

class IngredientViewModel : ViewModel() {

    private val repository = Repository()
    private val _ingredients = MutableLiveData<List<Ingredient>>()
    val ingredients: LiveData<List<Ingredient>>
        get() = _ingredients

    private val _errorLoadingIngredients = MutableLiveData<Int>()
    val errorLoadingHouses: LiveData<Int>
        get() = _errorLoadingIngredients


    fun loadIngredients() {
        repository.getIngredients(
            onSuccess = {
                _ingredients.value = it
            },
            onFailure = {
                _errorLoadingIngredients.value = it
            }
        )
    }
}