package com.codewaresapplication.app.modules.splashscreen.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFashionista: String? = MyApp.getInstance().resources.getString(R.string.lbl_fashionista)

)
