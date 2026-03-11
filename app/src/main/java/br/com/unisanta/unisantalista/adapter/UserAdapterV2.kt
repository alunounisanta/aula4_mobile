package br.com.unisanta.unisantalista.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.unisanta.unisantalista.R
import br.com.unisanta.unisantalista.model.Tarefa

class UserAdapterV2(private val tarefas:List<Tarefa>):
    RecyclerView.Adapter<UserAdapterV2.ViewHolder>() {

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val txvNomeContato: TextView = itemView.findViewById(R.id.txt_task_name)
            val txvDescricaoTarefa: TextView = itemView.findViewById(R.id.txt_task_description)
            val txvIsFinihed: TextView = itemView.findViewById(R.id.cb_is_finished)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_v2, parent, false)
        return ViewHolder(view);
    }

    override fun getItemCount(): Int {
        return tarefas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = tarefas[position]
        holder.txvNomeContato.text = user.name
        holder.txvDescricaoTarefa.text = user.description


        holder.txvIsFinihed.text = user.isFinished.toString()
    }

}