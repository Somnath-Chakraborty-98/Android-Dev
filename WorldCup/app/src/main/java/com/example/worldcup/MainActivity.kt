package com.example.worldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1 - Adapter View: ListView
        //var listView : ListView = findViewById(R.id.list_view)

        // 2 - Data Source: Array of Strings
        //val world_cup_array = arrayOf(
        //    "India", "Bangladesh", "Sri-lanka", "South Africa", "England", "Australia", "New-Zealand", "Pakistan", "Zimbabwe"
        //)

        // 3 - Adapter
        //val arrayAdapter : ArrayAdapter<*>

       // arrayAdapter = ArrayAdapter(
       //     this,
       //     R.layout.list_item,
       //     R.id.textView,
        //    world_cup_array
       // )

        // 4 - connect list view to adapter
        //listView.adapter = arrayAdapter
    }
}