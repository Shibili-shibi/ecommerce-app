package com.codewaresapplication.app.modules.appnavigation.`data`.model

import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplashScreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnbording: String? = MyApp.getInstance().resources.getString(R.string.lbl_onbording)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnbordingTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_onbording_two)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnbordingOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_onbording_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExploreShop: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore_shop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUpSignIn: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sign_up_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInformation: String? = MyApp.getInstance().resources.getString(R.string.lbl_information)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerificationCode: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verification_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResetPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeTwoTabContainer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_home_two_tab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductView: String? = MyApp.getInstance().resources.getString(R.string.lbl_product_view)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_checkout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComplete: String? = MyApp.getInstance().resources.getString(R.string.lbl_complete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrackingOrder: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tracking_order)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderStatus: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsTabContainer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reviews_tab_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteAReview: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_write_a_review2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscountItems: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_discount_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSocialAccountLink: String? =
      MyApp.getInstance().resources.getString(R.string.msg_social_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSocialAccountLinkOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_social_account2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShare: String? = MyApp.getInstance().resources.getString(R.string.lbl_share)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChat: String? = MyApp.getInstance().resources.getString(R.string.lbl_chat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularItemsContainer: String? =
      MyApp.getInstance().resources.getString(R.string.msg_popular_items)

)
