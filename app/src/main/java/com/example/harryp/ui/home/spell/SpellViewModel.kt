package com.example.harryp.ui.home.spell

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.harryp.model.Ingredient
import com.example.harryp.model.Spells
import com.example.harryp.repository.Repository

class SpellViewModel : ViewModel() {

    private val repository = Repository()
    private val _spells = MutableLiveData<List<Spells>>()
    val spells: LiveData<List<Spells>>
        get() = _spells

    private val _errorLoadingSpells = MutableLiveData<Int>()
    val errorLoadingSpells: LiveData<Int>
        get() = _errorLoadingSpells


    fun loadSpells() {
        repository.getSpells(
            onSuccess = {
                _spells.value = it
            },
            onFailure = {
                _errorLoadingSpells.value = it
            }
        )
    }
}