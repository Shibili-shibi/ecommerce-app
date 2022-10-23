package com.codewaresapplication.app.modules.hometwotabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.hometwotabcontainer.`data`.model.HomeTwoTabContainerModel
import org.koin.core.KoinComponent

class HomeTwoTabContainerVM : ViewModel(), KoinComponent {
  val homeTwoTabContainerModel: MutableLiveData<HomeTwoTabContainerModel> =
      MutableLiveData(HomeTwoTabContainerModel())

  var navArguments: Bundle? = null
}
