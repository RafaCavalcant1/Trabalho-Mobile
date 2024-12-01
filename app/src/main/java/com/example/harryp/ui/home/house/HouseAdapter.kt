package com.example.harryp.ui.home.house

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.harryp.R
import com.example.harryp.model.House

class HouseAdapter(private val houses: List<House>) :
    RecyclerView.Adapter<HouseAdapter.HouseViewHolder>() {

    class HouseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val houseNameTextView: TextView = itemView.findViewById(R.id.houseNameTextView)
        val houseColor:TextView = itemView.findViewById(R.id.houseColor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_house, parent, false)
        return HouseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HouseViewHolder, position: Int) {
        val currentHouse = houses[position]
        holder.houseNameTextView.text = currentHouse.name
        holder.houseColor.text = currentHouse.houseColours
    }

    override fun getItemCount(): Int {
        return houses.size
    }
}