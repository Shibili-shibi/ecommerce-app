package com.codewaresapplication.app.modules.notification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityNotificationBinding
import com.codewaresapplication.app.modules.notification.`data`.model.Listunsplashqnuur1RowModel
import com.codewaresapplication.app.modules.notification.`data`.model.ListunsplashqnuurThreeRowModel
import com.codewaresapplication.app.modules.notification.`data`.viewmodel.NotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listunsplashqnuurAdapter =
    ListunsplashqnuurAdapter(viewModel.listunsplashqnuurList.value?:mutableListOf())
    binding.recyclerListunsplashqnuur.adapter = listunsplashqnuurAdapter
    listunsplashqnuurAdapter.setOnItemClickListener(
    object : ListunsplashqnuurAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listunsplashqnuur1RowModel) {
        onClickRecyclerListunsplashqnuur(view, position, item)
      }
    }
    )
    viewModel.listunsplashqnuurList.observe(this) {
      listunsplashqnuurAdapter.updateData(it)
    }
    val listunsplashqnuurThreeAdapter =
    ListunsplashqnuurThreeAdapter(viewModel.listunsplashqnuurThreeList.value?:mutableListOf())
    binding.recyclerListunsplashqnuurThree.adapter = listunsplashqnuurThreeAdapter
    listunsplashqnuurThreeAdapter.setOnItemClickListener(
    object : ListunsplashqnuurThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListunsplashqnuurThreeRowModel) {
        onClickRecyclerListunsplashqnuurThree(view, position, item)
      }
    }
    )
    viewModel.listunsplashqnuurThreeList.observe(this) {
      listunsplashqnuurThreeAdapter.updateData(it)
    }
    binding.notificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListunsplashqnuur(
    view: View,
    position: Int,
    item: Listunsplashqnuur1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListunsplashqnuurThree(
    view: View,
    position: Int,
    item: ListunsplashqnuurThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
