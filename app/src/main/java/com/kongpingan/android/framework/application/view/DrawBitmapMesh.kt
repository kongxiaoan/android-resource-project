package com.kongpingan.android.framework.application.view

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * Created by mr.kong on 2018/3/9.
 */
class DrawBitmapMesh : FrameLayout {
    //水波纹是否正在进行
    private var isRippling: Boolean = false
    private var bitmap: Bitmap? = null
    /**
     * 图片横向、纵向的格树
     */
    private val MESH_WIDTH = 20
    private val MESH_HEIGHT = 20
    //图片顶点数
    private val VERTS_COUNT = (MESH_WIDTH + 1) * (MESH_HEIGHT + 1)
    //原坐标数组
    private var orginVerts = FloatArray(VERTS_COUNT * 2)
    //转换后的坐标数组
    private val targetVerts = FloatArray(VERTS_COUNT * 2)

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    /**
     * 初始化bitmap
     */
    private fun init() {


    }

    /**
     * 绘制自己使用onDraw()方法 绘制孩子使用的是dispatchDraw()
     */
    override fun dispatchDraw(canvas: Canvas) {
        super.dispatchDraw(canvas)
        if (isRippling && bitmap != null) {
            //使用drawBitmapMesh（）实现水波纹 drawBitmapMesh会将位图分为若干网格 然后对每个网格进行扭曲处理
            /**
             * arg1:原图
             * arg2:横向上将源为划分成多少个
             * arg3:纵向上将源为划分成多少个
             * arg4:网格顶点坐标数组，记录扭曲后图片个定点的坐标，数组大小为（meshWidth + 1） * (meshHeight + 1) *2 + verOffset
             * arg5:记录从verts数组从第几个数组元素开始扭曲
             * arg6:设置网格顶点的颜色，该颜色会和位图对应像素的颜色叠加，数组大小为(meshWidth+1) * (meshHeight+1) + colorOffset
             * arg7:记录colors从几个数组元素中开始取色
             * arg8:画笔
             */
            canvas.drawBitmapMesh(bitmap, MESH_WIDTH, MESH_HEIGHT, targetVerts, 0, null, 0, null)
        } else {
            super.dispatchDraw(canvas)
        }
    }
}