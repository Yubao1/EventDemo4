package com.xe.eventdemo4

import android.content.Context
import android.support.annotation.Nullable
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

/**
 * Created by 86188 on 2021/8/23.
 */
class MyView: View {
    constructor(context: Context): super(context) {

    }
    constructor(context: Context,@Nullable attrs: AttributeSet): super(context,attrs) {

    }
    constructor(context: Context, @Nullable attrs: AttributeSet,defStyleAttr: Int): super(context,attrs,defStyleAttr) {

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var consume: Boolean = super.onTouchEvent(event)
        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d(MainActivity.TAG,"--MotionEvent.ACTION_DOWN--isConsume = " + consume)
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d(MainActivity.TAG,"--MotionEvent.ACTION_MOVE--isConsume = " + consume)
            }
            MotionEvent.ACTION_UP -> {
                Log.d(MainActivity.TAG,"--MotionEvent.ACTION_UP--isConsume = " + consume)
            }
        }
        return consume
    }


}