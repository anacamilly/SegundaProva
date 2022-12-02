package com.lucasapps.segundaprova.di

import android.app.Application
import com.lucasapps.segundaprova.dao.FilmesDao
import com.lucasapps.segundaprova.database.DatabaseApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
object Module {
    @Singleton
    @Provides
    fun getDatabase(applicationContext: Application):DatabaseApp {
        return DatabaseApp.invoke(applicationContext)
    }

    @Singleton
    @Provides
    fun getDao(database: DatabaseApp):FilmesDao{
        return database.FilmesDao()
    }
}