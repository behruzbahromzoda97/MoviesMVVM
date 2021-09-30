/*
 * *
 *  * Created by Bahromzoda Behruz on 5/1/21 8:07 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 5/1/21 8:02 AM
 *
 */

package tj.behruz.movies.di

import tj.behruz.movies.data.repositories.MoviesRepositoryImpl


abstract class BaseRepository {

    private val injector = DaggerRepositoryComponent.builder().repositoryModule(NetworkModule).build()

    init {
        injectRepositories()
    }


    private fun injectRepositories() {
        when (this)
        {
            is MoviesRepositoryImpl->injector.inject(this)
        }
    }

}