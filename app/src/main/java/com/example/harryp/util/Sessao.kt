package com.example.harryp.util

import com.example.harryp.model.Pessoa
import com.example.harryp.model.Usuario

object Sessao {

    var login: Pessoa? = null

    var people = mutableListOf(
        Pessoa("João Silva", "Leitura", Usuario("joao.silva@example.com", "senha123")),
        Pessoa("Maria Oliveira", "Música", Usuario("maria.oliveira@example.com", "senha456")),
        Pessoa("Pedro Santos", "Futebol", Usuario("pedro.santos@example.com", "senha789")),
        Pessoa("Ana Souza", "Cinema", Usuario("ana.souza@example.com", "senha1011")),
        Pessoa("Lucas Lima", "Viagens", Usuario("lucas.lima@example.com", "senha1213")),
        Pessoa("Bruna Pereira", "Dança", Usuario("bruna.pereira@example.com", "senha1415")),
        Pessoa("Rafael Almeida", "Natação", Usuario("rafael.almeida@example.com", "senha1617")),
        Pessoa("Camila Rodrigues", "Fotografia", Usuario("camila.rodrigues@example.com", "senha1819")),
        Pessoa("Gustavo Ferreira", "Gastronomia", Usuario("gustavo.ferreira@example.com", "senha2021")),
        Pessoa("Isabela Castro", "Yoga", Usuario("isabela.castro@example.com", "senha2223"))
    )
}