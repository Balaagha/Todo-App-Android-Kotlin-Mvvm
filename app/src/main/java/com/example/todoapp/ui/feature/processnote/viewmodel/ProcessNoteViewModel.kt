package com.example.todoapp.ui.feature.processnote.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.SavedStateHandle
import com.example.todoapp.data.database.feature.note.model.Note
import com.example.todoapp.framework.BaseViewModel
import com.example.todoapp.framework.GenericUiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ProcessNoteViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    applicationData: Application,
) : BaseViewModel(savedStateHandle, applicationData) {

    fun updateNoteById( updatedItem: Note) {
//        TODO("Implement update note by id")
        Log.d("myTag","updateNoteById is called with ${updatedItem.id}")
    }

    fun saveNote( addedNote: Note) {
//        TODO("Implement add note by id")
        Log.d("myTag","saveNote is called with ${addedNote.id}")
    }

    fun showSnackBar(value: String) {
        singleTimeUiEvent.postValue(
            GenericUiEvent.SnackBar(value)
        )
    }

}