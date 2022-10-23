package com.codewaresapplication.app.modules.reviews.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.reviews.`data`.model.ReviewsModel
import com.codewaresapplication.app.modules.reviews.`data`.model.ReviewsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReviewsVM : ViewModel(), KoinComponent {
  val reviewsModel: MutableLiveData<ReviewsModel> = MutableLiveData(ReviewsModel())

  var navArguments: Bundle? = null

  val reviewsList: MutableLiveData<MutableList<ReviewsRowModel>> = MutableLiveData(mutableListOf())
}
