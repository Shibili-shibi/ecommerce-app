package com.codewaresapplication.app.modules.socialaccountlink.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListfacebookRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFacebookOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_facebook)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoFace: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_face)

)
