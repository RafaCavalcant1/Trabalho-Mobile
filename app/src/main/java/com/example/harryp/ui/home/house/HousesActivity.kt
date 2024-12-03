package com.example.harryp.ui.home.house
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harryp.R
import com.example.harryp.databinding.ActivityHousesBinding

class HousesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHousesBinding
    private val viewModel = HousesViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHousesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpObservers()

        binding.voltar.setOnClickListener {
            finish()
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
    }

    private fun setUpObservers() {
        viewModel.houses.observe(this) { houses ->
            houses.forEach {
                Log.i("HOUSE TAG", it.name)
                Log.i("HOUSE TAG", it.houseColours)
            }
            //binding.response.text = houses.toString() // Comentado para usar o RecyclerView
            val adapter = HouseAdapter(houses)
            binding.recyclerView.adapter = adapter // Usando View Binding para acessar o RecyclerView
        }
        viewModel.errorLoadingHouses.observe(this) {
            Log.e("ERROR TAG", getString(it))
        }
    }

    override fun onResume() {
        viewModel.loadHouses()
        super.onResume()
    }
}
