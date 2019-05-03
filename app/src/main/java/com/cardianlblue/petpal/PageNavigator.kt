package com.cardianlblue.petpal

interface PageNavigator {

    fun toSittersPage()
    fun toOwnersPage()
    fun toBookingPage(profileRes: Int)
}