package com.example.harryp.ui.home.spell

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.harryp.R
import com.example.harryp.model.Spells


class SpellAdapter (private val spells: List<Spells>) :
    RecyclerView.Adapter<SpellAdapter.SpellsViewHolder>() {

    class SpellsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val spellsNameTextView: TextView = itemView.findViewById(R.id.spellsNameTextView)
        val spellsEffect: TextView = itemView.findViewById(R.id.spellsEffect)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpellsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_spells, parent, false)
        return SpellsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SpellsViewHolder, position: Int) {
        val currentSpell = spells[position]
        holder.spellsNameTextView.text = currentSpell.name
        holder.spellsEffect.text = currentSpell.effect
    }

    override fun getItemCount(): Int {
        return spells.size
    }
}