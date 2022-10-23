package com.codewaresapplication.app.modules.search.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListunsplashqnuurFiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPremiumWatch: String? = MyApp.getInstance().resources.getString(R.string.lbl_premium_watch)

)
