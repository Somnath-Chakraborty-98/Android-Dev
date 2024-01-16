package com.example.viewmodeldemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.IllegalArgumentException

class MainActivityViewModelFactory(private val startingNum : Int) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivity::class.java)){
            return MainActivityViewModel(startingNum) as T
        }
        else
            throw IllegalArgumentException("Unknown View Model Class")
    }
}