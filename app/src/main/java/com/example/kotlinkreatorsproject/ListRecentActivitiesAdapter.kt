package com.example.kotlinkreatorsproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.Adapter

class ListRecentActivitiesAdapter(
    val list: List<ItensList>
) : Adapter<ListRecentActivitiesAdapter.ListRecentActivitiesViewHolder>() {

    inner class ListRecentActivitiesViewHolder(
        val itemView : View
    ) : ViewHolder( itemView ) {
        //val imgActivity = itemView.findViewById<ImageView>(R.id.imgActivity)
        val activityName = itemView.findViewById<TextView>(R.id.activityName)
        val activityDate = itemView.findViewById<TextView>(R.id.activityDate)
        val activityPrice = itemView.findViewById<TextView>(R.id.activityPrice)
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
        holder.activityName.text = item.activityName
        holder.activityDate.text = item.activityDate
        holder.activityPrice.text = item.activityPrice
    }

    //
    override fun getItemCount(): Int {
        return list.size
    }
}