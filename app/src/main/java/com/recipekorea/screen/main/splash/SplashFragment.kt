package com.recipekorea.screen.main.splash

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.recipekorea.R
import com.recipekorea.databinding.FragmentSplashBinding
import com.recipekorea.screen.main.base.BaseFragment
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        Handler().postDelayed({
            if (onBoardingFinished()){
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
            }

        },3000)
    }

    private fun onBoardingFinished(): Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }

}