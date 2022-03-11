package com.recipekorea.screen.main.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.recipekorea.databinding.FragmentRecipeBinding

class RecipeFragment : Fragment() {

    private var mBinding : FragmentRecipeBinding? =null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRecipeBinding.inflate(inflater, container, false)
        mBinding = binding
        return  binding.root
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}