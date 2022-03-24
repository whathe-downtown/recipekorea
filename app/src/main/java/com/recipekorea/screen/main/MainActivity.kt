package com.recipekorea.screen.main


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import android.view.View

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.recipekorea.R
import com.recipekorea.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment
        binding.myBottomNav.visibility = View.VISIBLE
        //네이게이션 컨트롤러
        val navController = navHostFragment.navController

        NavigationUI.setupWithNavController(binding.myBottomNav, navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment -> binding.myBottomNav.visibility = View.VISIBLE
                R.id.searchFragment -> binding.myBottomNav.visibility = View.VISIBLE
                R.id.mypageFragment -> binding.myBottomNav.visibility = View.VISIBLE
                else -> binding.myBottomNav.visibility = View.GONE
            }
        }


    }

    override fun onDestroy() {
        super.onDestroy()
    }


}