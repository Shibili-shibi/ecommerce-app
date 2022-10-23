package com.codewaresapplication.app.modules.hometwo.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseFragment
import com.codewaresapplication.app.databinding.FragmentHomeTwoBinding
import com.codewaresapplication.app.modules.hometwo.`data`.model.HomeTwoRowModel
import com.codewaresapplication.app.modules.hometwo.`data`.viewmodel.HomeTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeTwoFragment : BaseFragment<FragmentHomeTwoBinding>(R.layout.fragment_home_two) {
  private val viewModel: HomeTwoVM by viewModels<HomeTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val homeTwoAdapter = HomeTwoAdapter(viewModel.homeTwoList.value?:mutableListOf())
    binding.recyclerHomeTwo.adapter = homeTwoAdapter
    homeTwoAdapter.setOnItemClickListener(
    object : HomeTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeTwoRowModel) {
        onClickRecyclerHomeTwo(view, position, item)
      }
    }
    )
    viewModel.homeTwoList.observe(requireActivity()) {
      homeTwoAdapter.updateData(it)
    }
    binding.homeTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHomeTwo(
    view: View,
    position: Int,
    item: HomeTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_TWO_FRAGMENT"

  }
}
