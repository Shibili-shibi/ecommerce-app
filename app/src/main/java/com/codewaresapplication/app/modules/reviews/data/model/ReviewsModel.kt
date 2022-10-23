package com.codewaresapplication.app.modules.reviews.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasedon1024: String? = MyApp.getInstance().resources.getString(R.string.msg_based_on_1_024)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExcellent: String? = MyApp.getInstance().resources.getString(R.string.lbl_excellent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGood: String? = MyApp.getInstance().resources.getString(R.string.lbl_good)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAverage: String? = MyApp.getInstance().resources.getString(R.string.lbl_average)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBellowAverage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bellow_average)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPoor: String? = MyApp.getInstance().resources.getString(R.string.lbl_poor)

)
