package com.cardianlblue.petpal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_sitter_detail.*

val ARG_BOOKING_PROFILE = "profile"


class SitterBookingFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sitter_booking, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val profileRes = arguments!!.getInt(ARG_BOOKING_PROFILE)

        imageAvatar.setImageResource(profileRes)
    }
}