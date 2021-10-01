
package tj.behruz.movies.di

import dagger.Component
import tj.behruz.movies.data.repositories.MoviesRepositoryImpl
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface RepositoryComponent {

    fun inject(moviesRepositoryImpl: MoviesRepositoryImpl)

    @Component.Builder
    interface Builder {
        fun build(): RepositoryComponent
        fun repositoryModule(networkModule: NetworkModule): Builder
    }

}