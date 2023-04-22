package com.example.mobilesoftware_finalproject1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ModulesListAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<ModulesListAdapter.ViewHolder>() {

    // ViewHolder class with references to the views in the item layout
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.item_text_view)
        val button: Button = itemView.findViewById(R.id.item_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = itemList[position]

        // Update the TextView and Button with the values from the current item
        holder.textView.text = currentItem.text
        holder.button.text = currentItem.buttonText

        // Set an OnClickListener for the Button
        holder.button.setOnClickListener {
            // Do something when the Button is clicked
        }
    }

    override fun getItemCount() = itemList.size

    // Data class representing a single item in the list
    data class Item(val text: String, val buttonText: String)

}
