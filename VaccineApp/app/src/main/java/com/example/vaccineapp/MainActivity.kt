package com.example.vaccineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 - AdapterView: RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //2 - Data Source: List of VaccineModel Objects
        var vaccineList: ArrayList<VaccineModel> = ArrayList()
        val v1: VaccineModel = VaccineModel("Covid 19", R.drawable.img1)
        val v2: VaccineModel = VaccineModel("Covid 20", R.drawable.img2)
        val v3: VaccineModel = VaccineModel("Covid 21", R.drawable.img3)
        val v4: VaccineModel = VaccineModel("Covid 22", R.drawable.img4)
        val v5: VaccineModel = VaccineModel("Covid 23", R.drawable.img1)
        val v6: VaccineModel = VaccineModel("Covid 24", R.drawable.img2)
        val v7: VaccineModel = VaccineModel("Covid 25", R.drawable.img3)
        val v8: VaccineModel = VaccineModel("Covid 26", R.drawable.img4)
        val v9: VaccineModel = VaccineModel("Covid 27", R.drawable.img1)
        val v10: VaccineModel = VaccineModel("Covid 28", R.drawable.img2)
        val v11: VaccineModel = VaccineModel("Covid 29", R.drawable.img3)
        val v12: VaccineModel = VaccineModel("Covid 30", R.drawable.img4)
        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)
        vaccineList.add(v8)
        vaccineList.add(v9)
        vaccineList.add(v10)
        vaccineList.add(v11)
        vaccineList.add(v12)

        //3 - Adapter
        val adapter = MyAdapter(vaccineList)
        recyclerView.adapter = adapter
    }
}