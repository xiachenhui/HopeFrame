package com.hope.hopeframetest.application

import android.app.Application

/**
 * Author:  ForrestHope
 * Date:  2018/4/13 0013
 * FileName:  HopeApplication.java
 * History:
 */

class HopeApplication : Application() {
    var hopeApplication: HopeApplication? = null

    override fun onCreate() {
        super.onCreate()
        hopeApplication = this
    }

    fun getInstance(): HopeApplication? {
        return hopeApplication;

    }
}
