package com.codewaresapplication.app.modules.orderstatus.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowOrderStatusBinding
import com.codewaresapplication.app.modules.orderstatus.`data`.model.OrderStatusRowModel
import kotlin.Int
import kotlin.collections.List

class OrderStatusAdapter(
  var list: List<OrderStatusRowModel>
) : RecyclerView.Adapter<OrderStatusAdapter.RowOrderStatusVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOrderStatusVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_order_status,parent,false)
    return RowOrderStatusVH(view)
  }

  override fun onBindViewHolder(holder: RowOrderStatusVH, position: Int) {
    val orderStatusRowModel = OrderStatusRowModel()
    // TODO uncomment following line after integration with data source
    // val orderStatusRowModel = list[position]
    holder.binding.orderStatusRowModel = orderStatusRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OrderStatusRowModel>) {
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
      item: OrderStatusRowModel
    ) {
    }
  }

  inner class RowOrderStatusVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOrderStatusBinding = RowOrderStatusBinding.bind(itemView)
  }
}
