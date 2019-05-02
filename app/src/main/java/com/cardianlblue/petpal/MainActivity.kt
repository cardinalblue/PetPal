package com.cardianlblue.petpal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showMainPage()
    }

    private fun showMainPage() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, MainFragment())
            .commit()
    }

    private fun replacePage(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
            .addToBackStack(fragment::class.java.simpleName)
            .commit()
    }

    val navigator = object : PageNavigator {
        override fun toOwnersPage() {
            replacePage(OwnerFragment())
        }
        override fun toSittersPage() {
            replacePage(SitterFragment())
        }
    }
}
