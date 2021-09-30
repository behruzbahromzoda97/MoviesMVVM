/*
 * *
 *  * Created by Bahromzoda Behruz on 5/1/21 8:07 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 5/1/21 8:04 AM
 *
 */

package tj.behruz.movies.di

import dagger.Component
import tj.behruz.movies.presentation.movies.MoviesViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class])
interface ViewModelComponent {

    fun inject(moviesViewModel: MoviesViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelComponent
        fun repositoryModule(repositoryModule: RepositoryModule): Builder
    }
}