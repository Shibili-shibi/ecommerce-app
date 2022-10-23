package com.codewaresapplication.app.modules.chat.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMahbuba: String? = MyApp.getInstance().resources.getString(R.string.lbl_mahbuba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnline: String? = MyApp.getInstance().resources.getString(R.string.lbl_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYesterday: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiAnneIamF: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_anne_i_am_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_37)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiAnneIamFOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hi_anne_i_am_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHidontworry: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_don_t_worry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHiAnneIamFTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hi_anne_i_am_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMahbubaistypi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mahbuba_is_typi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1314Value: String? = null
)
