package com.example.harryp.ui.auth

import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.harryp.R
import com.example.harryp.model.Pessoa
import com.example.harryp.model.Usuario
import com.example.harryp.util.USERS
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.auth.User

class AuthViewModel: ViewModel() {

    private val auth = FirebaseAuth.getInstance()
    private val firestore = FirebaseFirestore.getInstance()

    fun login(
        email: String,
        password: String,
        onSuccess: () -> Unit,
        onFailure: () -> Unit
    ) {
        if (email.isEmpty() || password.isEmpty()) {
            onFailure.invoke()
        } else {
            auth.signInWithEmailAndPassword(email, password)
                .addOnSuccessListener {
                    onSuccess()
                }
                .addOnFailureListener {
                    onFailure()
                }
        }
    }

    fun createUser(
        pessoa: Pessoa,
        senha: String,
        confirmSenha: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        if (pessoa.usuario.email.isEmpty()) {
            onFailure("Email é obrigatório")
            return
        }

        val emailRegex = Regex("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")

        if (!emailRegex.matches(pessoa.usuario.email)) {
            onFailure( "Formato de email inválido")
            return
        }

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(pessoa.usuario.email).matches()) {
            onFailure("Formato de email inválido")
            return
        }

        if (pessoa.usuario.senha.isBlank()) {
            onFailure("Senha é obrigatório")
            return
        }

        if (pessoa.usuario.senha.length < 6) {
            onFailure("A senha deve ter pelo menos 6 caracteres")
            return
        }

        if (confirmSenha.isBlank()) {
            onFailure("Confirmar senha não pode está vazio")
            return
        }

        if (pessoa.name.isNullOrEmpty()) {
            onFailure("Nome é obrigatório")
            return
        }

        if (pessoa.hobby.isNullOrEmpty()) {
            onFailure("Hobby é obrigatório")
            return
        }

        if (senha != confirmSenha) {
            onFailure("As senhas não coincidem")
            return
        }

        auth.createUserWithEmailAndPassword(
            pessoa.usuario.email,
            senha
        ).addOnFailureListener {
            onFailure("Falha na criação do seu usuário! Tente novamente por favor!")
        }.addOnSuccessListener {
            val user = auth.currentUser
            pessoa.uId = user?.uid
            saveUser(pessoa, onSuccess, onFailure)
        }
    }

    private fun saveUser(
        pessoa: Pessoa,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ){
        firestore.collection(USERS).document(pessoa.uId!!).set(pessoa)
            .addOnSuccessListener {
                onSuccess.invoke()
            }.addOnFailureListener {
                onFailure.invoke("Falha na criação do seu usuário! Tente novamente por favor!")
            }
    }
}