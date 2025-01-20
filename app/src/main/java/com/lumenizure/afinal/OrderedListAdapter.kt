package com.lumenizure.afinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OrderedListAdapter(private val type: Int, private val items: List<String>) :
    RecyclerView.Adapter<OrderedListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemNumber: TextView = itemView.findViewById(R.id.itemNumber)
        val itemContent: TextView = itemView.findViewById(R.id.itemContent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        if (type == 10){
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_10, parent, false)
            return ViewHolder(view)
        }
        else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list, parent, false)
            return ViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemNumber.text = "${position + 1}."
        holder.itemContent.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
