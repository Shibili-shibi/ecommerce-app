package com.codewaresapplication.app.modules.socialaccountlink.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowListfacebookBinding
import com.codewaresapplication.app.modules.socialaccountlink.`data`.model.ListfacebookRowModel
import kotlin.Int
import kotlin.collections.List

class ListfacebookAdapter(
  var list: List<ListfacebookRowModel>
) : RecyclerView.Adapter<ListfacebookAdapter.RowListfacebookVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfacebookVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfacebook,parent,false)
    return RowListfacebookVH(view)
  }

  override fun onBindViewHolder(holder: RowListfacebookVH, position: Int) {
    val listfacebookRowModel = ListfacebookRowModel()
    // TODO uncomment following line after integration with data source
    // val listfacebookRowModel = list[position]
    holder.binding.listfacebookRowModel = listfacebookRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfacebookRowModel>) {
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
      item: ListfacebookRowModel
    ) {
    }
  }

  inner class RowListfacebookVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfacebookBinding = RowListfacebookBinding.bind(itemView)
    init {
      binding.imageFacebook.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListfacebookRowModel())
      }
    }
  }
}
