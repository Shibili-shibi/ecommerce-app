package com.codewaresapplication.app.modules.popularitemscontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.popularitemscontainer.`data`.model.PopularItemsContainerModel
import org.koin.core.KoinComponent

class PopularItemsContainerVM : ViewModel(), KoinComponent {
  val popularItemsContainerModel: MutableLiveData<PopularItemsContainerModel> =
      MutableLiveData(PopularItemsContainerModel())

  var navArguments: Bundle? = null
}
