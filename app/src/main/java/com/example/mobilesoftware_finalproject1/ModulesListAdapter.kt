package com.example.mobilesoftware_finalproject1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ModulesListAdapter(private val dataList: List<String>) :
    RecyclerView.Adapter<ModulesListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModulesListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return ModulesListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModulesListViewHolder, position: Int) {
        val item = dataList[position]
        holder.textView.text = item
        holder.button.setOnClickListener {
            // Handle button click
        }
    }

    override fun getItemCount() = dataList.size
}