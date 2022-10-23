package com.codewaresapplication.app.modules.homeone.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseFragment
import com.codewaresapplication.app.databinding.FragmentHomeOneBinding
import com.codewaresapplication.app.modules.homeone.`data`.model.HomeOneRowModel
import com.codewaresapplication.app.modules.homeone.`data`.viewmodel.HomeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeOneFragment : BaseFragment<FragmentHomeOneBinding>(R.layout.fragment_home_one) {
  private val viewModel: HomeOneVM by viewModels<HomeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val homeOneAdapter = HomeOneAdapter(viewModel.homeOneList.value?:mutableListOf())
    binding.recyclerHomeOne.adapter = homeOneAdapter
    homeOneAdapter.setOnItemClickListener(
    object : HomeOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeOneRowModel) {
        onClickRecyclerHomeOne(view, position, item)
      }
    }
    )
    viewModel.homeOneList.observe(requireActivity()) {
      homeOneAdapter.updateData(it)
    }
    binding.homeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHomeOne(
    view: View,
    position: Int,
    item: HomeOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_ONE_FRAGMENT"

  }
}
