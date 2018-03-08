package com.kongpingan.android.framework.application.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kongpingan.android.framework.R
import kotlinx.android.synthetic.main.activity_application.*

class ApplicationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application)
        click()
    }

    private fun click() {
        view_life_cycle_btn.setOnClickListener {
            startActivity(Intent(this, ViewLifeCycleActivity::class.java))
        }
    }
}
