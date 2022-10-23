package com.codewaresapplication.app.modules.verificationcode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.codewaresapplication.app.modules.verificationcode.`data`.model.VerificationCodeModel
import org.koin.core.KoinComponent

class VerificationCodeVM : ViewModel(), KoinComponent {
  val verificationCodeModel: MutableLiveData<VerificationCodeModel> =
      MutableLiveData(VerificationCodeModel())

  var navArguments: Bundle? = null
}
