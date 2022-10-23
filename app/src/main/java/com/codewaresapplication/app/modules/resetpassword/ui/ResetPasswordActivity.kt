package com.codewaresapplication.app.modules.resetpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityResetPasswordBinding
import com.codewaresapplication.app.modules.resetpassword.`data`.viewmodel.ResetPasswordVM
import kotlin.String
import kotlin.Unit

class ResetPasswordActivity :
    BaseActivity<ActivityResetPasswordBinding>(R.layout.activity_reset_password) {
  private val viewModel: ResetPasswordVM by viewModels<ResetPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resetPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "RESET_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResetPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
