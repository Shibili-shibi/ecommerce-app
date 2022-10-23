package com.codewaresapplication.app.modules.mycart.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MyCartRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCasual: String? = MyApp.getInstance().resources.getString(R.string.lbl_casual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCasualJeansSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_casual_jeans_sh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeXL: String? = MyApp.getInstance().resources.getString(R.string.lbl_size_xl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_134_98)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl4)

)
