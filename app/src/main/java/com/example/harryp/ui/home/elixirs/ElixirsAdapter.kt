package com.example.harryp.ui.home.elixirs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.harryp.R
import com.example.harryp.model.Elixirs

class ElixirsAdapter(private val elirixs: List<Elixirs>) :
    RecyclerView.Adapter<ElixirsAdapter.ElirixsViewHolder>() {

    class ElirixsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val elirixsNameTextView: TextView = itemView.findViewById(R.id.elirixsNameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElirixsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_elixirs, parent, false)
        return ElirixsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ElirixsViewHolder, position: Int) {
        val currentElirixs = elirixs[position]
        holder.elirixsNameTextView.text = currentElirixs.name
    }

    override fun getItemCount(): Int {
        return elirixs.size
    }
}