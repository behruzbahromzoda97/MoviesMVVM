/*
 *
 *  * Created by Behruz on 10/1/21, 11:53 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 10/1/21, 11:53 AM
 *  */

package tj.behruz.movies.data.api

import io.reactivex.Single
import retrofit2.http.GET
import tj.behruz.movies.domain.models.Feed
import tj.behruz.movies.utils.Constants

interface MoviesApi {

    @GET(Constants.movies)
    fun getMovies():Single<Feed>

}