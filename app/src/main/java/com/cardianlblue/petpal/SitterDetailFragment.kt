package com.cardianlblue.petpal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sitter_detail.*

val ARG_PRICE = "price"
val ARG_NAME = "name"
val ARG_LOCATION = "location"
val ARG_ABOUT = "about"
val ARG_REVIEWS = "reviews"

class SitterDetailFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sitter_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        calendar.setOnDateClickListener { dateTime ->
            (activity as MainActivity).navigator.toBookingPage()
        }

        val price = arguments!!.getString(ARG_PRICE)
        val name = arguments!!.getString(ARG_NAME)
        val location = arguments!!.getString(ARG_LOCATION)
        val about = arguments!!.getString(ARG_ABOUT)
        val reviews = arguments!!.getFloat(ARG_REVIEWS)
        val imageArray = arrayOf(imageStart1, imageStart2, imageStart3, imageStart4, imageStart5)

        textPrice.text = price
        textName.text = name
        textLocation.text = location
        textAbout.text = about
        for (s in 0..4) {
            if (reviews > s + 0.5) {
                imageArray[s].setImageResource(R.drawable.star_gold)
            } else {
                imageArray[s].setImageResource(R.drawable.star_silver)
            }
        }
    }
}