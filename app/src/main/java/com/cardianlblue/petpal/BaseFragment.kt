package com.cardianlblue.petpal

import androidx.fragment.app.Fragment

open class BaseFragment: Fragment() {

    protected fun getNavigator(): PageNavigator {
        return (activity as MainActivity).navigator
    }
}