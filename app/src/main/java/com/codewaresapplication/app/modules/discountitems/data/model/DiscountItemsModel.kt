package com.codewaresapplication.app.modules.discountitems.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DiscountItemsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountItems: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_discount_items)

)
