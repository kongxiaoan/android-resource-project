package com.kongpingan.android.framework

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.kongpingan.android.framework.application.activity.ApplicationActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click()
        // Example of a call to a native method
//        sample_text.text = stringFromJNI()
    }

    private fun click() {
        application_btn.setOnClickListener {
            startActivity(Intent(this, ApplicationActivity::class.java))
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
//            System.loadLibrary("native-lib")
        }
    }
}
