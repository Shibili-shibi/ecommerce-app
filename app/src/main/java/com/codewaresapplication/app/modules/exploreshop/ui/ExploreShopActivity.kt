package com.codewaresapplication.app.modules.exploreshop.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityExploreShopBinding
import com.codewaresapplication.app.modules.exploreshop.`data`.model.ExploreShopRowModel
import com.codewaresapplication.app.modules.exploreshop.`data`.viewmodel.ExploreShopVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExploreShopActivity : BaseActivity<ActivityExploreShopBinding>(R.layout.activity_explore_shop)
    {
  private val viewModel: ExploreShopVM by viewModels<ExploreShopVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val exploreShopAdapter =
    ExploreShopAdapter(viewModel.exploreShopList.value?:mutableListOf())
    binding.recyclerExploreShop.adapter = exploreShopAdapter
    exploreShopAdapter.setOnItemClickListener(
    object : ExploreShopAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ExploreShopRowModel) {
        onClickRecyclerExploreShop(view, position, item)
      }
    }
    )
    viewModel.exploreShopList.observe(this) {
      exploreShopAdapter.updateData(it)
    }
    binding.exploreShopVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerExploreShop(
    view: View,
    position: Int,
    item: ExploreShopRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EXPLORE_SHOP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExploreShopActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
