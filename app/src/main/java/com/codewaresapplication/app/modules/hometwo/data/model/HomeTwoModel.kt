package com.codewaresapplication.app.modules.hometwo.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCasualJeansSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_casual_jeans_sh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_165_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCasualJeansShOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_casual_jeans_sh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_165_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCasualJeansShTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_casual_jeans_sh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_165_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopulerItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_populer_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
