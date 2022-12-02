package com.lucasapps.segundaprova.dao

import androidx.room.*
import com.lucasapps.segundaprova.model.Filmes
import kotlinx.coroutines.flow.Flow

@Dao
interface FilmesDao {
    @Query("SELECT * FROM filmes")
    fun listALl(): Flow<List<Filmes>>
    @Query("SELECT * FROM filmes WHERE id=:id")
    fun findById(id:Long):Filmes?
    @Delete
    fun delete(f: Filmes)
    @Query("DELETE FROM Filmes where id=:id")
    fun deleteById(id:Long)
    @Query("DELETE FROM Filmes")
    fun deleteAll()
    @Update
    fun update(f: Filmes)
    @Insert
    fun create(f:Filmes)
}