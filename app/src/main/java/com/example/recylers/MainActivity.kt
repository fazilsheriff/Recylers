package com.example.recylers
/*
* 1 What is data class
* 2 */
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
        val adapter = CustomAdapter(users)
        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter


    }
}