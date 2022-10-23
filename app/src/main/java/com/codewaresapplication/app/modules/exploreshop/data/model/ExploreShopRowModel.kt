package com.codewaresapplication.app.modules.exploreshop.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreShopRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1315: String? = MyApp.getInstance().resources.getString(R.string.lbl_electonics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup923: String? = MyApp.getInstance().resources.getString(R.string.lbl_books)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup924: String? = MyApp.getInstance().resources.getString(R.string.lbl_reading)

)
