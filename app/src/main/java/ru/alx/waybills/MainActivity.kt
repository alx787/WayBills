package ru.alx.waybills

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "123"

//
//        if (currentFragment == null) {
//            val fragment = MainMenuFragment()
//            supportFragmentManager.beginTransaction().add(R.id.fragment_container, fragment).commit()
//        }
    }
}