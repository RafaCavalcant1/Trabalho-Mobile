package com.example.harryp.ui.home.ingredients

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harryp.R
import com.example.harryp.databinding.ActivityIngredientsBinding

class IngredientActivity: AppCompatActivity() {

    private lateinit var binding: ActivityIngredientsBinding
    private val viewModel = IngredientViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityIngredientsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpObservers()

        binding.voltar.setOnClickListener {
            finish()
        }

        // Configuração do RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // 2 colunas
    }

    private fun setUpObservers() {
        viewModel.ingredients.observe(this) { ingredients ->
            ingredients.forEach {
                Log.i("INGREDIENT TAG", it.name)
            }

            val adapter = IngredientAdapter(ingredients)
            binding.recyclerView.adapter = adapter // Usando View Binding para acessar o RecyclerView
        }
        viewModel.errorLoadingHouses.observe(this) {
            Log.e("ERROR TAG", getString(it))
        }
    }

    override fun onResume() {
        viewModel.loadIngredients()
        super.onResume()
    }
}