package com.alexesquerdo.clean_arquitecture.data.di

import com.alexesquerdo.clean_arquitecture.data.repository.RepositoryMovies
import com.alexesquerdo.clean_arquitecture.data.repository.RepositoryMoviesImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
fun interface RepositoryBindsModule {

    @Binds
    fun bindsRepositoryMovies(repositoryMovies: RepositoryMoviesImp): RepositoryMovies
}