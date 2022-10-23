package com.codewaresapplication.app.modules.onbordingtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityOnbordingTwoBinding
import com.codewaresapplication.app.modules.onbordingtwo.`data`.viewmodel.OnbordingTwoVM
import kotlin.String
import kotlin.Unit

class OnbordingTwoActivity :
    BaseActivity<ActivityOnbordingTwoBinding>(R.layout.activity_onbording_two) {
  private val viewModel: OnbordingTwoVM by viewModels<OnbordingTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onbordingTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ONBORDING_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnbordingTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
