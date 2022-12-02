package com.lucasapps.segundaprova.fragments.cadastra

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lucasapps.segundaprova.model.Filmes
import com.lucasapps.segundaprova.repository.FilmeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class CadastraViewModel @Inject constructor(private var repository: FilmeRepository) : ViewModel() {
    var filmes = MutableLiveData<Filmes>()

    init {
        filmes.value = Filmes("","",0,0,"")
    }

    fun cadastrarButtonEvent(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                filmes.value?.let { repository.create(it) }
            }
        }
    }
}