package com.sahil.baseapp.util

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


fun <T>AppCompatActivity.goNextActivity(
  secondClass: Class<T>,
  bundle:Bundle=Bundle(), finish:Boolean=false){
    val intent=Intent(this,secondClass )
    intent.putExtras(bundle)
    this.startActivity(intent)
    if(finish){
        this.finish()
    }
}

fun Fragment.goNextFragment(id:Int, bundle: Bundle= Bundle()){
  this.findNavController().navigate(id,bundle)
}


