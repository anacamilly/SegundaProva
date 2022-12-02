package com.lucasapps.segundaprova.repository

import com.lucasapps.segundaprova.model.Filmes
import kotlinx.coroutines.flow.Flow

interface IFilmesRepository {
    fun listAll(): Flow<List<Filmes>>
    fun create(f:Filmes)
    fun update(f:Filmes)
}