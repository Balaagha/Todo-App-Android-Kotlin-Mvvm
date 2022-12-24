package com.example.todoapp.ui.feature.home.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.SavedStateHandle
import com.example.todoapp.framework.BaseViewModel
import com.example.todoapp.framework.GenericUiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    applicationData: Application,
) : BaseViewModel(savedStateHandle, applicationData) {

    init {
        Log.d(TAG, "init HomeViewModel")
    }

}