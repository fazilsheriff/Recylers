package com.example.recylers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(val context: Context, var namesList: List<User>)
    : RecyclerView.Adapter<CustomAdapter.NamesViewHolder>()
{

    inner class NamesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        fun bindItems(user: User){
            val firstName=itemView.findViewById(R.id.firstName)as TextView
            val lastName=itemView.findViewById(R.id.lastName)as TextView
            firstName.text=user.firstName
            lastName.text=user.lastName
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.row_list,parent,false)
        return NamesViewHolder(v)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.bindItems(namesList[position])
    }

    override fun getItemCount(): Int {
        return namesList.size
    }

}
