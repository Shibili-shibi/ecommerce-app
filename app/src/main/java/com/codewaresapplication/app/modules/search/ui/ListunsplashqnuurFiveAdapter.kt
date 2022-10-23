package com.codewaresapplication.app.modules.search.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowListunsplashqnuurFiveBinding
import com.codewaresapplication.app.modules.search.`data`.model.ListunsplashqnuurFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListunsplashqnuurFiveAdapter(
  var list: List<ListunsplashqnuurFiveRowModel>
) : RecyclerView.Adapter<ListunsplashqnuurFiveAdapter.RowListunsplashqnuurFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListunsplashqnuurFiveVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listunsplashqnuur_five,parent,false)
    return RowListunsplashqnuurFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListunsplashqnuurFiveVH, position: Int) {
    val listunsplashqnuurFiveRowModel = ListunsplashqnuurFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listunsplashqnuurFiveRowModel = list[position]
    holder.binding.listunsplashqnuurFiveRowModel = listunsplashqnuurFiveRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListunsplashqnuurFiveRowModel>) {
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
      item: ListunsplashqnuurFiveRowModel
    ) {
    }
  }

  inner class RowListunsplashqnuurFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListunsplashqnuurFiveBinding = RowListunsplashqnuurFiveBinding.bind(itemView)
  }
}
