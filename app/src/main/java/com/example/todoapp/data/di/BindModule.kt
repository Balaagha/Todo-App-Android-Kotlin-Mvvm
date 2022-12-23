package com.example.todoapp.data.di

import com.example.todoapp.data.feature.movie.repository.CastDataRepository
import com.example.todoapp.data.feature.movie.repository.CastDataRepositoryImpl
import com.example.todoapp.data.feature.movie.repository.MoviesDataRepository
import com.example.todoapp.data.feature.movie.repository.MoviesDataRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class BindModule {
    @Singleton
    @Binds
    abstract fun bindMovieDataRepository(repo: MoviesDataRepositoryImpl): MoviesDataRepository

    @Singleton
    @Binds
    abstract fun bindCastDataRepository(repo: CastDataRepositoryImpl): CastDataRepository

}