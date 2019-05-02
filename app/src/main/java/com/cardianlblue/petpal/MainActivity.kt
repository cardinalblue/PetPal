package com.cardianlblue.petpal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

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
}
