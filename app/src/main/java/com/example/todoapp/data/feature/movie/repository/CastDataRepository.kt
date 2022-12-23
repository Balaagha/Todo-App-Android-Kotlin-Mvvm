package com.example.todoapp.data.feature.movie.repository

import com.example.todoapp.data.database.feature.cast.model.CastItem
import com.example.todoapp.data.database.feature.cast.model.CachedCastResponse

interface CastDataRepository {
    suspend fun saveCast(cast: List<CachedCastResponse>)
    suspend fun getCastDetails(id: Int): List<CastItem>
}