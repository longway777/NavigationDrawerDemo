package com.example.drawerdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_holder.view.*

class MyListAdapter(val isPager:Boolean) : ListAdapter<Int, RecyclerView.ViewHolder>(callback) {
    object callback : DiffUtil.ItemCallback<Int>() {
        override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false)
        if (isPager) {
            view.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            view.cellImageView.layoutParams.width = 0
            view.cellImageView.layoutParams.height = 0
        }
        return object : RecyclerView.ViewHolder(view) {}
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.cellImageView.setImageResource(getItem(position))
    }
}
