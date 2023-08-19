package com.sahil.baseapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sahil.baseapp.R
import com.sahil.baseapp.base.BaseFragment
import com.sahil.baseapp.databinding.FragmentSplashBinding


class SplashFragment(override var layoutId: Int=R.layout.fragment_splash) : BaseFragment<FragmentSplashBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}