package com.codewaresapplication.app.modules.signupsignin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivitySignUpSignInBinding
import com.codewaresapplication.app.modules.signupsignin.`data`.viewmodel.SignUpSignInVM
import kotlin.String
import kotlin.Unit

class SignUpSignInActivity :
    BaseActivity<ActivitySignUpSignInBinding>(R.layout.activity_sign_up_sign_in) {
  private val viewModel: SignUpSignInVM by viewModels<SignUpSignInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpSignInVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_SIGN_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpSignInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
