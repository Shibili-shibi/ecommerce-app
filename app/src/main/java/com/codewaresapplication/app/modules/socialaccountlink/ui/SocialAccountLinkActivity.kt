package com.codewaresapplication.app.modules.socialaccountlink.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivitySocialAccountLinkBinding
import com.codewaresapplication.app.modules.socialaccountlink.`data`.model.ListfacebookRowModel
import com.codewaresapplication.app.modules.socialaccountlink.`data`.viewmodel.SocialAccountLinkVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SocialAccountLinkActivity :
    BaseActivity<ActivitySocialAccountLinkBinding>(R.layout.activity_social_account_link) {
  private val viewModel: SocialAccountLinkVM by viewModels<SocialAccountLinkVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfacebookAdapter =
    ListfacebookAdapter(viewModel.listfacebookList.value?:mutableListOf())
    binding.recyclerListfacebook.adapter = listfacebookAdapter
    listfacebookAdapter.setOnItemClickListener(
    object : ListfacebookAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfacebookRowModel) {
        onClickRecyclerListfacebook(view, position, item)
      }
    }
    )
    viewModel.listfacebookList.observe(this) {
      listfacebookAdapter.updateData(it)
    }
    binding.socialAccountLinkVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListfacebook(
    view: View,
    position: Int,
    item: ListfacebookRowModel
  ): Unit {
    when(view.id) {
      R.id.imageFacebook -> {
        onClickRecyclerListfacebookImageFacebook(view, position, item)
      }
    }
  }

  fun onClickRecyclerListfacebookImageFacebook(
    view: View,
    position: Int,
    item: ListfacebookRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
    }
  }

  companion object {
    const val TAG: String = "SOCIAL_ACCOUNT_LINK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SocialAccountLinkActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
