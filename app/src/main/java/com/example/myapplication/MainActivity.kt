package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.fragments.DashboardFragment
import com.example.myapplication.fragments.HomeFragment
import com.example.myapplication.fragments.InfoFragment
import com.example.myapplication.fragments.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val dashboardFragment = DashboardFragment()
    private val homeFragment = HomeFragment()
    private val infoFragment = InfoFragment()
    private val settingsFragment = SettingsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reaplaceFragment(dashboardFragment)
        val bottomNavigationView: BottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_baseline_dashboard -> replaceFragment (dashboardFragment)
                R.id.ic_baseline_settings -> replaceFragment (settingsFragment)
                R.id.ic_baseline_home -> replaceFragment (homeFragment)
                R.id.ic_baseline_info -> replaceFragment (infoFragment)
            }
            true
        }
    }

    private fun replaceFragment(infoFragment: InfoFragment): Boolean {

    }

    private fun reaplaceFragment(fragment: Fragment){
        if (fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }

    }
}