/*
 * *
 *  * Created by Bahromzoda Behruz on 5/1/21 8:07 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 5/1/21 8:02 AM
 *
 */

package tj.behruz.movies.di

import androidx.lifecycle.ViewModel
import tj.behruz.movies.presentation.movies.MoviesViewModel

abstract class BaseViewModel: ViewModel() {
    private val injector = DaggerViewModelComponent.builder().repositoryModule(RepositoryModule).build()


    init {
        injectViewModels()
    }

    private fun injectViewModels() {
        when (this) {
            is MoviesViewModel ->injector.inject(this)
        }

    }


}