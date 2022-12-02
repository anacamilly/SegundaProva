package com.lucasapps.segundaprova.fragments.cadastra

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.lucasapps.segundaprova.R
import com.lucasapps.segundaprova.databinding.FragmentCadastraBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CadastraFragment : Fragment() {

    lateinit var viewModel: CadastraViewModel
    lateinit var binding: FragmentCadastraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(CadastraViewModel::class.java)
        binding = FragmentCadastraBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        binding.buttonCadastra.setOnClickListener{

            viewModel.cadastrarButtonEvent()
            Navigation.findNavController(it).navigate(R.id.action_cadastraFragment2_to_homeFragment2)
            Toast.makeText(requireContext(), " Filme cadastrado!", Toast.LENGTH_SHORT).show()
        }
        // Inflate the layout for this fragment
        return binding.root
    }
}