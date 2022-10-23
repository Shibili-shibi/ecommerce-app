package com.codewaresapplication.app.modules.discountitems.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowDiscountItemsBinding
import com.codewaresapplication.app.modules.discountitems.`data`.model.DiscountItemsRowModel
import kotlin.Int
import kotlin.collections.List

class DiscountItemsAdapter(
  var list: List<DiscountItemsRowModel>
) : RecyclerView.Adapter<DiscountItemsAdapter.RowDiscountItemsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDiscountItemsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_discount_items,parent,false)
    return RowDiscountItemsVH(view)
  }

  override fun onBindViewHolder(holder: RowDiscountItemsVH, position: Int) {
    val discountItemsRowModel = DiscountItemsRowModel()
    // TODO uncomment following line after integration with data source
    // val discountItemsRowModel = list[position]
    holder.binding.discountItemsRowModel = discountItemsRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DiscountItemsRowModel>) {
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
      item: DiscountItemsRowModel
    ) {
    }
  }

  inner class RowDiscountItemsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDiscountItemsBinding = RowDiscountItemsBinding.bind(itemView)
  }
}
