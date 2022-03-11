package com.recipekorea.screen.main.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.recipekorea.databinding.FragmentHomeBinding
import com.recipekorea.screen.main.base.BaseFragment
import com.recipekorea.screen.main.recipe.RecipeActivity

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private var mBinding: FragmentHomeBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            moveBtn.setOnClickListener {
                val intent = Intent(activity, RecipeActivity::class.java)
                startActivity(intent)
            }
        }


    }
}