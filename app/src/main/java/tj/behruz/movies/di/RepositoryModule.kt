

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