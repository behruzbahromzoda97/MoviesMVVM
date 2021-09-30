package tj.behruz.movies.domain.repositories

import io.reactivex.Single
import tj.behruz.movies.domain.models.Feed
import tj.behruz.movies.domain.models.Movies
import tj.behruz.movies.domain.models.MoviesResponse
import tj.behruz.movies.domain.models.Resource

interface MoviesRepository {

    fun getMovies(): Single<Feed>

}