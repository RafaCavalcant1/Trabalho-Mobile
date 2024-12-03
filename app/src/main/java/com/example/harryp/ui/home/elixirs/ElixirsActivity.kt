package com.example.harryp.ui.home.elixirs

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harryp.R
import com.example.harryp.databinding.ActivityElixirsBinding
import com.example.harryp.ui.home.house.HouseAdapter

class ElixirsActivity: AppCompatActivity() {

    private lateinit var binding: ActivityElixirsBinding
    private val viewModel = ElixirsViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityElixirsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpObservers()

        binding.voltar.setOnClickListener {
            finish()
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
    }

    private fun setUpObservers() {
        viewModel.elirixs.observe(this) { elirixs ->
            elirixs.forEach {
                Log.i("ELIRIX TAG", it.name )
            }

            val adapter = ElixirsAdapter(elirixs)
            binding.recyclerView.adapter = adapter
        }
        viewModel.errorLoadingElirixs.observe(this) {
            Log.e("ERROR TAG", getString(it))
        }
    }

    override fun onResume() {
        viewModel.loadElirixs()
        super.onResume()
    }
}