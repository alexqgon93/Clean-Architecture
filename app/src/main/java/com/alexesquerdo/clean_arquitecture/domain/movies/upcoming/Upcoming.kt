package com.alexesquerdo.clean_arquitecture.domain.movies.upcoming

import com.alexesquerdo.clean_arquitecture.domain.common.ResultMovie

data class Upcoming(
    val dates: Dates,
    val page: Int,
    val results: List<ResultMovie>,
    val totalPages: Int,
    val totalResults: Int,
)