package com.codewaresapplication.app.modules.itemfilter.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemFilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBrand: String? = MyApp.getInstance().resources.getString(R.string.lbl_brand)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup831: String? = MyApp.getInstance().resources.getString(R.string.lbl_la_girl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup832: String? = MyApp.getInstance().resources.getString(R.string.lbl_pinkflash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup833: String? = MyApp.getInstance().resources.getString(R.string.lbl_imagic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtService: String? = MyApp.getInstance().resources.getString(R.string.lbl_service)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSix: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRating: String? = MyApp.getInstance().resources.getString(R.string.lbl_rating)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPackSize: String? = MyApp.getInstance().resources.getString(R.string.lbl_pack_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShelfLife: String? = MyApp.getInstance().resources.getString(R.string.lbl_shelf_life)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHB: String? = MyApp.getInstance().resources.getString(R.string.lbl_hb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCoundtryHB: String? = MyApp.getInstance().resources.getString(R.string.lbl_coundtry_hb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDMart: String? = MyApp.getInstance().resources.getString(R.string.lbl_d_mart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsageArea: String? = MyApp.getInstance().resources.getString(R.string.lbl_usage_area)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup848Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup847Value: String? = null
)
