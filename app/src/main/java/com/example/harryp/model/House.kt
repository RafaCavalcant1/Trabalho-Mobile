package com.example.harryp.model

data class House(
    val animal: String,
    val commonRoom: String,
    val element: String,
    val founder: String,
    val ghost: String,
    val heads: List<Head>,
    val houseColours: String,
    val id: String,
    val name: String,
    val traits: List<Trait>
)