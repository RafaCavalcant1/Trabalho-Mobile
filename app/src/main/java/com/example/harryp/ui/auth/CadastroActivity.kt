package com.example.harryp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.harryp.R
import com.example.harryp.databinding.ActivityCadastroBinding
import com.example.harryp.model.Pessoa
import com.example.harryp.model.Usuario
import com.example.harryp.ui.home.MainActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private var auth: FirebaseAuth? = null
    private var firestore: FirebaseFirestore? = null
    private val viewModel = AuthViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setUpView()
        auth = FirebaseAuth.getInstance()
        firestore = FirebaseFirestore.getInstance()
    }

    private fun setUpView(){
        binding.registerButton.setOnClickListener{
            validateFieldsAndRegister()
        }
        binding.backButton.setOnClickListener {
            finish()
        }
    }

    private fun validateFieldsAndRegister(){
        val name = binding.username.text.toString()
        val hobby = binding.hobby.text.toString()
        val email = binding.email.text.toString()
        val senha = binding.password.text.toString()
        val confirmSenha = binding.confirmPassword.text.toString()

        val person = Pessoa(name, hobby, Usuario(email,senha))

        viewModel.createUser(
            person,
            senha,
            confirmSenha,
            onSuccess = {
                goToMainActivity()
            },
            onFailure = { errorMessage ->
                Toast.makeText(
                    this@CadastroActivity,
                    errorMessage,
                    Toast.LENGTH_SHORT
                ).show()
            }
        )
    }

    private fun goToMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}