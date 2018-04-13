package com.hope.hopeframetest.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 *  Author:  ForrestHope
 *  Date:  2018/4/13 0013
 *  FileName:  BaseActivity.java
 *  History:
 *
 **/
abstract class BaseActivity : AppCompatActivity() {

     var TAG: String? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        TAG=componentName.shortClassName

        initView()

        initData()
    }

    abstract fun setLayoutId(): Int

    abstract fun initView()

    protected open fun initData() {}

    override fun onResume() {
        super.onResume()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}