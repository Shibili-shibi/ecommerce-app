package com.codewaresapplication.app.modules.notification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowListunsplashqnuurThreeBinding
import com.codewaresapplication.app.modules.notification.`data`.model.ListunsplashqnuurThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListunsplashqnuurThreeAdapter(
  var list: List<ListunsplashqnuurThreeRowModel>
) : RecyclerView.Adapter<ListunsplashqnuurThreeAdapter.RowListunsplashqnuurThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListunsplashqnuurThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listunsplashqnuur_three,parent,false)
    return RowListunsplashqnuurThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListunsplashqnuurThreeVH, position: Int) {
    val listunsplashqnuurThreeRowModel = ListunsplashqnuurThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listunsplashqnuurThreeRowModel = list[position]
    holder.binding.listunsplashqnuurThreeRowModel = listunsplashqnuurThreeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListunsplashqnuurThreeRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListunsplashqnuurThreeRowModel
    ) {
    }
  }

  inner class RowListunsplashqnuurThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListunsplashqnuurThreeBinding = RowListunsplashqnuurThreeBinding.bind(itemView)
  }
}
