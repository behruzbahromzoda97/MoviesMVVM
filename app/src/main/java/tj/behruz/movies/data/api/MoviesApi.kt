package tj.behruz.movies.data.api

import io.reactivex.Single
import retrofit2.http.GET
import tj.behruz.movies.domain.models.Feed
import tj.behruz.movies.domain.models.MoviesResponse
import tj.behruz.movies.domain.models.Resource

interface MoviesApi {

    @GET("explicit.json")
    fun getMovies():Single<Feed>

}