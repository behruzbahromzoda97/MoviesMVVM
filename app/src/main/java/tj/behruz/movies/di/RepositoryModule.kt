/*
 * *
 *  * Created by Bahromzoda Behruz on 5/1/21 8:07 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 5/1/21 8:02 AM
 *
 */

package tj.behruz.movies.di

import dagger.Module
import dagger.Provides
import tj.behruz.movies.data.repositories.MoviesRepositoryImpl

@Module
object RepositoryModule {


    @Provides
    fun provideMovieRepositoryImpl(): MoviesRepositoryImpl {
        return MoviesRepositoryImpl()
    }


}