package com.m.andrii.illustratedbiblestories.ui.menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.m.andrii.illustratedbiblestories.R
import com.m.andrii.illustratedbiblestories.models.TitleItem
import com.squareup.picasso.Picasso

class MenuAdapter : ListAdapter<TitleItem, MenuAdapter.MenuViewHolder>(
    DIFF_CALLBACK
) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TitleItem>(){
            override fun areItemsTheSame(oldItem: TitleItem, newItem: TitleItem): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: TitleItem, newItem: TitleItem): Boolean {
                return (oldItem == newItem)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_title, parent, false))
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.tv_item)
        private val imageView: ImageView = itemView.findViewById(R.id.iv_item)

        fun bind(item: TitleItem) {
                textView.text = item.title
                Picasso.get()
                    .load(item.imageUrl)
                    .into(imageView)
        }
    }
}