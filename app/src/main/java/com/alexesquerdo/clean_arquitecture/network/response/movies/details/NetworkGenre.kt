package com.alexesquerdo.clean_arquitecture.network.response.movies.details


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NetworkGenre(
    @Json(name = "id")
    val id: Int,
    @Json(name = "name")
    val name: String
)