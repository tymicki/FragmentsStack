package com.tymicki.fragmentsstack

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondFragment : Fragment() {
    companion object {
        const val nameOnBackStack = "SecondFragment"
        fun newInstance(): SecondFragment {
            return SecondFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view: View = inflater!!.inflate(R.layout.second_fragment, container, false)
        val startThirdFragmentButton = view.findViewById<Button>(R.id.startThirdFragmentButton) as Button
        startThirdFragmentButton.setOnClickListener { _ ->
            fragmentManager.beginTransaction().replace(R.id.topActivity, ThirdFragment.newInstance())
                    .addToBackStack(ThirdFragment.nameOnBackStack).commit()
        }
        return view;
    }
}