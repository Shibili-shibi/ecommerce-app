package com.codewaresapplication.app.modules.search.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowListunsplashqnuurBinding
import com.codewaresapplication.app.modules.search.`data`.model.ListunsplashqnuurRowModel
import kotlin.Int
import kotlin.collections.List

class ListunsplashqnuurAdapter(
  var list: List<ListunsplashqnuurRowModel>
) : RecyclerView.Adapter<ListunsplashqnuurAdapter.RowListunsplashqnuurVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListunsplashqnuurVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listunsplashqnuur,parent,false)
    return RowListunsplashqnuurVH(view)
  }

  override fun onBindViewHolder(holder: RowListunsplashqnuurVH, position: Int) {
    val listunsplashqnuurRowModel = ListunsplashqnuurRowModel()
    // TODO uncomment following line after integration with data source
    // val listunsplashqnuurRowModel = list[position]
    holder.binding.listunsplashqnuurRowModel = listunsplashqnuurRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListunsplashqnuurRowModel>) {
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
      item: ListunsplashqnuurRowModel
    ) {
    }
  }

  inner class RowListunsplashqnuurVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListunsplashqnuurBinding = RowListunsplashqnuurBinding.bind(itemView)
  }
}
