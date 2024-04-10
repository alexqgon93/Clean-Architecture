package com.alexesquerdo.clean_arquitecture.network.di

import com.alexesquerdo.clean_arquitecture.network.source.DataSourceMovies
import com.alexesquerdo.clean_arquitecture.network.source.DataSourceMoviesImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
fun interface ApiServicesBindsModule {

    @Binds
    fun bindsApiService(dataSourceMovies: DataSourceMoviesImp): DataSourceMovies
}