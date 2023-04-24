package com.example.mobilesoftware_finalproject1

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ModulesListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView = itemView.findViewById(R.id.item_text_view)
    val button: Button = itemView.findViewById(R.id.item_button)
}