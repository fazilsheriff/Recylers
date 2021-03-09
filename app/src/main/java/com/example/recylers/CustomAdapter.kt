package com.example.recylers
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recylers.CustomAdapter.ViewHolder
class CustomAdapter(val context: Context,val userList: List<User>):RecyclerView.Adapter<ViewHolder>() {

   inner class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener{
                Toast.makeText(context,"Hai",Toast.LENGTH_LONG).show()
            }
        }
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