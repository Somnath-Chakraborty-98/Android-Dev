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
        var listView : ListView = findViewById(R.id.list_view)

        // 2 - Data Source: Array of Strings
        //val world_cup_array = arrayOf(
        //    "India", "Bangladesh", "Sri-lanka", "South Africa", "England", "Australia", "New-Zealand", "Pakistan", "Zimbabwe"
        //)

        // 3 - Adapter
        //val arrayAdapter : ArrayAdapter<*>
        var adapter = MyAdapter(this, generateData())

       // arrayAdapter = ArrayAdapter(
       //     this,
       //     R.layout.list_item,
       //     R.id.textView,
        //    world_cup_array
       // )

        // 4 - connect list view to adapter
        //listView.adapter = arrayAdapter
        listView.adapter = adapter
        adapter.notifyDataSetChanged()

    }

    // Data Source generation
    fun generateData(): ArrayList<CountryModel>{
        var result = ArrayList<CountryModel>()

        val country1 : CountryModel = CountryModel(
            "India", "10", R.drawable.india_flag
        )
        result.add(country1)

        val country2 : CountryModel = CountryModel(
            "South-Africa", "8", R.drawable.south_africa_flag
        )
        result.add(country2)

        val country3 : CountryModel = CountryModel(
            "New-Zealand", "8", R.drawable.new_zealand_flag
        )
        result.add(country3)

        val country4 : CountryModel = CountryModel(
            "Sri-Lanka", "7", R.drawable.sri_lanka_flag
        )
        result.add(country4)

        val country5 : CountryModel = CountryModel(
            "England", "7", R.drawable.england_flag
        )
        result.add(country5)

        val country6 : CountryModel = CountryModel(
            "Australia", "6", R.drawable.australia_flag
        )
        result.add(country6)

        val country7 : CountryModel = CountryModel(
            "Bangladesh", "5", R.drawable.bangladesh_flag
        )
        result.add(country7)

        val country8 : CountryModel = CountryModel(
            "Zimbabwe", "4", R.drawable.zimbabwe_flag
        )
        result.add(country8)

        return result
    }
}