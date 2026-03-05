package br.com.unisanta.unisantalista.model

class UserDaoImpl : UserDao{

    companion object {
        private val users = mutableListOf<User>()
    }

    override fun postUser(user: User) {
        users.add(user)
    }

    override fun getUsers(): List<User> {
        return users;
    }
}