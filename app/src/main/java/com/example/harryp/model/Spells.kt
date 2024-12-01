package com.example.harryp.model

data class Spells(
    val canBeVerbal: Boolean,
    val creator: Any,
    val effect: String,
    val id: String,
    val incantation: String,
    val light: String,
    val name: String,
    val type: String
)