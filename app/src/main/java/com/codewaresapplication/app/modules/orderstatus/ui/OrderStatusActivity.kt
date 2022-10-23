package com.codewaresapplication.app.modules.orderstatus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityOrderStatusBinding
import com.codewaresapplication.app.modules.orderstatus.`data`.model.OrderStatusRowModel
import com.codewaresapplication.app.modules.orderstatus.`data`.viewmodel.OrderStatusVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrderStatusActivity : BaseActivity<ActivityOrderStatusBinding>(R.layout.activity_order_status)
    {
  private val viewModel: OrderStatusVM by viewModels<OrderStatusVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val orderStatusAdapter =
    OrderStatusAdapter(viewModel.orderStatusList.value?:mutableListOf())
    binding.recyclerOrderStatus.adapter = orderStatusAdapter
    orderStatusAdapter.setOnItemClickListener(
    object : OrderStatusAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OrderStatusRowModel) {
        onClickRecyclerOrderStatus(view, position, item)
      }
    }
    )
    viewModel.orderStatusList.observe(this) {
      orderStatusAdapter.updateData(it)
    }
    binding.orderStatusVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerOrderStatus(
    view: View,
    position: Int,
    item: OrderStatusRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORDER_STATUS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderStatusActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
