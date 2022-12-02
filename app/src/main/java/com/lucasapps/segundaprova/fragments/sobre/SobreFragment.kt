package com.lucasapps.segundaprova.fragments.sobre

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.lucasapps.segundaprova.databinding.FragmentSobreBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SobreFragment : Fragment() {

    private lateinit var _binding: FragmentSobreBinding
    private lateinit var _viewmodel: SobreViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewmodel = ViewModelProvider(this).get(SobreViewModel::class.java)
        _binding = FragmentSobreBinding.inflate(inflater, container, false)

        _binding.viewmodel = _viewmodel
        _binding.lifecycleOwner = this

        return _binding.root
    }
}