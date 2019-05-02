package com.cardianlblue.petpal

import android.support.v4.app.Fragment

open class BaseFragment: Fragment() {

    protected fun getNavigator(): PageNavigator {
        return (activity as MainActivity).navigator
    }
}