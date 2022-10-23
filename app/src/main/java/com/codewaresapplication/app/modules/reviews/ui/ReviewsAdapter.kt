package com.codewaresapplication.app.modules.reviews.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codewaresapplication.app.R
import com.codewaresapplication.app.databinding.RowReviewsBinding
import com.codewaresapplication.app.modules.reviews.`data`.model.ReviewsRowModel
import kotlin.Int
import kotlin.collections.List

class ReviewsAdapter(
  var list: List<ReviewsRowModel>
) : RecyclerView.Adapter<ReviewsAdapter.RowReviewsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowReviewsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_reviews,parent,false)
    return RowReviewsVH(view)
  }

  override fun onBindViewHolder(holder: RowReviewsVH, position: Int) {
    val reviewsRowModel = ReviewsRowModel()
    // TODO uncomment following line after integration with data source
    // val reviewsRowModel = list[position]
    holder.binding.reviewsRowModel = reviewsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ReviewsRowModel>) {
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
      item: ReviewsRowModel
    ) {
    }
  }

  inner class RowReviewsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowReviewsBinding = RowReviewsBinding.bind(itemView)
  }
}
