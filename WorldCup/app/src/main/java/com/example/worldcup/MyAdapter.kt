package com.example.worldcup

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(private var activity: MainActivity, private var items: ArrayList<CountryModel>) : BaseAdapter(){
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): CountryModel {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View?
        val viewHolder: ViewHolder

        if(convertView == null){
            val inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.list_item, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var countries = items[position]
        viewHolder.txtName?.text = countries.name
        viewHolder.txtCupWin?.text = countries.cuspWins
        viewHolder.imgFlag?.setImageResource(countries.flag_img)

        view?.setOnClickListener(){
            var toast = Toast.makeText(activity, " You Choose: ${countries.name}", Toast.LENGTH_SHORT ).show()
        }

        return view as View
    }

    private class ViewHolder(row : View?){
        var txtName: TextView? = null
        var txtCupWin: TextView? = null
        var imgFlag: ImageView? = null

        init {
            this.txtName = row?.findViewById(R.id.countryName)
            this.txtCupWin = row?.findViewById(R.id.totalWins)
            this.imgFlag = row?.findViewById(R.id.imageView)
        }
    }


}