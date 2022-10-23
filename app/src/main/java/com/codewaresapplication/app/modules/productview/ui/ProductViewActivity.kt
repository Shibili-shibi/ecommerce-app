package com.codewaresapplication.app.modules.productview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityProductViewBinding
import com.codewaresapplication.app.modules.productview.`data`.viewmodel.ProductViewVM
import kotlin.String
import kotlin.Unit

class ProductViewActivity : BaseActivity<ActivityProductViewBinding>(R.layout.activity_product_view)
    {
  private val viewModel: ProductViewVM by viewModels<ProductViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.productViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PRODUCT_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
