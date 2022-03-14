package com.recipekorea.screen.main.home

import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.recipekorea.R
import com.recipekorea.data.notice.NoticePage
import com.recipekorea.databinding.FragmentHomeBinding
import com.recipekorea.notice.NoticeViewPagerAdapter
import com.recipekorea.screen.main.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private var bannerPosition = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val list: ArrayList<NoticePage> = ArrayList<NoticePage>().let {
            it.apply {
                add(NoticePage(R.drawable.food_landscape, "1 Page"))
                add(NoticePage(R.drawable.food_landscape2, "2 Page"))
                add(NoticePage(R.drawable.food_landscape3, "3 Page"))
                add(NoticePage(R.drawable.food_landscape4, "4 Page"))
                add(NoticePage(android.R.color.holo_blue_bright, "5 Page"))
                add(NoticePage(android.R.color.black, "6 Page"))

            }
        }

        bannerPosition = Int.MAX_VALUE / 2 - Math.ceil(list.size.toDouble() / 2).toInt()

        binding.viewPager.setCurrentItem(bannerPosition, false)

        with(binding) {
            viewPager.adapter = NoticeViewPagerAdapter(list)
            viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
            txtCurrentBanner.text = getString(R.string.viewpager2_banner, 1, list.size)
        }

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            //사용자가 스크롤 했을때 position 수정
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                bannerPosition = position

                binding.txtCurrentBanner.text =
                    getString(R.string.viewpager2_banner, (bannerPosition % list.size)+1, list.size)
            }
        })
    }
}