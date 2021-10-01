/*
 *
 *  * Created by Behruz on 10/1/21, 11:53 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 10/1/21, 11:53 AM
 *  */


package tj.behruz.movies.data.repositories

import io.reactivex.Single
import tj.behruz.movies.data.api.MoviesApi
import tj.behruz.movies.di.BaseRepository
import tj.behruz.movies.domain.models.Feed
import tj.behruz.movies.domain.repositories.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl: BaseRepository(), MoviesRepository {

    @Inject
    lateinit var moviesApi: MoviesApi

    override fun getMovies(): Single<Feed> {
        return moviesApi.getMovies()
    }

}