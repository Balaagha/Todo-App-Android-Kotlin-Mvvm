package com.example.todoapp.menu.view

import android.content.Intent
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.todoapp.R
import com.example.todoapp.base.BaseFragment
import com.example.todoapp.databinding.FragmentMenuItemListBinding
import com.example.todoapp.menu.adapter.MenuItemsArrayAdapter
import com.example.todoapp.menu.itemsenum.MenuItemsEnum
import com.example.todoapp.menu.viewmodel.MenuViewModel
import com.example.todoapp.ui.MainActivity
import com.example.todoapp.utils.extentions.isNotNull
import com.example.todoapp.utils.extentions.navigateToTargetFragment

class MenuItemListFragment :
    BaseFragment<FragmentMenuItemListBinding>(FragmentMenuItemListBinding::inflate),
    MenuItemsArrayAdapter.Listener {

    private val viewModel by viewModels<MenuViewModel>() // activityViewModels<MenuViewModel>()

    override var statusBarVisibility: Boolean? = true

    private lateinit var mAdapterScreensReachableFromMenu: MenuItemsArrayAdapter

    override fun setup() {
        initMenuAdapter()
    }

    private fun initMenuAdapter() {
        mAdapterScreensReachableFromMenu =
            MenuItemsArrayAdapter(requireContext(), viewModel.getMenuList(), this)
        binding.listScreens.adapter = mAdapterScreensReachableFromMenu
    }

    override fun onMenuItemClicked(menuItem: MenuItemsEnum?) {
        when (menuItem) {
            MenuItemsEnum.MAIN_ACTIVITY -> {
                startActivity(Intent(requireContext(), MainActivity::class.java))
            }
            else -> {
                if (menuItem?.mNavId.isNotNull()) {
                    findNavController().navigate(menuItem?.mNavId!!)
                } else if (menuItem?.mFragmentInstance.isNotNull()) {
                    this.navigateToTargetFragment(
                        containerId = R.id.navHostFragment,
                        menuItem?.mFragmentInstance!!
                    )
                }
            }
        }
    }
}