package com.example.todoapp.ui.feature.home.view

import android.util.Log
import com.example.todoapp.base.BaseMvvmFragment
import com.example.todoapp.databinding.FragmentHomeBinding
import com.example.todoapp.ui.feature.home.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseMvvmFragment<FragmentHomeBinding,HomeViewModel>(
    FragmentHomeBinding::inflate,
    HomeViewModel::class
) {
    override fun setup() {
        Log.d("TAG","setup")
    }

}