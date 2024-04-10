package com.alexesquerdo.clean_arquitecture.network.source

import arrow.core.Either
import com.alexesquerdo.clean_arquitecture.network.response.movies.NetworkMovie
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkDetail
import com.alexesquerdo.clean_arquitecture.network.response.movies.upcoming.NetworkUpcoming
import com.alexesquerdo.clean_arquitecture.network.utils.Failure

interface DataSourceMovies {

    suspend fun getPopularMovies(): Either<Failure, NetworkMovie>

    suspend fun getUpcoming(): Either<Failure, NetworkUpcoming>

    suspend fun getMovieDetails(movie: Int): Either<Failure, NetworkDetail>
}