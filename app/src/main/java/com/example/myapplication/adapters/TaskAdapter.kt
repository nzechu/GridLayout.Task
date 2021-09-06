package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.Motivation
import com.example.myapplication.R
import com.example.myapplication.data.DataSource

class TaskAdapter (private val context: Context, private val dataSet : List<Motivation>):
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textPrint = itemView.findViewById<TextView>(R.id.item_title)
        val motivationImage = itemView.findViewById<ImageView>(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return TaskViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textPrint.text = context.resources.getString(item.stringResourceId)
        holder.motivationImage.setImageResource(item.imageResourceId)
    }

    override fun getItemCount()= dataSet.size
    }


