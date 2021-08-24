package com.xe.eventdemo4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View

/**
 * Created by 86188 on 2021/8/23.
 */
class MainActivity: AppCompatActivity() {
    companion object {
        var TAG: String = "MainActivity"
    }
    var mView: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mView = findViewById(R.id.my_view)
        mView?.isLongClickable = false
        mView?.isContextClickable = false
        mView?.isClickable = true
        mView?.isEnabled = false
        mView?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d(TAG,"----onClick----")
            }
        })
    }
}