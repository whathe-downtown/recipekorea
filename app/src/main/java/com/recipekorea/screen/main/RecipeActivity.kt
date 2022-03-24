package com.recipekorea.screen.main


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.recipekorea.R
import com.recipekorea.data.notice.DataPage
import com.recipekorea.databinding.ActivityRecipeBinding
import com.recipekorea.menu.MenuViewHolderPage
import com.recipekorea.menu.MenuViewPagerAdapter
import com.recipekorea.onboarding.ViewPagerAdapter


class RecipeActivity : AppCompatActivity() {

    lateinit var binding: ActivityRecipeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recipe)

        val list: ArrayList<DataPage> = ArrayList<DataPage>().let {
            it.apply {
                add(DataPage(android.R.color.holo_red_light, "1 Page"))
                add(DataPage(android.R.color.holo_orange_dark, "2 Page"))
                add(DataPage(android.R.color.holo_green_dark, "3 Page"))
                add(DataPage(android.R.color.holo_blue_light, "4 Page"))
                add(DataPage(android.R.color.holo_blue_bright, "5 Page"))
                add(DataPage(android.R.color.black, "6 Page"))
            }
        }

        binding.viewpager.adapter = MenuViewPagerAdapter(list)
        binding.viewpager.orientation =ViewPager2.ORIENTATION_HORIZONTAL
        TabLayoutMediator(binding.tabLayout, binding.viewPager){tab ,position ->
            tab.text  = "Title $position"
       }.attach()
    }




}
