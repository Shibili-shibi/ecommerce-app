package com.codewaresapplication.app.modules.search.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.codewaresapplication.app.R
import com.codewaresapplication.app.appcomponents.base.BaseFragment
import com.codewaresapplication.app.databinding.FragmentSearchBinding
import com.codewaresapplication.app.modules.search.`data`.model.ListunsplashqnuurFiveRowModel
import com.codewaresapplication.app.modules.search.`data`.model.ListunsplashqnuurRowModel
import com.codewaresapplication.app.modules.search.`data`.viewmodel.SearchVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listunsplashqnuurAdapter =
    ListunsplashqnuurAdapter(viewModel.listunsplashqnuurList.value?:mutableListOf())
    binding.recyclerListunsplashqnuur.adapter = listunsplashqnuurAdapter
    listunsplashqnuurAdapter.setOnItemClickListener(
    object : ListunsplashqnuurAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListunsplashqnuurRowModel) {
        onClickRecyclerListunsplashqnuur(view, position, item)
      }
    }
    )
    viewModel.listunsplashqnuurList.observe(requireActivity()) {
      listunsplashqnuurAdapter.updateData(it)
    }
    val listunsplashqnuurFiveAdapter =
    ListunsplashqnuurFiveAdapter(viewModel.listunsplashqnuurFiveList.value?:mutableListOf())
    binding.recyclerListunsplashqnuurFive.adapter = listunsplashqnuurFiveAdapter
    listunsplashqnuurFiveAdapter.setOnItemClickListener(
    object : ListunsplashqnuurFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListunsplashqnuurFiveRowModel) {
        onClickRecyclerListunsplashqnuurFive(view, position, item)
      }
    }
    )
    viewModel.listunsplashqnuurFiveList.observe(requireActivity()) {
      listunsplashqnuurFiveAdapter.updateData(it)
    }
    binding.searchVM = viewModel
    setUpSearchViewGroup1305Listener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListunsplashqnuur(
    view: View,
    position: Int,
    item: ListunsplashqnuurRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListunsplashqnuurFive(
    view: View,
    position: Int,
    item: ListunsplashqnuurFiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroup1305Listener(): Unit {
    binding.searchViewGroup1305.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_FRAGMENT"


      fun getInstance(bundle: Bundle?): SearchFragment {
        val fragment = SearchFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
