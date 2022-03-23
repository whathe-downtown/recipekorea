package com.recipekorea.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.recipekorea.R
import com.recipekorea.data.notice.DataPage
import com.recipekorea.databinding.ItemViewpagerBinding

class MenuViewPagerAdapter(private val listData: ArrayList<DataPage>): RecyclerView.Adapter<MenuViewHolderPage>() {
    lateinit var binding:  ItemViewpagerBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolderPage {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_viewpager, parent, false)
        return   MenuViewHolderPage(binding)
    }

    override fun onBindViewHolder(holder: MenuViewHolderPage, position: Int) {
        val menuViewHolderPage : MenuViewHolderPage = holder
        menuViewHolderPage.onBind(listData[position])
    }

    override fun getItemCount(): Int = listData.size
}

class MenuViewHolderPage(val binding: ItemViewpagerBinding): RecyclerView.ViewHolder(binding.root){

    fun onBind(data : DataPage){
        binding.tvTitle.text = data.title
        binding.rlLayout.setBackgroundResource(data.color)
    }
}
