package com.codewaresapplication.app.modules.information.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInformation: String? = MyApp.getInstance().resources.getString(R.string.lbl_information)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnneChristion: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_anne_christion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_annechristion_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountName: String? = MyApp.getInstance().resources.getString(R.string.lbl_account_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup969Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDateValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCountryValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup975Value: String? = null
)
