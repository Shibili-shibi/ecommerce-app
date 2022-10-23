package com.codewaresapplication.app.modules.complete.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CompleteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderCompleted: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_completed)

)
