package com.codewaresapplication.app.modules.exploreshop.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreShopModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatproductsy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_products_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_which_yo)

)
