package com.codewaresapplication.app.modules.popularitemscontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityPopularItemsContainerBinding
import com.codewaresapplication.app.extensions.loadFragment
import com.codewaresapplication.app.modules.mycart.ui.MyCartFragment
import com.codewaresapplication.app.modules.popularitems.ui.PopularItemsFragment
import com.codewaresapplication.app.modules.popularitemscontainer.`data`.viewmodel.PopularItemsContainerVM
import com.codewaresapplication.app.modules.profile.ui.ProfileFragment
import com.codewaresapplication.app.modules.search.ui.SearchFragment
import kotlin.String
import kotlin.Unit

class PopularItemsContainerActivity :
    BaseActivity<ActivityPopularItemsContainerBinding>(R.layout.activity_popular_items_container) {
  private val viewModel: PopularItemsContainerVM by viewModels<PopularItemsContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.popularItemsContainerVM = viewModel
    val destFragment = PopularItemsFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = PopularItemsFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectangletwo.setOnClickListener {
      val destFragment = PopularItemsFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = PopularItemsFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageUser.setOnClickListener {
      val destFragment = ProfileFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = ProfileFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageCart.setOnClickListener {
      val destFragment = MyCartFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = MyCartFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageSearchOne.setOnClickListener {
      val destFragment = SearchFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = SearchFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "POPULAR_ITEMS_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopularItemsContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
