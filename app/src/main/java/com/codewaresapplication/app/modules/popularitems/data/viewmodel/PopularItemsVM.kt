package com.codewaresapplication.app.modules.popularitems.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.popularitems.`data`.model.PopularItemsModel
import com.codewaresapplication.app.modules.popularitems.`data`.model.PopularItemsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PopularItemsVM : ViewModel(), KoinComponent {
  val popularItemsModel: MutableLiveData<PopularItemsModel> = MutableLiveData(PopularItemsModel())

  var navArguments: Bundle? = null

  val popularItemsList: MutableLiveData<MutableList<PopularItemsRowModel>> =
      MutableLiveData(mutableListOf())
}
