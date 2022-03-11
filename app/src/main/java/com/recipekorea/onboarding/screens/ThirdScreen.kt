package com.recipekorea.onboarding.screens

import android.content.Context
import android.os.Bundle

import android.view.View
import androidx.navigation.fragment.findNavController

import com.recipekorea.R
import com.recipekorea.databinding.FragmentThirdScreenBinding
import com.recipekorea.screen.main.base.BaseFragment


class ThirdScreen : BaseFragment<FragmentThirdScreenBinding>(FragmentThirdScreenBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        with(binding) {
            binding.textView.setOnClickListener {
                findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
                onBoardingFinished()
            }
        }
    }

    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

}