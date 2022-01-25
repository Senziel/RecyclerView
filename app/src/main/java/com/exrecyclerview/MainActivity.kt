package com.exrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    lateinit var recyclerView: RecyclerView

//    val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager  = layoutManager

        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter

    }
}