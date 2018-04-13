package com.hope.hopeframetest.fragment

import android.util.Log
import android.view.View

import com.hope.hopeframetest.R
import com.hope.hopeframetest.base.BaseFragment

/**
 * Author:  ForrestHope
 * Date:  2018/4/13 0013
 * FileName:  DetailedFragment.java
 * History: 发现
 */

class FindFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_find_layout
    }

    override fun initView() {
        Log.e(TAG,"发现初始化")
    }
}
