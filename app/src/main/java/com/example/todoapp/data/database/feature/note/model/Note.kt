package com.example.todoapp.data.database.feature.note.model

import java.io.Serializable

data class Note(val id: Int, val title: String, val body: String): Serializable
