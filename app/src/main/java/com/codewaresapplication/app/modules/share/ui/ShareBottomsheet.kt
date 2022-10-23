package com.codewaresapplication.app.modules.share.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.codewaresapplication.app.databinding.BottomsheetShareBinding
import com.codewaresapplication.app.modules.share.`data`.viewmodel.ShareVM
import kotlin.String
import kotlin.Unit

class ShareBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetShareBinding>(R.layout.bottomsheet_share) {
  private val viewModel: ShareVM by viewModels<ShareVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.shareVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SHARE_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): ShareBottomsheet {
      val fragment = ShareBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
