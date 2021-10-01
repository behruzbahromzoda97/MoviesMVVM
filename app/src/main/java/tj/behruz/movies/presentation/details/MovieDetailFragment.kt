/*
 *
 *  * Created by Behruz on 10/1/21, 11:53 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 10/1/21, 11:53 AM
 *  */



package tj.behruz.movies.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tj.behruz.movies.databinding.MoviesDetailsFragmentBinding

class MovieDetailFragment:Fragment() {

    private lateinit var _binding:MoviesDetailsFragmentBinding
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= MoviesDetailsFragmentBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}