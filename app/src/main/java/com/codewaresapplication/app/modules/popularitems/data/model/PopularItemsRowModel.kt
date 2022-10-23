package com.codewaresapplication.app.modules.popularitems.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PopularItemsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBlackJacket: String? = MyApp.getInstance().resources.getString(R.string.lbl_black_jacket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_246_00)

)
