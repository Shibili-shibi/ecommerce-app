package com.codewaresapplication.app.modules.writeareview.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WriteAReviewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteaReview: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_write_a_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJacket: String? = MyApp.getInstance().resources.getString(R.string.lbl_jacket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlackJacket: String? = MyApp.getInstance().resources.getString(R.string.lbl_black_jacket)
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
  var txtAddPhotoorVi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_photo_or_vi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClickheretou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_click_here_to_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteyorRevie: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_yor_revie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt350characters: String? =
      MyApp.getInstance().resources.getString(R.string.msg_350_characters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1123Value: String? = null
)
