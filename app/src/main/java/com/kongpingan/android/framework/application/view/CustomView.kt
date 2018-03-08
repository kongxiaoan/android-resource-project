package com.kongpingan.android.framework.application.view

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import com.orhanobut.logger.Logger

/**
 * Created by mr.kong on 2018/3/8.
 *
 */
class CustomView : View {

    constructor(context: Context?) : this(context, null) {
        Logger.e("CustomView()")
    }

    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0) {
        Logger.e("CustomView()")
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        Logger.e("CustomView()")
    }

    /**
     * 当View在XML中加载完成的时候调用
     */
    override fun onFinishInflate() {
        super.onFinishInflate()
        Logger.e("onFinishInflate 布局中View已经加载完成")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Logger.e("onMeasure 测量view及子View的大小")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Logger.e("onLayout 布局view及子View的大小")

    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Logger.e("onSizeChanged 布局的大小发生改变的时候")

    }

    /**
     * 物理按键
     */
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        Logger.e("物理按键")
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Logger.e("物理按键")
        return super.onKeyUp(keyCode, event)
    }

    /**
     * 触摸事件
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Logger.e("触摸事件")
        return super.onTouchEvent(event)
    }

    /**
     * 失去焦点时
     */
    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        Logger.e("View 失去焦点时调用")
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
    }

    /**
     * View被关联到窗口时调用
     */
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Logger.e("View被关联到窗口时调用")
    }

    /**
     * View被分离到窗口时调用
     */
    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Logger.e("View被分离到窗口时调用")
    }

    /**
     * 可见性发生变化
     */
    override fun onVisibilityChanged(changedView: View?, visibility: Int) {
        super.onVisibilityChanged(changedView, visibility)
        Logger.e("View可见性发生变化的时候调用$visibility")
    }

    /**
     * 所在窗口发生变化的时候
     */
    override fun onWindowVisibilityChanged(visibility: Int) {
        super.onWindowVisibilityChanged(visibility)
        Logger.e("所在窗口发生变化的时候$visibility")
    }

    /**
     * Activity生命周期中，onStart, onResume, onCreate都不是真正visible的时间点，
     * 真正的visible时间点是onWindowFocusChanged()函数被执行时。
     */
    override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
        super.onWindowFocusChanged(hasWindowFocus)
        if (hasWindowFocus) {

        }
    }
}