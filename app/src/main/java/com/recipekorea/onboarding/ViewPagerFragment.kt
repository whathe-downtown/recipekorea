package com.recipekorea.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.recipekorea.R
import com.recipekorea.databinding.FragmentViewPagerBinding
import com.recipekorea.onboarding.screens.FirstScreen
import com.recipekorea.onboarding.screens.SecondScreen
import com.recipekorea.onboarding.screens.ThirdScreen
import com.recipekorea.screen.main.base.BaseFragment


class ViewPagerFragment :
    BaseFragment<FragmentViewPagerBinding>(FragmentViewPagerBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

    }


}


