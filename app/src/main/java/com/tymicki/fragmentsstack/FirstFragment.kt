package com.tymicki.fragmentsstack

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment() {
    companion object {
        const val nameOnBackStack = "FirstFragment"
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.first_fragment, container, false)
        val startSecondFragmentButton = view.findViewById<Button>(R.id.startSecondFragmentButton) as Button
        startSecondFragmentButton.setOnClickListener { _ ->
            fragmentManager.beginTransaction().replace(R.id.topActivity, SecondFragment.newInstance())
                    .addToBackStack(SecondFragment.nameOnBackStack).commit()
        }
        return view
    }
}
