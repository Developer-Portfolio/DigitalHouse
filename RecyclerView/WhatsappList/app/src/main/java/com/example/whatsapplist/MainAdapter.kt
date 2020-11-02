package com.example.whatsapplist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.main_list_message.view.*

class MainAdapter(private val userContactList: List<UserContact>):RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.main_list_message, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.bind(userContactList[position])
    }

    override fun getItemCount(): Int {
       return userContactList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bind(userContact:UserContact) = with(itemView){
            if (userContact.qtde > 0) {
                tvQtde.text =  userContact.qtde.toString()
                tvQtde.isVisible = true
            }

            tvNome.text = userContact.nome
            tvMensagem.text = userContact.mensagem
            tvHora.text = userContact.hora
        }

    }


}


