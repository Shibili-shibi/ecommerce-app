package com.codewaresapplication.app.modules.onbordingone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityOnbordingOneBinding
import com.codewaresapplication.app.modules.onbordingone.`data`.viewmodel.OnbordingOneVM
import kotlin.String
import kotlin.Unit

class OnbordingOneActivity :
    BaseActivity<ActivityOnbordingOneBinding>(R.layout.activity_onbording_one) {
  private val viewModel: OnbordingOneVM by viewModels<OnbordingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onbordingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ONBORDING_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnbordingOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
