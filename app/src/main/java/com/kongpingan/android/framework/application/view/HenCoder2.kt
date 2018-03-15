package com.kongpingan.android.framework.application.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.orhanobut.logger.Logger

/**
 * Created by mr.kong on 2018/3/9.
 */
class HenCoder2 : View {
    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        Logger.e("构造方法")
        initPaint()
    }

    private fun initPaint() {

    }
}