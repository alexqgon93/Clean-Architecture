package com.alexesquerdo.clean_arquitecture.domain.movies.details

data class BelongsToCollection(
    val backdropPath: String,
    val id: Int,
    val name: String,
    val posterPath: String
)