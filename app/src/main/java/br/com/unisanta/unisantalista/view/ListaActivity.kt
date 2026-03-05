package br.com.unisanta.unisantalista.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.unisanta.unisantalista.R
import br.com.unisanta.unisantalista.adapter.UserAdapter
import br.com.unisanta.unisantalista.model.UserDaoImpl

class ListaActivity : AppCompatActivity() {

    private val dao = UserDaoImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvContatos:RecyclerView = findViewById<RecyclerView>(R.id.rv_contatos)
        val users = dao.getUsers()
        rvContatos.layoutManager = LinearLayoutManager(this)
        rvContatos.adapter = UserAdapter(users)
    }
}