package com.kongpingan.android.framework.application.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.orhanobut.logger.Logger

/**
 * Created by mr.kong on 2018/3/9.
 */
class HenCoder : View {
    private var mPaint: Paint = Paint()

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        Logger.e("构造方法")
    }
    init {
        Logger.e("init 初始化方法")
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        Logger.e("onDraw 方法")
        canvas.drawCircle(300F, 300F, 200F, mPaint)
    }
}