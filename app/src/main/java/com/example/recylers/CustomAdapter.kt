package com.example.recylers
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recylers.CustomAdapter.ViewHolder
class CustomAdapter(val userList: List<User>):RecyclerView.Adapter<ViewHolder>() {
    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        fun bindItems(user: User){
            val tvUserName=itemView.findViewById(R.id.tvUserName)as TextView
            tvUserName.text=user.name
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):CustomAdapter.ViewHolder  {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_list, parent, false)
        return ViewHolder(v)

    }
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }
    override fun getItemCount(): Int {
        return userList.size
    }
}