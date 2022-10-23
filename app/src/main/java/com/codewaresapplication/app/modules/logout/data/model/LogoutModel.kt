package com.codewaresapplication.app.modules.logout.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LogoutModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAlert: String? = MyApp.getInstance().resources.getString(R.string.lbl_alert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDoyouwantto: String? = MyApp.getInstance().resources.getString(R.string.msg_do_you_want_to)

)
