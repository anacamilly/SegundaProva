package com.lucasapps.segundaprova.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lucasapps.segundaprova.dao.FilmesDao
import com.lucasapps.segundaprova.model.Filmes


@Database(entities = [Filmes::class], version = 1, exportSchema = false)
 abstract class DatabaseApp : RoomDatabase() {
 abstract fun FilmesDao(): FilmesDao

 companion object {
  @Volatile private var instance: DatabaseApp? = null
  private val LOCK = Any()

  operator fun invoke(context: Context)= instance ?: synchronized(LOCK){
   instance ?: buildDatabase(context).also { instance = it}
  }
  private fun buildDatabase(context: Context) =
   Room.databaseBuilder(context, DatabaseApp::class.java, "database.db" ).fallbackToDestructiveMigration().build()
 }
 }