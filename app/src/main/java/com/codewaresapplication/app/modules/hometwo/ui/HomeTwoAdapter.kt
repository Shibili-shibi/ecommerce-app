package com.codewaresapplication.app.modules.hometwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowHomeTwoBinding
import com.codewaresapplication.app.modules.hometwo.`data`.model.HomeTwoRowModel
import kotlin.Int
import kotlin.collections.List

class HomeTwoAdapter(
  var list: List<HomeTwoRowModel>
) : RecyclerView.Adapter<HomeTwoAdapter.RowHomeTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomeTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_two,parent,false)
    return RowHomeTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowHomeTwoVH, position: Int) {
    val homeTwoRowModel = HomeTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val homeTwoRowModel = list[position]
    holder.binding.homeTwoRowModel = homeTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HomeTwoRowModel>) {
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
      item: HomeTwoRowModel
    ) {
    }
  }

  inner class RowHomeTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomeTwoBinding = RowHomeTwoBinding.bind(itemView)
  }
}
