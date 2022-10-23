package com.codewaresapplication.app.modules.exploreshop.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowExploreShopBinding
import com.codewaresapplication.app.modules.exploreshop.`data`.model.ExploreShopRowModel
import kotlin.Int
import kotlin.collections.List

class ExploreShopAdapter(
  var list: List<ExploreShopRowModel>
) : RecyclerView.Adapter<ExploreShopAdapter.RowExploreShopVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExploreShopVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore_shop,parent,false)
    return RowExploreShopVH(view)
  }

  override fun onBindViewHolder(holder: RowExploreShopVH, position: Int) {
    val exploreShopRowModel = ExploreShopRowModel()
    // TODO uncomment following line after integration with data source
    // val exploreShopRowModel = list[position]
    holder.binding.exploreShopRowModel = exploreShopRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ExploreShopRowModel>) {
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
      item: ExploreShopRowModel
    ) {
    }
  }

  inner class RowExploreShopVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowExploreShopBinding = RowExploreShopBinding.bind(itemView)
  }
}
