package com.example.tablayoutdemo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutdemo.fragments.Fragment1
import com.example.tablayoutdemo.fragments.Fragment2
import com.example.tablayoutdemo.fragments.Fragment3

class MyViewPagerAdapater(fragmentManager: FragmentManager, lifecycle: Lifecycle) :FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        when(position) {
            0 -> {
                return Fragment1()
            }

            1 -> {
                return  Fragment2()
            }

            2 -> {
                return Fragment3()
            }
        }

        return  Fragment1()
    }

}