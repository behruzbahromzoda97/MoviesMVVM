package tj.behruz.movies.domain.models

data class MoviesResponse(
    val title:String,
    val results:List<Movies>,
    val copyright:String,
    val country:String,
    val icon:String
)