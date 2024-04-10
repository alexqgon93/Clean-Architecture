package com.alexesquerdo.clean_arquitecture.network.source

import arrow.core.Either
import com.alexesquerdo.clean_arquitecture.network.api.ApiService
import com.alexesquerdo.clean_arquitecture.network.response.movies.NetworkMovie
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkDetail
import com.alexesquerdo.clean_arquitecture.network.response.movies.upcoming.NetworkUpcoming
import com.alexesquerdo.clean_arquitecture.network.utils.Failure
import com.alexesquerdo.clean_arquitecture.network.utils.tryCall
import javax.inject.Inject

class DataSourceMoviesImp @Inject constructor(
    private val apiService: ApiService,
) : DataSourceMovies {
    override suspend fun getPopularMovies(): Either<Failure, NetworkMovie> = tryCall {
        apiService.getPopularMovies()
    }

    override suspend fun getUpcoming(): Either<Failure, NetworkUpcoming> = tryCall {
        apiService.getUpcoming()
    }

    override suspend fun getMovieDetails(movie: Int): Either<Failure, NetworkDetail> = tryCall {
        apiService.getMovieDetails(movie = movie)
    }
}