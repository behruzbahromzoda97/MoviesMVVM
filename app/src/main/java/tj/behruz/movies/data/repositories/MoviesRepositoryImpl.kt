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