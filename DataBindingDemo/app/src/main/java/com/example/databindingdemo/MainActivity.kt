package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        var enteredText : String

        /*binding.btn.setOnClickListener() {
            enteredText = binding.editText.text.toString()
            binding.textView.setText(enteredText)
        }*/

        binding.apply {
            btn.setOnClickListener() {
                enteredText = editText.text.toString()
                textView.setText(enteredText)
            }
        }
    }
}