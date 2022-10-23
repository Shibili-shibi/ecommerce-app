package com.codewaresapplication.app.modules.onbording.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityOnbordingBinding
import com.codewaresapplication.app.modules.onbording.`data`.viewmodel.OnbordingVM
import kotlin.String
import kotlin.Unit

class OnbordingActivity : BaseActivity<ActivityOnbordingBinding>(R.layout.activity_onbording) {
  private val viewModel: OnbordingVM by viewModels<OnbordingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onbordingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ONBORDING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnbordingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
