package com.kongpingan.android.framework.application.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kongpingan.android.framework.R

class ViewLifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_life_cycle)
    }
}
