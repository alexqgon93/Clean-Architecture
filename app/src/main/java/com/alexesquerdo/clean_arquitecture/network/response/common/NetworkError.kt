package com.alexesquerdo.clean_arquitecture.network.response.common


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NetworkError(
    @Json(name = "status_code")
    val statusCode: Int,
    @Json(name = "status_message")
    val statusMessage: String,
    @Json(name = "success")
    val success: Boolean
)