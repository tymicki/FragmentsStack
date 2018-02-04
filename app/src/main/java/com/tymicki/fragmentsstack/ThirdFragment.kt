package com.tymicki.fragmentsstack

import android.app.Fragment
import android.app.FragmentManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ThirdFragment : Fragment() {
    companion object {
        const val nameOnBackStack = "ThirdFragment"
        fun newInstance(): ThirdFragment {
            return ThirdFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.third_fragment, container, false)
    }

    override fun onStart() {
        super.onStart()
        val entryCount = fragmentManager.backStackEntryCount
        val name = fragmentManager.getBackStackEntryAt(entryCount - 2).name
        // pop current and previous fragment from the stack
        fragmentManager.popBackStack(name, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }

}