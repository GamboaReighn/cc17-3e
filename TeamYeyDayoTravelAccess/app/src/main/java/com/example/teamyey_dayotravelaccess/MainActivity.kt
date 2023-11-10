package com.example.teamyey_dayotravelaccess

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.teamyey_dayotravelaccess.fragments.AccountFragment
import com.example.teamyey_dayotravelaccess.fragments.HomeFragment
import com.example.teamyey_dayotravelaccess.fragments.TransactionFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val accountFragment = AccountFragment()
    private val transactionFragment = TransactionFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)


        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
            R.id.ic_home -> replaceFragment(homeFragment)
            R.id.ic_transaction ->replaceFragment(transactionFragment)
                R.id.ic_person -> replaceFragment(accountFragment)


            }
            true
        }


    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment !=null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()

        }
    }
}
