package com.cardianlblue.petpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SitterDetailPagerAdapter(fragmentManager: FragmentManager,
                               private val sitters: List<Sitter>): FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        val fragment = SitterDetailFragment()
        val sitter = sitters[position]
        val data = Bundle()

        data.putString(ARG_NAME, sitter.name)
        //add more

        fragment.arguments = data

        return fragment
    }

    override fun getCount(): Int {
        return sitters.size
    }
}