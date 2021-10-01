/*
 *
 *  * Created by Behruz on 10/1/21, 11:53 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 10/1/21, 11:53 AM
 *  */


package tj.behruz.movies.presentation.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import tj.behruz.movies.data.repositories.MoviesRepositoryImpl
import tj.behruz.movies.di.BaseViewModel
import tj.behruz.movies.domain.models.Feed
import tj.behruz.movies.domain.models.Resource
import javax.inject.Inject

class MoviesViewModel:BaseViewModel() {

    @Inject
    lateinit var moviesRepositoryImpl: MoviesRepositoryImpl

    private val movies = MutableLiveData<Resource<Feed>>()
    private val compositeDisposable = CompositeDisposable()

    init {
        fetchMovies()
    }

   fun fetchMovies() {
        movies.postValue(Resource.loading(null))
        compositeDisposable.add(
            moviesRepositoryImpl.getMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ userList ->
                    movies.postValue(Resource.success(userList))
                }, {
                    movies.postValue(Resource.error("Something Went Wrong", null))
                })
        )
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    fun getMovies(): LiveData<Resource<Feed>> {
        return movies
    }




}