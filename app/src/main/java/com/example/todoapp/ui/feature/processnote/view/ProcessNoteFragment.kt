package com.example.todoapp.ui.feature.processnote.view

import android.util.Log
import com.example.todoapp.framework.BaseMvvmFragment
import com.example.todoapp.data.database.feature.note.model.Note
import com.example.todoapp.databinding.FragmentProcessNoteBinding
import com.example.todoapp.ui.feature.processnote.viewmodel.ProcessNoteViewModel
import com.example.todoapp.utils.Bundles.SELECTED_TASK_KEY
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProcessNoteFragment : BaseMvvmFragment<FragmentProcessNoteBinding, ProcessNoteViewModel>(
    FragmentProcessNoteBinding::inflate,
    ProcessNoteViewModel::class
) {
    val selectedNote by lazy {
        arguments?.get(SELECTED_TASK_KEY) as Note
    }
    override fun setup() {
        Log.d("TAG", "setup => ${selectedNote.title} | ${selectedNote.body}")

        initViewListener()
    }

    private fun initViewListener() {

    }

}