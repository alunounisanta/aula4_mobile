package br.com.unisanta.unisantalista.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.unisanta.unisantalista.R
import br.com.unisanta.unisantalista.model.Tarefa

class UserAdapter(private val tarefas:List<Tarefa>):
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val txvNomeContato: TextView = itemView.findViewById(R.id.txv_nome_contato)


        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(view);
    }

    override fun getItemCount(): Int {
        return tarefas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = tarefas[position]
        holder.txvNomeContato.text = user.name

    }

}