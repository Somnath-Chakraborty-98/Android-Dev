package com.example.viewmodeldemo

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var counter = 0

    fun getCurrentCount() : Int{
        return counter
    }

    fun getUpdatedCount() : Int{
        return ++counter
    }
}