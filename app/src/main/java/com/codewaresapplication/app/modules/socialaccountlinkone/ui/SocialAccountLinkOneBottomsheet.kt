package com.codewaresapplication.app.modules.socialaccountlinkone.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.codewaresapplication.app.databinding.BottomsheetSocialAccountLinkOneBinding
import com.codewaresapplication.app.modules.socialaccountlinkone.`data`.viewmodel.SocialAccountLinkOneVM
import kotlin.String
import kotlin.Unit

class SocialAccountLinkOneBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSocialAccountLinkOneBinding>(R.layout.bottomsheet_social_account_link_one)
    {
  private val viewModel: SocialAccountLinkOneVM by viewModels<SocialAccountLinkOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.socialAccountLinkOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SOCIAL_ACCOUNT_LINK_ONE_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): SocialAccountLinkOneBottomsheet {
      val fragment = SocialAccountLinkOneBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
