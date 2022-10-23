package com.codewaresapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseActivity
import com.codewaresapplication.app.databinding.ActivityAppNavigationBinding
import com.codewaresapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.codewaresapplication.app.modules.chat.ui.ChatActivity
import com.codewaresapplication.app.modules.checkout.ui.CheckoutActivity
import com.codewaresapplication.app.modules.complete.ui.CompleteActivity
import com.codewaresapplication.app.modules.discountitems.ui.DiscountItemsActivity
import com.codewaresapplication.app.modules.exploreshop.ui.ExploreShopActivity
import com.codewaresapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.codewaresapplication.app.modules.hometwotabcontainer.ui.HomeTwoTabContainerActivity
import com.codewaresapplication.app.modules.information.ui.InformationActivity
import com.codewaresapplication.app.modules.logout.ui.LogoutBottomsheet
import com.codewaresapplication.app.modules.notification.ui.NotificationActivity
import com.codewaresapplication.app.modules.onbording.ui.OnbordingActivity
import com.codewaresapplication.app.modules.onbordingone.ui.OnbordingOneActivity
import com.codewaresapplication.app.modules.onbordingtwo.ui.OnbordingTwoActivity
import com.codewaresapplication.app.modules.orderstatus.ui.OrderStatusActivity
import com.codewaresapplication.app.modules.popularitemscontainer.ui.PopularItemsContainerActivity
import com.codewaresapplication.app.modules.productview.ui.ProductViewActivity
import com.codewaresapplication.app.modules.resetpassword.ui.ResetPasswordActivity
import com.codewaresapplication.app.modules.reviewstabcontainer.ui.ReviewsTabContainerActivity
import com.codewaresapplication.app.modules.settings.ui.SettingsActivity
import com.codewaresapplication.app.modules.share.ui.ShareBottomsheet
import com.codewaresapplication.app.modules.signin.ui.SignInActivity
import com.codewaresapplication.app.modules.signup.ui.SignUpActivity
import com.codewaresapplication.app.modules.signupsignin.ui.SignUpSignInActivity
import com.codewaresapplication.app.modules.socialaccountlink.ui.SocialAccountLinkActivity
import com.codewaresapplication.app.modules.socialaccountlinkone.ui.SocialAccountLinkOneBottomsheet
import com.codewaresapplication.app.modules.splashscreen.ui.SplashScreenActivity
import com.codewaresapplication.app.modules.trackingorder.ui.TrackingOrderActivity
import com.codewaresapplication.app.modules.verificationcode.ui.VerificationCodeActivity
import com.codewaresapplication.app.modules.writeareview.ui.WriteAReviewActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearResetPassword.setOnClickListener {
      val destIntent = ResetPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearShare.setOnClickListener {
      val destFragment = ShareBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, ShareBottomsheet.TAG)
    }
    binding.linearChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogout.setOnClickListener {
      val destFragment = LogoutBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, LogoutBottomsheet.TAG)
    }
    binding.linearInformation.setOnClickListener {
      val destIntent = InformationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettings.setOnClickListener {
      val destIntent = SettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPopularItemsContainer.setOnClickListener {
      val destIntent = PopularItemsContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExploreShop.setOnClickListener {
      val destIntent = ExploreShopActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProductView.setOnClickListener {
      val destIntent = ProductViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearComplete.setOnClickListener {
      val destIntent = CompleteActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnbordingOne.setOnClickListener {
      val destIntent = OnbordingOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOrderStatus.setOnClickListener {
      val destIntent = OrderStatusActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSocialAccountLink.setOnClickListener {
      val destIntent = SocialAccountLinkActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearWriteAReview.setOnClickListener {
      val destIntent = WriteAReviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDiscountItems.setOnClickListener {
      val destIntent = DiscountItemsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSocialAccountLinkOne.setOnClickListener {
      val destFragment = SocialAccountLinkOneBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, SocialAccountLinkOneBottomsheet.TAG)
    }
    binding.linearOnbordingTwo.setOnClickListener {
      val destIntent = OnbordingTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTrackingOrder.setOnClickListener {
      val destIntent = TrackingOrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCheckout.setOnClickListener {
      val destIntent = CheckoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomeTwoTabContainer.setOnClickListener {
      val destIntent = HomeTwoTabContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUpSignIn.setOnClickListener {
      val destIntent = SignUpSignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearReviewsTabContainer.setOnClickListener {
      val destIntent = ReviewsTabContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOnbording.setOnClickListener {
      val destIntent = OnbordingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearVerificationCode.setOnClickListener {
      val destIntent = VerificationCodeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
