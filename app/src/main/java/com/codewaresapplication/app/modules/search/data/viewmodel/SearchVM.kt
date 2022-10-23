package com.codewaresapplication.app.modules.search.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.search.`data`.model.ListunsplashqnuurFiveRowModel
import com.codewaresapplication.app.modules.search.`data`.model.ListunsplashqnuurRowModel
import com.codewaresapplication.app.modules.search.`data`.model.SearchModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchVM : ViewModel(), KoinComponent {
  val searchModel: MutableLiveData<SearchModel> = MutableLiveData(SearchModel())

  var navArguments: Bundle? = null

  val listunsplashqnuurList: MutableLiveData<MutableList<ListunsplashqnuurRowModel>> =
      MutableLiveData(mutableListOf())

  val listunsplashqnuurFiveList: MutableLiveData<MutableList<ListunsplashqnuurFiveRowModel>> =
      MutableLiveData(mutableListOf())
}
