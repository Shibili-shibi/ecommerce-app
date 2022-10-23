package com.codewaresapplication.app.modules.hometwotabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.di.MyApp
import com.codewaresapplication.app.modules.homeone.ui.HomeOneFragment
import com.codewaresapplication.app.modules.hometwo.ui.HomeTwoFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class HomeTwoTabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_all),MyApp.getInstance().resources.getString(R.string.lbl_summer),MyApp.getInstance().resources.getString(R.string.lbl_man),MyApp.getInstance().resources.getString(R.string.lbl_woman),MyApp.getInstance().resources.getString(R.string.lbl_kids))

        val viewPages: List<Fragment> =
                listOf(HomeOneFragment(),HomeOneFragment(),HomeTwoFragment(),HomeOneFragment(),HomeOneFragment())

    }
}
