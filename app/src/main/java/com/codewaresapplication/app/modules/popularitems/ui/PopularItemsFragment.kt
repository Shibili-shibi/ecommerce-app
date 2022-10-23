package com.codewaresapplication.app.modules.popularitems.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseFragment
import com.codewaresapplication.app.databinding.FragmentPopularItemsBinding
import com.codewaresapplication.app.modules.popularitems.`data`.model.PopularItemsRowModel
import com.codewaresapplication.app.modules.popularitems.`data`.viewmodel.PopularItemsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PopularItemsFragment :
    BaseFragment<FragmentPopularItemsBinding>(R.layout.fragment_popular_items) {
  private val viewModel: PopularItemsVM by viewModels<PopularItemsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val popularItemsAdapter =
    PopularItemsAdapter(viewModel.popularItemsList.value?:mutableListOf())
    binding.recyclerPopularItems.adapter = popularItemsAdapter
    popularItemsAdapter.setOnItemClickListener(
    object : PopularItemsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PopularItemsRowModel) {
        onClickRecyclerPopularItems(view, position, item)
      }
    }
    )
    viewModel.popularItemsList.observe(requireActivity()) {
      popularItemsAdapter.updateData(it)
    }
    binding.popularItemsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPopularItems(
    view: View,
    position: Int,
    item: PopularItemsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "POPULAR_ITEMS_FRAGMENT"


    fun getInstance(bundle: Bundle?): PopularItemsFragment {
      val fragment = PopularItemsFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
