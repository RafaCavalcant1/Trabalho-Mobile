package com.example.harryp.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.harryp.R
import com.example.harryp.databinding.ActivityMainBinding
import com.example.harryp.ui.home.elixirs.ElixirsActivity
import com.example.harryp.ui.home.house.HousesActivity
import com.example.harryp.ui.home.ingredients.IngredientActivity
import com.example.harryp.ui.home.spell.SpellActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.sairBotao.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            finish()
        }

        binding.sair.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            finish()
        }

        binding.housesImagem.setOnClickListener{
            val intent = Intent(this@MainActivity, HousesActivity::class.java)
            startActivity(intent)
        }

        binding.ingredientsImage.setOnClickListener{
            val intent = Intent(this@MainActivity, IngredientActivity
            ::class.java)
            startActivity(intent)
        }

        binding.elixirsImage.setOnClickListener{
            val intent = Intent(this@MainActivity, ElixirsActivity
            ::class.java)
            startActivity(intent)
        }

        binding.spellsImagem.setOnClickListener{
            val intent = Intent(this@MainActivity, SpellActivity
            ::class.java)
            startActivity(intent)
        }
    }
}