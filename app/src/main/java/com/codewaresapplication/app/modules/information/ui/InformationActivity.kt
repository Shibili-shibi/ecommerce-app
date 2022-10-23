package com.codewaresapplication.app.modules.information.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.codewaresapplication.app.databinding.ActivityInformationBinding
import com.codewaresapplication.app.modules.information.`data`.viewmodel.InformationVM
import kotlin.String
import kotlin.Unit

class InformationActivity : BaseActivity<ActivityInformationBinding>(R.layout.activity_information)
    {
  private val viewModel: InformationVM by viewModels<InformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.informationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "INFORMATION_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, InformationActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
