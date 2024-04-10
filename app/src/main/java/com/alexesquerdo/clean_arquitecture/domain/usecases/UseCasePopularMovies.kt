package com.alexesquerdo.clean_arquitecture.domain.usecases

import com.alexesquerdo.clean_arquitecture.data.repository.RepositoryMovies
import javax.inject.Inject

class UseCasePopularMovies @Inject constructor(
    private val repositoryMovies: RepositoryMovies,
) {
    suspend operator fun invoke() = repositoryMovies.getPopularMovies()
}