package com.alexesquerdo.clean_arquitecture.domain.usecases

import com.alexesquerdo.clean_arquitecture.data.repository.RepositoryMovies
import javax.inject.Inject

class UseCaseDetailMovies @Inject constructor(
    private val repositoryMovies: RepositoryMovies,
) {
    suspend operator fun invoke(movie: Int) = repositoryMovies.getMovieDetails(movie = movie)
}