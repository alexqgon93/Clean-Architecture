package com.alexesquerdo.clean_arquitecture.data.repository

import arrow.core.Either
import com.alexesquerdo.clean_arquitecture.data.mappers.toDomainModel
import com.alexesquerdo.clean_arquitecture.data.utils.mapResult
import com.alexesquerdo.clean_arquitecture.domain.common.AppError
import com.alexesquerdo.clean_arquitecture.domain.movies.Movie
import com.alexesquerdo.clean_arquitecture.domain.movies.details.Detail
import com.alexesquerdo.clean_arquitecture.domain.movies.upcoming.Upcoming
import com.alexesquerdo.clean_arquitecture.network.source.DataSourceMovies

class RepositoryMoviesImp(
    private val dataSourceMovies: DataSourceMovies,
) : RepositoryMovies {
    override suspend fun getPopularMovies(): Either<AppError, Movie> =
        dataSourceMovies.getPopularMovies().mapResult { it.toDomainModel() }

    override suspend fun getUpcoming(): Either<AppError, Upcoming> =
        dataSourceMovies.getUpcoming().mapResult { it.toDomainModel() }

    override suspend fun getMovieDetails(movie: Int): Either<AppError, Detail> =
        dataSourceMovies.getMovieDetails(movie = movie).mapResult { it.toDomainModel() }
}