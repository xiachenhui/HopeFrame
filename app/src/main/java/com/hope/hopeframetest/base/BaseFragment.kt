package com.hope.hopeframetest.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Author:  ForrestHope
 * Date:  2018/4/13 0013
 * FileName:  BaseFragment.java
 * History:
 */

abstract class BaseFragment : Fragment() {

    lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = activity
        TAG = javaClass.simpleName

    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = View.inflate(mContext, getLayoutId(), null)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

        initData()
    }

    abstract fun getLayoutId(): Int

    abstract fun initView()

    protected open fun initData() {}

    companion object {
        var TAG: String? = null
    }


}
