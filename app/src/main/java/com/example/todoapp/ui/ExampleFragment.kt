package com.example.todoapp.ui

import com.example.todoapp.base.BaseFragment
import com.example.todoapp.databinding.FragmentExampleBinding

class ExampleFragment : BaseFragment<FragmentExampleBinding>(FragmentExampleBinding::inflate) {

    override fun setup() { }

    companion object {
        @JvmStatic
        fun newInstance() = ExampleFragment()
    }
}