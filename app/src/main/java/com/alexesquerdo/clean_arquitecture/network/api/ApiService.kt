package com.alexesquerdo.clean_arquitecture.network.api

import com.alexesquerdo.clean_arquitecture.network.response.movies.NetworkMovie
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkDetail
import com.alexesquerdo.clean_arquitecture.network.response.movies.upcoming.NetworkUpcoming
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    suspend fun getPopularMovies(): Response<NetworkMovie>

    @GET("movie/upcoming")
    suspend fun getUpcoming(): Response<NetworkUpcoming>

    @GET("movie/")
    suspend fun getMovieDetails(@Query("movie_id") movie: Int): Response<NetworkDetail>

}