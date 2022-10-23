package com.codewaresapplication.app.modules.notification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.notification.`data`.model.Listunsplashqnuur1RowModel
import com.codewaresapplication.app.modules.notification.`data`.model.ListunsplashqnuurThreeRowModel
import com.codewaresapplication.app.modules.notification.`data`.model.NotificationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationVM : ViewModel(), KoinComponent {
  val notificationModel: MutableLiveData<NotificationModel> = MutableLiveData(NotificationModel())

  var navArguments: Bundle? = null

  val listunsplashqnuurList: MutableLiveData<MutableList<Listunsplashqnuur1RowModel>> =
      MutableLiveData(mutableListOf())

  val listunsplashqnuurThreeList: MutableLiveData<MutableList<ListunsplashqnuurThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
