package com.lucasapps.segundaprova.fragments.home

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.lucasapps.segundaprova.databinding.FragmentHomeBinding
import com.lucasapps.segundaprova.adapter.FilmesAdapter
import dagger.hilt.android.AndroidEntryPoint
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

@AndroidEntryPoint
class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var viewModel: HomeViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        val adapter = FilmesAdapter()

        viewModel.filmes.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerview.addOnItemTouchListener(
            RecyclerViewClickListener(binding.recyclerview, object : RecyclerViewClickListener.OnItemClickListener{
                override fun onItemClick(view: View, position: Int) {
                    Toast.makeText(requireContext(), "Toque simples", Toast.LENGTH_SHORT).show()
                }

                override fun onItemLongClick(view: View, position: Int) {
                    Toast.makeText(requireContext(), "Toque longo", Toast.LENGTH_SHORT).show()
                }

            })
        )

        setHasOptionsMenu(true)
        return binding.root
    }

}