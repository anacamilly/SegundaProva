package com.lucasapps.segundaprova.fragments.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.lucasapps.segundaprova.repository.FilmeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private var repository: FilmeRepository) : ViewModel() {
    var filmes = repository.listAll().asLiveData()
}