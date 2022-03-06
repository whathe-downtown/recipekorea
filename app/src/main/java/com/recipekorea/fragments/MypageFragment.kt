package com.recipekorea.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.recipekorea.databinding.FragmentHomeBinding
import com.recipekorea.databinding.FragmentMypageBinding

class MypageFragment : Fragment() {

    private var mBinding : FragmentMypageBinding? =null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMypageBinding.inflate(inflater, container, false)
        mBinding = binding
        return  binding.root
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}