/*
 *
 *  * Created by Behruz on 10/1/21, 11:53 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 10/1/21, 11:53 AM
 *  */


package tj.behruz.movies.domain.repositories

import io.reactivex.Single
import tj.behruz.movies.domain.models.Feed

interface MoviesRepository {

    fun getMovies(): Single<Feed>

}