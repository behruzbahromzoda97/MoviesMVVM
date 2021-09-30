package tj.behruz.movies.domain.models

data class Movies(
    val id:String,
    val artistName:String,
    val releaseDate:String,
    val name:String,
    val kind:String,
    val copyright:String,
    val artworkUrl100:String,
    val url:String,
    val genres: List<Genres>
)