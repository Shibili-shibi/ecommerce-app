package com.codewaresapplication.app.modules.exploreshop.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.exploreshop.`data`.model.ExploreShopModel
import com.codewaresapplication.app.modules.exploreshop.`data`.model.ExploreShopRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExploreShopVM : ViewModel(), KoinComponent {
  val exploreShopModel: MutableLiveData<ExploreShopModel> = MutableLiveData(ExploreShopModel())

  var navArguments: Bundle? = null

  val exploreShopList: MutableLiveData<MutableList<ExploreShopRowModel>> =
      MutableLiveData(mutableListOf())
}
