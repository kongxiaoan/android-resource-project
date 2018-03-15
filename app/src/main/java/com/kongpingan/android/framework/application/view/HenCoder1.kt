package com.kongpingan.android.framework.application.view

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.kongpingan.android.framework.R
import com.orhanobut.logger.Logger

/**
 * Created by mr.kong on 2018/3/9.
 */
class HenCoder1 : View {
    private val mPaint = Paint()

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        Logger.e("构造方法")
        initPaint()
    }

    /**
     * 使用着色器进行设置颜色
     * Shader
     */
    private fun initPaint() {
        //线性渐变
//        val shader = linearGradient()
        val shader = bitmapShader()
        /**
         * 同理
         * RadialGradient ：辐射渐变
         * SweepGradient ： 扫描渐变
         * BitmapShader ： 这个不是渐变 这个单独学习 用Bitmap的像素来作为图形或文字的填充
         * ComposeShader ：混合着色器 就是把两个着色器一起使用
         */
//        mPaint.shader = shader
    }

    private fun bitmapShader(): BitmapShader {
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.liqin)
        return BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
    }


    private fun linearGradient(): LinearGradient {
        val shader = LinearGradient(100f, 100f, 500f, 500f, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP)
        return shader
    }

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        canvas.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.liqin), 0f, 400f, mPaint)
        super.onDraw(canvas)
        canvas.drawCircle(300f, 300F, 200F, mPaint)
    }
}