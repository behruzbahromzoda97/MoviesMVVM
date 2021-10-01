/*
 *
 *  * Created by Behruz on 10/1/21, 11:53 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 10/1/21, 11:53 AM
 *  */


package tj.behruz.movies.domain.models

data class MoviesResponse(
    val title:String,
    val results:List<Movies>,
    val copyright:String,
    val country:String,
    val icon:String
)