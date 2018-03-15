package com.kongpingan.android.framework.application.view

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.orhanobut.logger.Logger

/**
 * Created by mr.kong on 2018/3/12.
 */
class Hencoder3 : View {
    private lateinit var mPaint: Paint
    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        Logger.e("构造方法")
    }

    /**
     *
     */
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }
}