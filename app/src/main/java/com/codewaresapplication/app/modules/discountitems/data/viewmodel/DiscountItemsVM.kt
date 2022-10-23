package com.codewaresapplication.app.modules.discountitems.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.discountitems.`data`.model.DiscountItemsModel
import com.codewaresapplication.app.modules.discountitems.`data`.model.DiscountItemsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DiscountItemsVM : ViewModel(), KoinComponent {
  val discountItemsModel: MutableLiveData<DiscountItemsModel> =
      MutableLiveData(DiscountItemsModel())

  var navArguments: Bundle? = null

  val discountItemsList: MutableLiveData<MutableList<DiscountItemsRowModel>> =
      MutableLiveData(mutableListOf())
}
