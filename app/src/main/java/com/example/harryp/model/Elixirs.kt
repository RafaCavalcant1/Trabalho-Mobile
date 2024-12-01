package com.example.harryp.model

data class Elixirs(
    val characteristics: Any,
    val difficulty: String,
    val effect: String,
    val id: String,
    val ingredients: List<IngredientX>,
    val inventors: List<Any?>,
    val manufacturer: Any,
    val name: String,
    val sideEffects: String,
    val time: Any
)