package com.codewaresapplication.app.modules.socialaccountlink.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.socialaccountlink.`data`.model.ListfacebookRowModel
import com.codewaresapplication.app.modules.socialaccountlink.`data`.model.SocialAccountLinkModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SocialAccountLinkVM : ViewModel(), KoinComponent {
  val socialAccountLinkModel: MutableLiveData<SocialAccountLinkModel> =
      MutableLiveData(SocialAccountLinkModel())

  var navArguments: Bundle? = null

  val listfacebookList: MutableLiveData<MutableList<ListfacebookRowModel>> =
      MutableLiveData(mutableListOf())
}
