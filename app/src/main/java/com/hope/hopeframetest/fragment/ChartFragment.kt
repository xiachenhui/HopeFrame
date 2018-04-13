package com.hope.hopeframetest.fragment

import android.util.Log
import android.view.View

import com.hope.hopeframetest.R
import com.hope.hopeframetest.base.BaseFragment

/**
 * Author:  ForrestHope
 * Date:  2018/4/13 0013
 * FileName:  DetailedFragment.java
 * History: 图表
 */

class ChartFragment : BaseFragment() {


    override fun initView() {
        Log.e(TAG,"图表初始化")
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_chart_layout
    }
}
