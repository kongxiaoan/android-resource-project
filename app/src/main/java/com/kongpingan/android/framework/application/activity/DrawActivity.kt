package com.kongpingan.android.framework.application.activity

import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kongpingan.android.framework.R
import kotlinx.android.synthetic.main.activity_draw.*

class DrawActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw)

        draw_test_startActivity_btn.setOnClickListener({
            startActivity()
        })
    }

    private fun startActivity() {
        //一般情况下 在显示跳转中就不用判断了 主要是在影视跳转的时候
        val intent = Intent(this, ViewLifeCycleActivity::class.java)
        if (packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY) != null) {
            try {
                startActivity(intent)
            } catch (e: Exception) {

            }
        }
    }
}
