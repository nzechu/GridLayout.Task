package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.TaskAdapter
import com.example.myapplication.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val myDataSet = DataSource().loadMotivation()
        val recyclerViewObject = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerViewObject.adapter = TaskAdapter(this,myDataSet)
        recyclerViewObject.setHasFixedSize(true)
        recyclerViewObject.layoutManager = GridLayoutManager(this,3)

    }
}