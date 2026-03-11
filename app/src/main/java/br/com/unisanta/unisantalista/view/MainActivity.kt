package br.com.unisanta.unisantalista.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.unisanta.unisantalista.R
import br.com.unisanta.unisantalista.model.Tarefa
import br.com.unisanta.unisantalista.model.TarefaDaoImpl
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private val dao = TarefaDaoImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val fabLista = findViewById<FloatingActionButton>(R.id.fab_lista)

        btnCadastrar.setOnClickListener {
            val tarefa = Tarefa(edtNome.text.toString())
            dao.postUser(tarefa)
            Toast.makeText(this, "Cadastro Ok", Toast.LENGTH_SHORT).show()
            edtNome.text.clear()
        }

        fabLista.setOnClickListener{
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }


    }
}