package com.codewaresapplication.app.modules.popularitems.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowPopularItemsBinding
import com.codewaresapplication.app.modules.popularitems.`data`.model.PopularItemsRowModel
import kotlin.Int
import kotlin.collections.List

class PopularItemsAdapter(
  var list: List<PopularItemsRowModel>
) : RecyclerView.Adapter<PopularItemsAdapter.RowPopularItemsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPopularItemsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_popular_items,parent,false)
    return RowPopularItemsVH(view)
  }

  override fun onBindViewHolder(holder: RowPopularItemsVH, position: Int) {
    val popularItemsRowModel = PopularItemsRowModel()
    // TODO uncomment following line after integration with data source
    // val popularItemsRowModel = list[position]
    holder.binding.popularItemsRowModel = popularItemsRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PopularItemsRowModel>) {
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
      item: PopularItemsRowModel
    ) {
    }
  }

  inner class RowPopularItemsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPopularItemsBinding = RowPopularItemsBinding.bind(itemView)
  }
}
