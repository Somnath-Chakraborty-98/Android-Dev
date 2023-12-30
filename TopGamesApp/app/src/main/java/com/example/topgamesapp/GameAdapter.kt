package com.example.topgamesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gameList: ArrayList<GameModel>) : RecyclerView.Adapter<GameAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        // helps to find view instead of find view by id
        var gameImg : ImageView
        var gameTitle : TextView

        init {
            gameImg = itemView.findViewById(R.id.card_view_img)
            gameTitle = itemView.findViewById(R.id.text_view_card)

            itemView.setOnClickListener(){
                Toast.makeText(
                    itemView.context, "You Choose : ${gameList[adapterPosition].txtCard}"
                    , Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout, parent, false)
        return  MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return  gameList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gameImg.setImageResource(gameList[position].imgCard)
        holder.gameTitle.setText(gameList[position].txtCard)
    }


}