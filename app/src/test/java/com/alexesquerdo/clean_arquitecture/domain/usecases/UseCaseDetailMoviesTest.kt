package com.alexesquerdo.clean_arquitecture.domain.usecases

import com.alexesquerdo.clean_arquitecture.data.repository.RepositoryMovies
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.jupiter.api.BeforeEach

class UseCaseDetailMoviesTest {

    @RelaxedMockK
    private lateinit var repositoryMovies: RepositoryMovies

    private lateinit var useCaseDetailMovies: UseCaseDetailMovies

    @BeforeEach
    fun onBefore() {
        MockKAnnotations.init(this)
        useCaseDetailMovies = UseCaseDetailMovies(repositoryMovies)
    }

}