package com.codewaresapplication.app.modules.onbordingone.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnbordingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllForYou: String? = MyApp.getInstance().resources.getString(R.string.lbl_all_for_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_always_try_p)

)
