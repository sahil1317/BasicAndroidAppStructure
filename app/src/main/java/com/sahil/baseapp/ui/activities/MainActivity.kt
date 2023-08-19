package com.sahil.baseapp.ui.activities

import android.os.Bundle
import com.sahil.baseapp.R
import com.sahil.baseapp.base.BaseActivity
import com.sahil.baseapp.databinding.ActivityMainBinding
import com.sahil.baseapp.util.goNextActivity

class MainActivity(override var layoutId: Int= R.layout.activity_main) : BaseActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}