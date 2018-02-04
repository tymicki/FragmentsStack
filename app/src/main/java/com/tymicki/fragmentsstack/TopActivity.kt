package com.tymicki.fragmentsstack

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.top_activity.*

class TopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.top_activity)

        startFirstFragmentButton.setOnClickListener { _ ->
            fragmentManager.beginTransaction().replace(R.id.topActivity, FirstFragment.newInstance(), null)
                    .addToBackStack(FirstFragment.nameOnBackStack).commit()
        }
    }
}
