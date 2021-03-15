/// Todo 1: Create two rows with Image view
/// Todo 2: Retrofit with recycler with single row
/// Todo 3: Room with recycler with single row
/// Todo 4: Create views   dynamically with single row with floating  action  bar click
/// Todo 5: Swippable lists view
/// Todo 6 : item click listner




package com.example.recylers

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)


        val users=ArrayList<User>()
        users.add(User("Fazil","Sheriff"))
        users.add(User("Fahad","Fazil"))



        //creating our adapter
        val adapter = CustomAdapter(this,users)
        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}