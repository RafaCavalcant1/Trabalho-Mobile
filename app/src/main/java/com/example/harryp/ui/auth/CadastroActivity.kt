package com.example.harryp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.harryp.ui.home.MainActivity
import com.example.harryp.R
import com.example.harryp.databinding.ActivityCadastroBinding
import com.example.harryp.model.Pessoa
import com.example.harryp.model.Usuario
import com.google.firebase.auth.FirebaseAuth

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    private var auth: FirebaseAuth? = null

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
    }

    private fun setUpView(){
        binding.registerButton.setOnClickListener{
            validateFieldsAndRegister()
        }
    }

    private fun validateFieldsAndRegister(){
        val name = binding.username.text.toString()
        val hobby = binding.hobby.text.toString()
        val email = binding.email.text.toString()
        val senha = binding.password.text.toString()
        val confirmSenha = binding.confirmPassword.text.toString()

        if (name.isBlank()) {
            binding.username.error = "O nome não pode estar vazio"
            return
        }

        if (hobby.isBlank()) {
            binding.hobby.error = "O hobby não pode estar vazio"
            return
        }

        if (email.isEmpty()) {
            binding.email.error = "Email não pode está vazio"
            return
        }

        val emailRegex = Regex("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}")

        if (!emailRegex.matches(email)) {
            binding.email.error = "Email no formato inválido"
            return
        }

        if(senha.isEmpty()){
            binding.password.error = "A senha não pode estar vazia"
            return
        }

        if (senha.length < 6) {
            binding.password.error = "A senha deve ter pelo menos 6 caracteres"
            return
        }

        if(confirmSenha.isBlank()){
            binding.confirmPassword.error = "Confirmar senha não pode está vazio"
        }

        if (senha != confirmSenha) {
            binding.confirmPassword.error = "As senhas não coincidem"
            return
        }

        val person = Pessoa(name, hobby, Usuario(email,senha))

        auth?.createUserWithEmailAndPassword(
            person.usuario.email,
            person.usuario.senha,
        )?.addOnFailureListener {
            Toast.makeText(this@CadastroActivity, getString(R.string.cadastro_error), Toast.LENGTH_SHORT).show()
        }?.addOnSuccessListener {
            goToMainActivity()
        }
    }

    private fun goToMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}