package com.alexesquerdo.clean_arquitecture.data.mappers

import com.alexesquerdo.clean_arquitecture.domain.common.ResultMovie
import com.alexesquerdo.clean_arquitecture.domain.movies.Movie
import com.alexesquerdo.clean_arquitecture.domain.movies.details.BelongsToCollection
import com.alexesquerdo.clean_arquitecture.domain.movies.details.Detail
import com.alexesquerdo.clean_arquitecture.domain.movies.details.Genre
import com.alexesquerdo.clean_arquitecture.domain.movies.details.ProductionCompany
import com.alexesquerdo.clean_arquitecture.domain.movies.details.ProductionCountry
import com.alexesquerdo.clean_arquitecture.domain.movies.details.SpokenLanguage
import com.alexesquerdo.clean_arquitecture.domain.movies.upcoming.Dates
import com.alexesquerdo.clean_arquitecture.domain.movies.upcoming.Upcoming
import com.alexesquerdo.clean_arquitecture.network.response.common.NetworkResult
import com.alexesquerdo.clean_arquitecture.network.response.movies.NetworkMovie
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkBelongsToCollection
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkDetail
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkGenre
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkProductionCompany
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkProductionCountry
import com.alexesquerdo.clean_arquitecture.network.response.movies.details.NetworkSpokenLanguage
import com.alexesquerdo.clean_arquitecture.network.response.movies.upcoming.NetworkDates
import com.alexesquerdo.clean_arquitecture.network.response.movies.upcoming.NetworkUpcoming

fun NetworkMovie.toDomainModel() = Movie(
    page = page,
    results = results.map { it.toDomainModel() },
    totalPages = totalPages,
    totalResults = totalResults,
)

fun NetworkResult.toDomainModel() = ResultMovie(
    adult = adult,
    backdropPath = backdropPath,
    genreIds = genreIds,
    id = id,
    originalLanguage = originalLanguage,
    originalTitle = originalTitle,
    overview = overview,
    popularity = popularity,
    posterPath = posterPath,
    releaseDate = releaseDate,
    title = title,
    video = video,
    voteAverage = voteAverage,
    voteCount = voteCount
)

fun NetworkBelongsToCollection.toDomainModel() = BelongsToCollection(
    backdropPath = backdropPath,
    id = id,
    name = name,
    posterPath = posterPath
)

fun NetworkDetail.toDomainModel() = Detail(
    adult = adult,
    backdropPath = backdropPath,
    belongsToCollection = belongsToCollection.toDomainModel(),
    budget = budget,
    genres = genres.map { it.toDomainModel() },
    homepage = homepage,
    id = id,
    imdbId = imdbId,
    originalLanguage = originalLanguage,
    originalTitle = originalTitle,
    overview = overview,
    popularity = popularity,
    posterPath = posterPath,
    productionCompanies = productionCompanies.map { it.toDomainModel() },
    productionCountries = productionCountries.map { it.toDomainModel() },
    releaseDate = releaseDate,
    revenue = revenue,
    runtime = runtime,
    spokenLanguages = spokenLanguages.map { it.toDomainModel() },
    status = status,
    tagline = tagline,
    title = title,
    video = video,
    voteAverage = voteAverage,
    voteCount = voteCount
)

fun NetworkProductionCountry.toDomainModel() = ProductionCountry(iso = iso31661, name = name)

fun NetworkSpokenLanguage.toDomainModel() = SpokenLanguage(
    englishName = englishName,
    iso = iso6391,
    name = name
)

fun NetworkProductionCompany.toDomainModel() = ProductionCompany(
    id = id,
    logoPath = logoPath,
    name = name,
    originCountry = originCountry
)

fun NetworkGenre.toDomainModel() = Genre(id = id, name = name)

fun NetworkUpcoming.toDomainModel() = Upcoming(
    dates = dates.toDomainModel(),
    page = page,
    results = results.map { it.toDomainModel() },
    totalPages = totalPages,
    totalResults = totalResults
)

fun NetworkDates.toDomainModel() = Dates(maximum = maximum, minimum = minimum)