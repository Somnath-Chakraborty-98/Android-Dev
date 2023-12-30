package com.example.topgamesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1- AdapterView: Recycler (CardView)
        val recyclerview: RecyclerView = findViewById(R.id.rec_view)
        recyclerview.layoutManager = LinearLayoutManager( this, LinearLayoutManager.VERTICAL, true)


        // 2 - Data Source: List of Game objects
        var gamesList: ArrayList<GameModel> = ArrayList()

        val g1 = GameModel(R.drawable.india_flag, "Forza")
        val g2 = GameModel(R.drawable.bangladesh_flag, "GTA 5")
        val g3 = GameModel(R.drawable.new_zealand_flag, "WWZ")
        val g4 = GameModel(R.drawable.south_africa_flag, "Cricket")
        val g5 = GameModel(R.drawable.sri_lanka_flag, "RDR")
        val g6 = GameModel(R.drawable.zimbabwe_flag, "OverWatch")

        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)

        // 3- Adapter - connect data source to adapter view(card view)

        val adapter = GameAdapter(gamesList)
        recyclerview.adapter = adapter

    }
}