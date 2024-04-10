package com.alexesquerdo.clean_arquitecture.feature.movies

import androidx.lifecycle.ViewModel
import com.alexesquerdo.clean_arquitecture.domain.usecases.UseCaseDetailMovies
import com.alexesquerdo.clean_arquitecture.domain.usecases.UseCasePopularMovies
import com.alexesquerdo.clean_arquitecture.domain.usecases.UseCaseUpcomingMovies
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private val useCaseDetailMovies: UseCaseDetailMovies,
    private val useCasePopularMovies: UseCasePopularMovies,
    private val useCaseUpcomingMovies: UseCaseUpcomingMovies,
) : ViewModel() {
}