package com.example.todoapp.ui.feature.home.view

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.example.todoapp.R
import com.example.todoapp.framework.BaseMvvmFragment
import com.example.todoapp.data.database.feature.note.model.Note
import com.example.todoapp.databinding.FragmentHomeBinding
import com.example.todoapp.framework.GenericUiEvent
import com.example.todoapp.ui.feature.home.viewmodel.HomeViewModel
import com.example.todoapp.utils.Bundles.SELECTED_TASK_KEY
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
                val bundle = Bundle().apply {
                    putSerializable(SELECTED_TASK_KEY, Note(1,"sad","dsad"))
                }
                findNavController().navigate(R.id.processNoteFragment,bundle)
            }
        }
    }

}