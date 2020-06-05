package com.example.newswrld.Adapter.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.newswrld.Interface.ItemClickListener
import kotlinx.android.synthetic.main.news_layout.view.*

class ListNewsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView),View.OnClickListener{

    private lateinit var itemClickListener: ItemClickListener

    var article_title=itemView.article_title
    var article_time=itemView.article_time
    var article_image=itemView.article_image

    init {
        itemView.setOnClickListener(this)
    }

    fun setItemClickListener(itemClickListener: ItemClickListener){
        this.itemClickListener=itemClickListener
    }

    override fun onClick(v: View) {
        itemClickListener.onClick(v,adapterPosition)
    }

}