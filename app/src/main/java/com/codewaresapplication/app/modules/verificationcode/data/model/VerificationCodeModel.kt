package com.codewaresapplication.app.modules.verificationcode.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VerificationCodeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerificationCo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verification_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterthecode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_the_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidtreceivea: String? =
      MyApp.getInstance().resources.getString(R.string.msg_did_t_receive_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidtreceiveaOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_did_t_receive_a2)

)
