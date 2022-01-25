package com.exrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var title = arrayOf("Chapter One", "Chapter Two", "Chapter Three", "Chapter Four", "Chapter Five")
    private var details = arrayOf("Item one details", "Item two details", "Item three details", "Item four details",
            "Item five details", "Item six details", "Item seven details", "item eight details")

    private val images = intArrayOf(R.drawable.androidimage, R.drawable.androidimage, R.drawable.androidimage, R.drawable.androidimage,
        R.drawable.androidimage, R.drawable.androidimage, R.drawable.androidimage, R.drawable.androidimage)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var  itemImage: ImageView
        var itemTitle: TextView
        var  itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

        }
    }

}