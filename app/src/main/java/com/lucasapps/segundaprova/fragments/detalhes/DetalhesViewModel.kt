package com.lucasapps.segundaprova.fragments.detalhes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lucasapps.segundaprova.model.Filmes
import com.lucasapps.segundaprova.repository.FilmeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetalhesViewModel @Inject constructor(
    private val repository: FilmeRepository
) : ViewModel() {

    val filmes = MutableLiveData<Filmes>()

}