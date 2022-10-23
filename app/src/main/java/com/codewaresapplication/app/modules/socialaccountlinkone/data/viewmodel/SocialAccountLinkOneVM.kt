package com.codewaresapplication.app.modules.socialaccountlinkone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.socialaccountlinkone.`data`.model.SocialAccountLinkOneModel
import org.koin.core.KoinComponent

class SocialAccountLinkOneVM : ViewModel(), KoinComponent {
  val socialAccountLinkOneModel: MutableLiveData<SocialAccountLinkOneModel> =
      MutableLiveData(SocialAccountLinkOneModel())

  var navArguments: Bundle? = null
}
