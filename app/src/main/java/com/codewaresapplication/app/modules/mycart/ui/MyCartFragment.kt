package com.codewaresapplication.app.modules.mycart.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseFragment
import com.codewaresapplication.app.databinding.FragmentMyCartBinding
import com.codewaresapplication.app.modules.mycart.`data`.model.MyCartRowModel
import com.codewaresapplication.app.modules.mycart.`data`.viewmodel.MyCartVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyCartFragment : BaseFragment<FragmentMyCartBinding>(R.layout.fragment_my_cart) {
  private val viewModel: MyCartVM by viewModels<MyCartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val myCartAdapter = MyCartAdapter(viewModel.myCartList.value?:mutableListOf())
    binding.recyclerMyCart.adapter = myCartAdapter
    myCartAdapter.setOnItemClickListener(
    object : MyCartAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MyCartRowModel) {
        onClickRecyclerMyCart(view, position, item)
      }
    }
    )
    viewModel.myCartList.observe(requireActivity()) {
      myCartAdapter.updateData(it)
    }
    binding.myCartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerMyCart(
    view: View,
    position: Int,
    item: MyCartRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MY_CART_FRAGMENT"


    fun getInstance(bundle: Bundle?): MyCartFragment {
      val fragment = MyCartFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
