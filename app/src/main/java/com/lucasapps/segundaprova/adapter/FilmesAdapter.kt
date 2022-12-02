package com.lucasapps.segundaprova.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.lucasapps.segundaprova.databinding.FilmesItemListBinding
import com.lucasapps.segundaprova.model.Filmes

class FilmesAdapter: ListAdapter<Filmes, FilmesAdapter.FilmesViewHolder>(FilmesDiffUtilCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmesViewHolder {
        return FilmesViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: FilmesViewHolder, position: Int) {
        val filmes = getItem(position)
        holder.bind(filmes)
    }

    class FilmesViewHolder private constructor(var binding:FilmesItemListBinding ) : RecyclerView.ViewHolder(binding.root){

        fun bind(Filmes:Filmes) {
            binding.textViewTituloFilme.text = Filmes.titulo

            binding.textViewTituloFilme.setOnClickListener {
                Toast.makeText(binding.root.context, "CLicou no texto", Toast.LENGTH_SHORT).show()
            }
        }

        companion object {
            fun from(parent: ViewGroup): FilmesViewHolder {

                val inflater = LayoutInflater.from(parent.context)
                val binding = FilmesItemListBinding.inflate(inflater, parent, false)
                return FilmesViewHolder(binding)
            }
        }
    }

    class FilmesDiffUtilCallback : DiffUtil.ItemCallback<Filmes>(){
        override fun areItemsTheSame(oldItem: Filmes, newItem: Filmes): Boolean {
            return oldItem.id.equals(newItem.id)
        }

        override fun areContentsTheSame(oldItem: Filmes, newItem: Filmes): Boolean {
            return oldItem.equals(newItem)
        }

    }
}