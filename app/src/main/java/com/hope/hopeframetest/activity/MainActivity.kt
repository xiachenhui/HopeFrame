package com.hope.hopeframetest.activity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.widget.RadioGroup
import com.hope.hopeframetest.R
import com.hope.hopeframetest.base.BaseActivity
import com.hope.hopeframetest.fragment.ChartFragment
import com.hope.hopeframetest.fragment.DetailedFragment
import com.hope.hopeframetest.fragment.FindFragment
import com.hope.hopeframetest.fragment.MeFragment

class MainActivity : BaseActivity(), RadioGroup.OnCheckedChangeListener {

    var mFragmentList: List<Fragment>? = null

    var mFmanager: FragmentManager? = null
    var mBgTransaction: FragmentTransaction? = null

    var mPosition: Int? = 0 //第几个fragment

    var mToFragment: Fragment? = null //要切换的fragment

    var main_rg:RadioGroup?=null

    override fun setLayoutId(): Int {
        return R.layout.activity_main_layout
    }

    override fun initView() {
        main_rg= findViewById(R.id.main_rg) as RadioGroup?

        main_rg?.setOnCheckedChangeListener(this)

    }


    override fun initData() {

        mFragmentList = ArrayList<Fragment>()
        (mFragmentList as ArrayList<Fragment>).add(DetailedFragment())
        (mFragmentList as ArrayList<Fragment>).add(ChartFragment())
        (mFragmentList as ArrayList<Fragment>).add(FindFragment())
        (mFragmentList as ArrayList<Fragment>).add(MeFragment())

        mToFragment=DetailedFragment()

        //添加默认的Fragment
        mFmanager = supportFragmentManager

        main_rg?.check(R.id.rb_detailed)


    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        when (checkedId) {
            R.id.rb_detailed -> mPosition = 0
            R.id.rb_chart -> mPosition = 1
            R.id.rb_find -> mPosition = 2
            R.id.rb_me -> mPosition = 3
        }
        switchFragment(mToFragment!!, mFragmentList?.get(this!!.mPosition!!)!!)

    }

    fun switchFragment(fromFragment: Fragment, toFragment: Fragment) {
        if (fromFragment != toFragment) {
            mBgTransaction = mFmanager?.beginTransaction()
            mToFragment = toFragment
            //判断有没有添加 ，然后再切换
            if (toFragment.isAdded) {
                //如果已经添加了可以直接切换
                if (fromFragment != null) {
                    mBgTransaction?.hide(fromFragment)
                }

                if (toFragment != null) {
                    mBgTransaction?.show(toFragment)
                    mBgTransaction?.commit()
                }

            } else {
                if (fromFragment != null) {
                    mBgTransaction?.hide(fromFragment)
                }
                if (toFragment != null) {
                    //如果没有添加 需要先添加
                    mBgTransaction?.add(R.id.main_framlayout, toFragment)
                    mBgTransaction?.commit()
                }
            }

        }


    }


}
