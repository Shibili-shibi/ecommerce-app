package com.codewaresapplication.app.modules.mycart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowMyCartBinding
import com.codewaresapplication.app.modules.mycart.`data`.model.MyCartRowModel
import kotlin.Int
import kotlin.collections.List

class MyCartAdapter(
  var list: List<MyCartRowModel>
) : RecyclerView.Adapter<MyCartAdapter.RowMyCartVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMyCartVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_my_cart,parent,false)
    return RowMyCartVH(view)
  }

  override fun onBindViewHolder(holder: RowMyCartVH, position: Int) {
    val myCartRowModel = MyCartRowModel()
    // TODO uncomment following line after integration with data source
    // val myCartRowModel = list[position]
    holder.binding.myCartRowModel = myCartRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MyCartRowModel>) {
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
      item: MyCartRowModel
    ) {
    }
  }

  inner class RowMyCartVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMyCartBinding = RowMyCartBinding.bind(itemView)
  }
}
