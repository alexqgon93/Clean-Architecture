package com.alexesquerdo.clean_arquitecture.domain.movies.details

data class ProductionCompany(
    val id: Int,
    val logoPath: String,
    val name: String,
    val originCountry: String
)