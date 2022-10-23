package com.codewaresapplication.app.modules.share.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.share.`data`.model.ShareModel
import org.koin.core.KoinComponent

class ShareVM : ViewModel(), KoinComponent {
  val shareModel: MutableLiveData<ShareModel> = MutableLiveData(ShareModel())

  var navArguments: Bundle? = null
}
