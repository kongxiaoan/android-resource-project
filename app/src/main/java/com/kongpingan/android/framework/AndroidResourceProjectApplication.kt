package com.kongpingan.android.framework

import android.app.Application
import com.kongpingan.android.framework.utils.ConfigDebug
import com.orhanobut.logger.Logger

/**
 * Created by mr.kong on 2018/3/8.
 *
 */
class AndroidResourceProjectApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initLogger()
    }

    private fun initLogger() {
        Logger.init(ConfigDebug.TAG)
                .methodCount(3)
                .hideThreadInfo()
    }
}