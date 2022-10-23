package com.codewaresapplication.app.modules.hometwo.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBlackJacket: String? = MyApp.getInstance().resources.getString(R.string.lbl_black_jacket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_246_00)

)
