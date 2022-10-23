package com.codewaresapplication.app.modules.reviews.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseFragment
import com.codewaresapplication.app.databinding.FragmentReviewsBinding
import com.codewaresapplication.app.modules.reviews.`data`.model.ReviewsRowModel
import com.codewaresapplication.app.modules.reviews.`data`.viewmodel.ReviewsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReviewsFragment : BaseFragment<FragmentReviewsBinding>(R.layout.fragment_reviews) {
  private val viewModel: ReviewsVM by viewModels<ReviewsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val reviewsAdapter = ReviewsAdapter(viewModel.reviewsList.value?:mutableListOf())
    binding.recyclerReviews.adapter = reviewsAdapter
    reviewsAdapter.setOnItemClickListener(
    object : ReviewsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ReviewsRowModel) {
        onClickRecyclerReviews(view, position, item)
      }
    }
    )
    viewModel.reviewsList.observe(requireActivity()) {
      reviewsAdapter.updateData(it)
    }
    binding.reviewsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerReviews(
    view: View,
    position: Int,
    item: ReviewsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REVIEWS_FRAGMENT"

  }
}
