package com.codewaresapplication.app.modules.orderstatus.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OrderStatusRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderReceived: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_order_received)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_05_48_pm_7_jun)

)
