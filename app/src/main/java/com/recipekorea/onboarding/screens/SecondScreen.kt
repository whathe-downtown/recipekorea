package com.recipekorea.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.recipekorea.R
import com.recipekorea.databinding.FragmentSecondScreenBinding
import com.recipekorea.screen.main.base.BaseFragment

class SecondScreen : BaseFragment<FragmentSecondScreenBinding>(FragmentSecondScreenBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        with(binding){
            binding.textView.setOnClickListener {
                viewPager?.currentItem = 2

            }
        }
    }

}