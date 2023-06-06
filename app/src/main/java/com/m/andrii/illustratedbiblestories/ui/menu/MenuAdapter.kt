package com.m.andrii.illustratedbiblestories.ui.menu

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.m.andrii.illustratedbiblestories.R
import com.m.andrii.illustratedbiblestories.models.TitleItem

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
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.tv_item)
        private val imageView: ImageView = itemView.findViewById(R.id.iv_item)

        fun bind(item: TitleItem) {

        }
    }
}