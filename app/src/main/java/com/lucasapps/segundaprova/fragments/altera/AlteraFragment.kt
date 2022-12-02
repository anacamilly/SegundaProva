package com.lucasapps.segundaprova.fragments.altera

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.lucasapps.segundaprova.R
import com.lucasapps.segundaprova.databinding.FragmentAlteraBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlteraFragment : Fragment() {

    private lateinit var viewModel: AlteraViewModel
    lateinit var binding: FragmentAlteraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AlteraViewModel::class.java)
        binding = FragmentAlteraBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        binding.buttonAlterar.setOnClickListener{
            viewModel.alterarButtonEvent(viewModel.filmes.value!!)
            Navigation.findNavController(it).navigate(R.id.action_alteraFragment_to_homeFragment2)
            Toast.makeText(requireContext(), "filme alterado com sucesso!", Toast.LENGTH_SHORT).show()
        }


        // Inflate the layout for this fragment

        setHasOptionsMenu(true)
        return binding.root
    }

}