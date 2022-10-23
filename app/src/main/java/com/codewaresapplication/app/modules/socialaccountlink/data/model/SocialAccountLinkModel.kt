package com.codewaresapplication.app.modules.socialaccountlink.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SocialAccountLinkModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSocialNetwork: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_social_network)

)
