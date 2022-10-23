package com.codewaresapplication.app.modules.reviews.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArianaPeter: String? = MyApp.getInstance().resources.getString(R.string.lbl_ariana_peter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_day_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_is_a_long_es2)

)
