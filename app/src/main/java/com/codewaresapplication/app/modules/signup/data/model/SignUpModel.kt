package com.codewaresapplication.app.modules.signup.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinuewit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup964Value: String? = null
)
