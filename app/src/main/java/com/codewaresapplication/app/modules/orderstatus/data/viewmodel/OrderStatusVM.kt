package com.codewaresapplication.app.modules.orderstatus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.orderstatus.`data`.model.OrderStatusModel
import com.codewaresapplication.app.modules.orderstatus.`data`.model.OrderStatusRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrderStatusVM : ViewModel(), KoinComponent {
  val orderStatusModel: MutableLiveData<OrderStatusModel> = MutableLiveData(OrderStatusModel())

  var navArguments: Bundle? = null

  val orderStatusList: MutableLiveData<MutableList<OrderStatusRowModel>> =
      MutableLiveData(mutableListOf())
}
