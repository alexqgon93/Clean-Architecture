package com.alexesquerdo.clean_arquitecture.network.response.movies


import com.alexesquerdo.clean_arquitecture.network.response.common.NetworkResult
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NetworkMovie(
    @Json(name = "page")
    val page: Int,
    @Json(name = "results")
    val results: List<NetworkResult>,
    @Json(name = "total_pages")
    val totalPages: Int,
    @Json(name = "total_results")
    val totalResults: Int,
)