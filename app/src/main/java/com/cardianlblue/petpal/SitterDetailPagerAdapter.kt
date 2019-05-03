package com.cardianlblue.petpal

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter

class SitterDetailPagerAdapter(fragmentManager: FragmentManager,
                               private val sitters: List<Sitter>): FragmentStatePagerAdapter(fragmentManager) {

    private val fragmentMap = hashMapOf<Int, Fragment>()

    override fun getItem(position: Int): Fragment {
        val fragment = SitterDetailFragment()
        val sitter = sitters[position]
        val data = Bundle()

        data.putString(ARG_PRICE, sitter.price)
        data.putString(ARG_NAME, sitter.name)
        data.putString(ARG_LOCATION, sitter.location)
        data.putString(ARG_ABOUT, sitter.about)
        data.putFloat(ARG_REVIEWS, sitter.stars)
        data.putInt(ARG_PROFILE, sitter.profileRes)

        fragment.arguments = data

        return fragment
    }

    override fun saveState(): Parcelable? {
        return null
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {
    }

    override fun getCount(): Int {
        return sitters.size
    }
}