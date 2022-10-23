package com.codewaresapplication.app.modules.signupsignin.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpSignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoveryourS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_discover_your_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_is_a_long_es)

)
