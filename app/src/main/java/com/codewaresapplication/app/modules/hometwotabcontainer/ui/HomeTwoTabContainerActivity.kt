package com.codewaresapplication.app.modules.hometwotabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityHomeTwoTabContainerBinding
import com.codewaresapplication.app.modules.hometwotabcontainer.`data`.viewmodel.HomeTwoTabContainerVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class HomeTwoTabContainerActivity :
    BaseActivity<ActivityHomeTwoTabContainerBinding>(R.layout.activity_home_two_tab_container) {
  private val viewModel: HomeTwoTabContainerVM by viewModels<HomeTwoTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeTwoTabContainerVM = viewModel
    val adapter = HomeTwoTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutFrame8,binding.viewPagerTabbarview) { tab, position ->
      tab.text = HomeTwoTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "HOME_TWO_TAB_CONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeTwoTabContainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
