package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewDebug.IntToString
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel
    private  lateinit var binding : ActivityMainBinding
    lateinit var factory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        factory = MainActivityViewModelFactory(100)
        viewModel = ViewModelProvider(this, factory).get(MainActivityViewModel::class.java)

        binding.counterTV.text = viewModel.getCurrentCount().toString()
        binding.apply {
            plusBtn.setOnClickListener(){
                counterTV.text = viewModel.getUpdatedCount().toString()
            }
        }
    }
}