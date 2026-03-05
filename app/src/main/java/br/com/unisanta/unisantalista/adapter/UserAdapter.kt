package br.com.unisanta.unisantalista.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.unisanta.unisantalista.R
import br.com.unisanta.unisantalista.model.User

class UserAdapter(private val users:List<User>):
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            val txvNomeContato: TextView = itemView.findViewById(R.id.txv_nome_contato)


        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(view);
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.txvNomeContato.text = user.name

    }

}