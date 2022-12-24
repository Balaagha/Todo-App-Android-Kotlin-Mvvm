package com.example.todoapp.ui.feature.processnote.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.SavedStateHandle
import com.example.todoapp.framework.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ProcessNoteViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    applicationData: Application,
) : BaseViewModel(savedStateHandle, applicationData) {

    init {
        Log.d(TAG, "init HomeViewModel")
    }

}