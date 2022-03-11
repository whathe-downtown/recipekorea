package com.recipekorea.screen.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.recipekorea.R
import com.recipekorea.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment

        Handler().postDelayed({
            binding.myBottomNav.visibility = View.VISIBLE
        },3000)
        //네이게이션 컨트롤러
        val navController = navHostFragment.navController

        NavigationUI.setupWithNavController(binding.myBottomNav, navController)


    }

    override fun onDestroy() {
        super.onDestroy()
    }
}