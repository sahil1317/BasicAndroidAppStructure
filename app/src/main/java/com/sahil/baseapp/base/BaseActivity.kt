package com.sahil.baseapp.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract open class BaseActivity<T : ViewDataBinding >() : AppCompatActivity() {

    abstract var layoutId: Int
    lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,layoutId)
    }
}