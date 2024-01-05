package com.example.sharedprefrencedemo

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name_tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText : EditText = findViewById(R.id.editText)
        val btn : Button = findViewById(R.id.btnChangeName)
        name_tv = findViewById(R.id.lastUsername)
        getNameFromSharedPrtefrences()

        btn.setOnClickListener(){
            val enteredText : String = editText.text.toString()
            saveNameInSharedPrefrences(enteredText)
        }
    }

    private fun saveNameInSharedPrefrences(enteredText: String) {
        val sharedPreferences : SharedPreferences = getSharedPreferences("UserNames", MODE_PRIVATE)

        val editor : SharedPreferences.Editor = sharedPreferences.edit()

        editor.putString("username", enteredText)
        editor.apply()
        name_tv.text = enteredText
    }

    private fun getNameFromSharedPrtefrences(){
        val sharedPreferences : SharedPreferences = getSharedPreferences("UserNames", MODE_PRIVATE)

        val lastUsername : String? = sharedPreferences.getString("username", "")

        name_tv.text = lastUsername
    }
}