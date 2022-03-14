package com.recipekorea.notice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.recipekorea.R
import com.recipekorea.data.notice.NoticePage
import com.recipekorea.databinding.ItemViewpagerBinding

class NoticeViewPagerAdapter(private  val listData: ArrayList<NoticePage>) : RecyclerView.Adapter<ViewHolderPage>() {
    lateinit var binding: ItemViewpagerBinding




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPage {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_viewpager, parent, false)
        return ViewHolderPage(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderPage, position: Int) {
        val viewHolder: ViewHolderPage = holder
        viewHolder.onBind(listData[position % listData.size])
    }

    override fun getItemCount(): Int = Int.MAX_VALUE
}


class ViewHolderPage(val binding: ItemViewpagerBinding): RecyclerView.ViewHolder(binding.root){
    fun onBind(data: NoticePage) {
        binding.tvTitle.text = data.title
        binding.rlLayout.setBackgroundResource(data.color)
    }
}