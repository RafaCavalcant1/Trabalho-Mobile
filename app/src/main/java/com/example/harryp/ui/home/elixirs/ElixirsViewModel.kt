package com.example.harryp.ui.home.elixirs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.harryp.model.Elixirs
import com.example.harryp.repository.Repository

class ElixirsViewModel: ViewModel() {

    private val repository = Repository()
    private val _elirixs = MutableLiveData<List<Elixirs>>()
    val elirixs: LiveData<List<Elixirs>>
        get() = _elirixs

    private val _errorLoadingElirixs = MutableLiveData<Int>()
    val errorLoadingElirixs: LiveData<Int>
        get() = _errorLoadingElirixs


    fun loadElirixs() {
        repository.getElirixs(
            onSuccess = {
                _elirixs.value = it
            },
            onFailure = {
                _errorLoadingElirixs.value = it
            }
        )
    }
}