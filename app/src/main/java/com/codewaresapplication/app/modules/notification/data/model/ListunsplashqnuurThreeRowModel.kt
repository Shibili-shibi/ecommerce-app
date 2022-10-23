package com.codewaresapplication.app.modules.notification.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListunsplashqnuurThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYoupurchasedSOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_purchased_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_02_minites_ago)

)
