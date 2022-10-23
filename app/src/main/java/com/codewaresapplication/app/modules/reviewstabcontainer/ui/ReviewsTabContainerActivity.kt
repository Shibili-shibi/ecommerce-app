package com.codewaresapplication.app.modules.reviewstabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityReviewsTabContainerBinding
import com.codewaresapplication.app.modules.reviewstabcontainer.`data`.viewmodel.ReviewsTabContainerVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class ReviewsTabContainerActivity :
    BaseActivity<ActivityReviewsTabContainerBinding>(R.layout.activity_reviews_tab_container) {
  private val viewModel: ReviewsTabContainerVM by viewModels<ReviewsTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reviewsTabContainerVM = viewModel
    val adapter = ReviewsTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup18,binding.viewPagerTabbarview) { tab, position ->
      tab.text = ReviewsTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "REVIEWS_TAB_CONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ReviewsTabContainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
