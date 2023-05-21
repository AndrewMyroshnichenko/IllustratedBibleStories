package com.m.andrii.illustratedbiblestories.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainTypesAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val nameOfTabs: List<String>
) : FragmentStateAdapter(fragmentManager, lifecycle) {


    override fun getItemCount(): Int {
        return nameOfTabs.size
    }

    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }
}