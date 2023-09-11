package com.example.vaccineapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val itemList : ArrayList<VaccineModel>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var vaccineImage: ImageView
        var vaccineTitle: TextView

        init{
            vaccineImage = itemView.findViewById(R.id.imageViewRV)
            vaccineTitle = itemView.findViewById(R.id.titleTest)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item_layout,parent,false)

        return MyViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineTitle.text = itemList[position].name
        holder.vaccineImage.setImageResource(itemList[position].img)
    }
}