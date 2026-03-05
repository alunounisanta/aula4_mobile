package br.com.unisanta.unisantalista.model

interface UserDao {
    fun postUser(user: User)
    fun getUsers(): List<User>

}