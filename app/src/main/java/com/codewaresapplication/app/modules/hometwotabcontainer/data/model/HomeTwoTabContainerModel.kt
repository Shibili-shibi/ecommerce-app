package com.codewaresapplication.app.modules.hometwotabcontainer.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeTwoTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindYourStyle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_find_your_style)

)
