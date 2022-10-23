package com.codewaresapplication.app.modules.complete.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityCompleteBinding
import com.codewaresapplication.app.modules.complete.`data`.viewmodel.CompleteVM
import kotlin.String
import kotlin.Unit

class CompleteActivity : BaseActivity<ActivityCompleteBinding>(R.layout.activity_complete) {
  private val viewModel: CompleteVM by viewModels<CompleteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.completeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMPLETE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CompleteActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
