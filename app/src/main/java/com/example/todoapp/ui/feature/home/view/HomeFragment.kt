package com.example.todoapp.ui.feature.home.view

import androidx.navigation.fragment.findNavController
import com.example.todoapp.data.database.feature.note.model.Note
import com.example.todoapp.databinding.FragmentHomeBinding
import com.example.todoapp.framework.BaseMvvmFragment
import com.example.todoapp.ui.feature.home.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseMvvmFragment<FragmentHomeBinding,HomeViewModel>(
    FragmentHomeBinding::inflate,
    HomeViewModel::class
) {
    override fun setup() {
        binding.apply {

        }
        initViewListener()
    }

    private fun initViewListener() {
        binding.apply {
            addBtn.setOnClickListener {
                val action = HomeFragmentDirections.actionMainFragmentToProcessNoteFragment()
                findNavController().navigate(action)
            }
        }
    }

}