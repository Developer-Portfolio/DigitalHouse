package com.example.agendadh

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.main_list.view.*

class MainAdapter(private val studentsList: List<Students>):RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder (parent:ViewGroup, viewType:Int):ViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.bind(studentsList[position])
    }

    override fun getItemCount(): Int {
        return studentsList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(students: Students) = with(itemView) {
            tvName.text = students.name
            tvMobile.text = students.mobile
        }
    }
}