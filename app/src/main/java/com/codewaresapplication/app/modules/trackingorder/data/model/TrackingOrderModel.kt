package com.codewaresapplication.app.modules.trackingorder.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TrackingOrderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTrackingOrder: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tracking_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderNo84503: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_no_84503)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_arrived_in_16_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrackingOrderOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tracking_order)

)
