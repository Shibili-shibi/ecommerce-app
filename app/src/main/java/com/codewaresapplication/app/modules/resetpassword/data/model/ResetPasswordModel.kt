package com.codewaresapplication.app.modules.resetpassword.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranewpas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_a_new_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup964Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup965Value: String? = null
)
