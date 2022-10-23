package com.codewaresapplication.app.modules.writeareview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityWriteAReviewBinding
import com.codewaresapplication.app.modules.writeareview.`data`.viewmodel.WriteAReviewVM
import kotlin.String
import kotlin.Unit

class WriteAReviewActivity :
    BaseActivity<ActivityWriteAReviewBinding>(R.layout.activity_write_a_review) {
  private val viewModel: WriteAReviewVM by viewModels<WriteAReviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.writeAReviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "WRITE_A_REVIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WriteAReviewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
