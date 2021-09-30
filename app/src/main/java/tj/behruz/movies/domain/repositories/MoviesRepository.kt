package tj.behruz.movies.domain.repositories

import io.reactivex.Single
import tj.behruz.movies.domain.models.Feed
import tj.behruz.movies.domain.models.Movies
import tj.behruz.movies.domain.models.MoviesResponse

interface MoviesRepository {

    fun getMovies(): Single<Feed>

}