package com.example.todoapp.base

sealed class Events {
  object Loading : Events()

  object Done : Events()
}
