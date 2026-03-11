package br.com.unisanta.unisantalista.model

interface TarefaDao {
    fun postUser(tarefa: Tarefa)
    fun getUsers(): List<Tarefa>

}