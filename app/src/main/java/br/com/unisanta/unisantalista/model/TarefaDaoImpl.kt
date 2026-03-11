package br.com.unisanta.unisantalista.model

class TarefaDaoImpl : TarefaDao{

    companion object {
        private val tarefas = mutableListOf<Tarefa>()
    }

    override fun postUser(tarefa: Tarefa) {
        tarefas.add(tarefa)
    }

    override fun getUsers(): List<Tarefa> {
        return tarefas;
    }
}