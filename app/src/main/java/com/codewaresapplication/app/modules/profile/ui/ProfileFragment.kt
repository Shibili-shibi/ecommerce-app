package com.codewaresapplication.app.modules.profile.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseFragment
import com.codewaresapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.codewaresapplication.app.databinding.FragmentProfileBinding
import com.codewaresapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

class ProfileFragment : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(childFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ProfileFragment {
      val fragment = ProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
