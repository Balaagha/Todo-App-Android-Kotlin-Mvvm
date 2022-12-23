package com.example.androidimpltemplate.menu.itemsenum

import com.example.androidimpltemplate.base.BaseFragment
import com.example.androidimpltemplate.ui.ExampleFragment

enum class MenuItemsEnum(name: String? = null, fragmentInstance: BaseFragment<*>?=null, navId: Int? = null) {

    MAIN_ACTIVITY("Main Activity Example"),
    EXAMPLE_FRAGMENT(fragmentInstance = ExampleFragment.newInstance());


    val mName: String?
    val mFragmentInstance: BaseFragment<*>?
    val mNavId: Int?

    init {
        mName = name
        mFragmentInstance = fragmentInstance
        mNavId =  navId
    }

}
