package com.codewaresapplication.app.modules.hometwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.hometwo.`data`.model.HomeTwoModel
import com.codewaresapplication.app.modules.hometwo.`data`.model.HomeTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeTwoVM : ViewModel(), KoinComponent {
  val homeTwoModel: MutableLiveData<HomeTwoModel> = MutableLiveData(HomeTwoModel())

  var navArguments: Bundle? = null

  val homeTwoList: MutableLiveData<MutableList<HomeTwoRowModel>> = MutableLiveData(mutableListOf())
}
