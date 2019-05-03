package com.cardianlblue.petpal

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SitterDetailPagerAdapter(fragmentManager: FragmentManager,
                               private val sitters: List<Sitter>): FragmentPagerAdapter(fragmentManager) {


    override fun getItem(position: Int): Fragment {
        return SitterDetailFragment()
    }

    override fun getCount(): Int {
        return sitters.size
    }
}