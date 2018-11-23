package com.erving.doctor.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.erving.doctor.R

class Check : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              FrasavedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_check, container, false)
    }

}
