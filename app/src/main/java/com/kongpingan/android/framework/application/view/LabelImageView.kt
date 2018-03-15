package com.kongpingan.android.framework.application.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.support.v7.widget.AppCompatImageView
import android.util.AttributeSet

/**
 * Created by mr.kong on 2018/3/8.
 * 图片角标自定义
 */
class LabelImageView : AppCompatImageView {
    private lateinit var textPaint: Paint
    private lateinit var backgroundPaint: Paint
    private lateinit var pathText: Path
    private lateinit var backgroundPath: Path
    /**
     * 梯形距离左上角的长度
     */
    private val LABEL_LENGTH = 100
    /**
     * 梯形斜边的长度
     */
    private val LABEL_HYPOTENUSE_LENGTH = 100

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()

    }

    private fun init() {
        textPaint = Paint()
        backgroundPaint = Paint()
        pathText = Path()
        backgroundPath = Path()

        textPaint.textSize = 50F
        textPaint.isFakeBoldText = true
        textPaint.color = Color.WHITE

        backgroundPaint.color = Color.RED
        backgroundPaint.style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        calculatePath(measuredWidth, measuredHeight)

        canvas.drawPath(backgroundPath, backgroundPaint)
        canvas.drawTextOnPath("Hot", pathText, 100F, -20F, textPaint)
    }

    override fun onDrawForeground(canvas: Canvas?) {
        super.onDrawForeground(canvas)
    }

    /**
     * 计算路径 画控件
     *            x1    x2
     * ...........*....*.....
     * .            .     . .
     * .               .    * y1
     * .                  . .
     * .                    * y2
     * .                    .
     * .                    .
     * ......................
     */
    private fun calculatePath(measuredWidth: Int, measuredHeight: Int) {
        val top = 0

        val x1 = measuredWidth - LABEL_LENGTH - LABEL_HYPOTENUSE_LENGTH
        val x2 = measuredWidth - LABEL_HYPOTENUSE_LENGTH
        val y1 = top + LABEL_LENGTH
        val y2 = top + LABEL_LENGTH + LABEL_HYPOTENUSE_LENGTH

        pathText.reset()
        pathText.moveTo(x1.toFloat(), top.toFloat())
        pathText.lineTo(measuredWidth.toFloat(), y2.toFloat())
        pathText.close()

        backgroundPath.reset() //清除Path设置的多有属性
        backgroundPath.moveTo(x1.toFloat(), top.toFloat()) //将起始点轮廓点移至x,y坐标点 默认的是0，0
        backgroundPath.lineTo(x2.toFloat(), top.toFloat()) //从当前轮廓点绘制一条从x到y的直线
        backgroundPath.lineTo(measuredWidth.toFloat(), y1.toFloat())
        backgroundPath.lineTo(measuredWidth.toFloat(), y2.toFloat())
        backgroundPath.close() //回到起始点形成封闭的曲线

    }

}