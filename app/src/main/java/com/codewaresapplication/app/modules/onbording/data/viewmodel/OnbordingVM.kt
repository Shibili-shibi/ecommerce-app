package com.codewaresapplication.app.modules.onbording.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.onbording.`data`.model.OnbordingModel
import org.koin.core.KoinComponent

class OnbordingVM : ViewModel(), KoinComponent {
  val onbordingModel: MutableLiveData<OnbordingModel> = MutableLiveData(OnbordingModel())

  var navArguments: Bundle? = null
}
