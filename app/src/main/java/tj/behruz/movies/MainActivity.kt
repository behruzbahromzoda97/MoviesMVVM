/*
 *
 *  * Created by Behruz on 10/1/21, 11:53 AM
 *  * Copyright (c) 2021 . All rights reserved.
 *  * Last modified 10/1/21, 11:53 AM
 *  */


package tj.behruz.movies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import tj.behruz.movies.databinding.ActivityMainBinding
import tj.behruz.movies.utils.ConnectionLiveData
import tj.behruz.movies.utils.Constants
import tj.behruz.movies.utils.Utils

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var connection: ConnectionLiveData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        checkNetworkConnection()

    }

    private fun checkNetworkConnection() {
        connection = ConnectionLiveData(application)
        connection.observe(this, { isConnected ->
            showInternetStatus(isConnected)
            Utils.status.postValue(isConnected)
        })
    }

    private fun showInternetStatus(status: Boolean) {
        if (!status) {
           Utils.showErrorMessage (binding.root,Constants.noInternConnection)
        }

    }

}