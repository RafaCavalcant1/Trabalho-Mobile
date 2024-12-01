package com.example.harryp.ui.home.house

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.harryp.model.House
import com.example.harryp.repository.Repository

class HousesViewModel: ViewModel() {

    private val repository = Repository()
    private val _houses = MutableLiveData<List<House>>()
    val houses: LiveData<List<House>>
        get() = _houses

    private val _errorLoadingHouses = MutableLiveData<Int>()
    val errorLoadingHouses: LiveData<Int>
        get() = _errorLoadingHouses


    fun loadHouses() {
        repository.getHouses(
            onSuccess = {
                _houses.value = it
            },
            onFailure = {
                _errorLoadingHouses.value = it
            }
        )
    }
}
