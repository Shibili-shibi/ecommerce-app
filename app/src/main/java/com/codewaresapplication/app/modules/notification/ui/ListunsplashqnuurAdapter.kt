package com.codewaresapplication.app.modules.notification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowListunsplashqnuur1Binding
import com.codewaresapplication.app.modules.notification.`data`.model.Listunsplashqnuur1RowModel
import kotlin.Int
import kotlin.collections.List

class ListunsplashqnuurAdapter(
  var list: List<Listunsplashqnuur1RowModel>
) : RecyclerView.Adapter<ListunsplashqnuurAdapter.RowListunsplashqnuur1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListunsplashqnuur1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listunsplashqnuur1,parent,false)
    return RowListunsplashqnuur1VH(view)
  }

  override fun onBindViewHolder(holder: RowListunsplashqnuur1VH, position: Int) {
    val listunsplashqnuur1RowModel = Listunsplashqnuur1RowModel()
    // TODO uncomment following line after integration with data source
    // val listunsplashqnuur1RowModel = list[position]
    holder.binding.listunsplashqnuur1RowModel = listunsplashqnuur1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listunsplashqnuur1RowModel>) {
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
      item: Listunsplashqnuur1RowModel
    ) {
    }
  }

  inner class RowListunsplashqnuur1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListunsplashqnuur1Binding = RowListunsplashqnuur1Binding.bind(itemView)
  }
}
