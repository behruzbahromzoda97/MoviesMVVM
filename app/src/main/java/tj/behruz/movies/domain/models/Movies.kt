/*
 *
 *  * Created by Behruz on 10/1/21, 11:53 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 10/1/21, 11:53 AM
 *  */


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