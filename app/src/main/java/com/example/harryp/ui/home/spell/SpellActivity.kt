package com.example.harryp.ui.home.spell

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harryp.R
import com.example.harryp.databinding.ActivitySpellsBinding

class SpellActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySpellsBinding
    private val viewModel = SpellViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySpellsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpObservers()

        binding.voltar.setOnClickListener {
            finish()
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 colunas
    }

    private fun setUpObservers() {
        viewModel.spells.observe(this) { spells ->
            spells.forEach {
                Log.i("SPELL TAG", it.name)
            }

            val adapter = SpellAdapter(spells)
            binding.recyclerView.adapter = adapter // Usando View Binding para acessar o RecyclerView
        }
        viewModel.errorLoadingSpells.observe(this) {
            Log.e("ERROR TAG", getString(it))
        }
    }

    override fun onResume() {
        viewModel.loadSpells()
        super.onResume()
    }
}