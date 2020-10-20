package com.example.recylers
/// Todo 1: Create two rows with Image view
/// Todo 2: Retrofit with recycler with single row
/// Todo 3: Room with recycler with single row
/// Todo 4: Create views   dynamically with single row with floating  action  bar click
/// Todo 5: Swippable lists view
/// Todo 6 : item click listner for both row and individual item alone
/// Todo 7 : Recycler with live data
/// Todo 8 : Recycler with dataBinding
/// Todo 9e : Expandable Listview
/// Todo 10: View model with Recycler
/// Todo 11: View Binding with Recycler
/// Todo 12: MVVM with view model,Data binding,Live data,Room and retrofit ,onclick,fragment,swipe,details view,
/// Todo 13: On onclick how will  you navigate from recyler to activity and fragment
/// Todo 14: Recycler with fragments
/// Todo 15: Call recycler form another recyler

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
        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recylerView) as RecyclerView
        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()
        //adding some dummy data to the list
        users.add(User("Belal Khan"))
        users.add(User("Belal Basha"))
        //creating our adapter
        val adapter = CustomAdapter(this,users)
        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter


    }
}