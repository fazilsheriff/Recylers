package com.example.recylers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userList:List<User>):RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_list, parent, false)
        return CustomViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}

class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    fun bindItems(user: User){
        val tvFirstName=itemView.findViewById(R.id.firstName)as TextView
        val tvLastNamee=itemView.findViewById(R.id.lastName)as TextView
        tvFirstName.text=user.firstName
        tvLastNamee.text=user.lastName

    }
}
