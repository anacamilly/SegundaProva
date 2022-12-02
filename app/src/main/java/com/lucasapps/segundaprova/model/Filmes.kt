package com.lucasapps.segundaprova.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Filmes(var titulo:String, var genero:String, var duracao_min:Int, var ano:Int, var diretor:String){
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0
}