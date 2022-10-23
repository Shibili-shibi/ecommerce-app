package com.codewaresapplication.app.modules.share.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ShareModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShareto: String? = MyApp.getInstance().resources.getString(R.string.lbl_share_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFacebookOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_facebook)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInstagramOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_instagram)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwitterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_twitter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsAppOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_whats_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLinekedin: String? = MyApp.getInstance().resources.getString(R.string.lbl_linekedin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPinterestOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_pinterest)

)
