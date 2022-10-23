package com.codewaresapplication.app.modules.onbording.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnbordingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCoolProduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_cool_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_create_produ)

)
