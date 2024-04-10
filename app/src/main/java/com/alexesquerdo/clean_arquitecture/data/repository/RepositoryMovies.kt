package com.alexesquerdo.clean_arquitecture.data.repository

import arrow.core.Either
import com.alexesquerdo.clean_arquitecture.domain.common.AppError
import com.alexesquerdo.clean_arquitecture.domain.movies.Movie
import com.alexesquerdo.clean_arquitecture.domain.movies.details.Detail
import com.alexesquerdo.clean_arquitecture.domain.movies.upcoming.Upcoming

interface RepositoryMovies {
    suspend fun getPopularMovies(): Either<AppError, Movie>
    suspend fun getUpcoming(): Either<AppError, Upcoming>
    suspend fun getMovieDetails(movie: Int): Either<AppError, Detail>
}