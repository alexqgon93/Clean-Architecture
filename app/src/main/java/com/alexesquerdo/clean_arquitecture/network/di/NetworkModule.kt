package com.alexesquerdo.clean_arquitecture.network.di

import com.alexesquerdo.clean_arquitecture.network.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {
    private const val API_KEY = "5144449ae1ba8f90f5eb47d72bcca5a9"
    private const val BASE_URL = "https://api.themoviedb.org/3/"

    @Provides
    fun providesOkHttpClient(): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder().addInterceptor { chain ->
            val original: Request = chain.request()
            val httpUrl: HttpUrl = original.url
            val url = httpUrl.newBuilder().addQueryParameter("api_key", API_KEY).build()
            return@addInterceptor chain.proceed(request = original.newBuilder().url(url).build())
        }.callTimeout(10, TimeUnit.SECONDS).connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
        return okHttpClient.build()
    }

    @Provides
    fun providesHttpLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply { this.level = HttpLoggingInterceptor.Level.BODY }

    @Provides
    fun providesRetrofit(
        baseUrl: String,
        converterFactory: MoshiConverterFactory,
        okHttpClient: OkHttpClient,
    ): Retrofit = Retrofit.Builder().client(okHttpClient).baseUrl(baseUrl)
        .addConverterFactory(converterFactory).build()

    @Provides
    fun providesTHeMovieDBInterface(
        converterFactory: MoshiConverterFactory,
        okHttpClient: OkHttpClient,
    ): ApiService {
        val retrofit = providesRetrofit(
            baseUrl = BASE_URL,
            converterFactory = converterFactory,
            okHttpClient = okHttpClient,
        )
        return retrofit.create(ApiService::class.java)
    }
}