package com.example.todoapp.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.todoapp.utils.helper.SingleLiveEvent

abstract class BaseViewModel : ViewModel() {

  val _events = SingleLiveEvent<Events>()
  val events = _events as LiveData<Events>

}