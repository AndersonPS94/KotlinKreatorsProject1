package com.example.kotlinkreatorsproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.Adapter

class ListRecentActivitiesAdapter(
    val list: List<ItensList>
) : Adapter<ListRecentActivitiesAdapter.ListRecentActivitiesViewHolder>() {

    inner class ListRecentActivitiesViewHolder(
        itemView : View
    ) : ViewHolder( itemView ) {
        //val imgActivity = itemView.findViewById<ImageView>(R.id.imgview_icon)
        val tvName = itemView.findViewById<TextView>(R.id.tv_name)
        val tvDate = itemView.findViewById<TextView>(R.id.tv_date)
        val tvPrice = itemView.findViewById<TextView>(R.id.tv_price)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListRecentActivitiesViewHolder {

        val layoutInflater = LayoutInflater.from( parent.context )
        val itemView = layoutInflater.inflate(
            R.layout.item_list_recentactivities,
            parent,
            false
        )
        return ListRecentActivitiesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListRecentActivitiesViewHolder, position: Int) {
        val item = list[position]

        //holder.imgActivity.setImageResource(item.imgActivity)
        holder.tvName.text = item.name
        holder.tvDate.text = item.date
        holder.tvPrice.text = item.price
    }


    override fun getItemCount(): Int {
        return list.size
    }
}