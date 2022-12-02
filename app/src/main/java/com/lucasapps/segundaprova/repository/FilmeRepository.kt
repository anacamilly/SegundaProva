package com.lucasapps.segundaprova.repository

import com.lucasapps.segundaprova.dao.FilmesDao
import com.lucasapps.segundaprova.model.Filmes
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FilmeRepository @Inject constructor(private var dao:FilmesDao) : IFilmesRepository {
    override fun listAll(): Flow<List<Filmes>> {
        return dao.listALl()
    }
    override fun create(f: Filmes) {
        dao.create(f)
    }
    override fun update(f: Filmes) {
        dao.update(f)
    }
}

