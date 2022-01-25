package com.example.gestures


import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),
    GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener {


    private var detect: GestureDetectorCompat? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.detect = GestureDetectorCompat(this, this)
        this.detect?.setOnDoubleTapListener(this)
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.detect?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }


    // On first tap -- on up is lifting finger up
    @SuppressLint("SetTextI18n")
    override fun onDown(p0: MotionEvent?): Boolean {
        return true
    }


    @SuppressLint("SetTextI18n")
    override fun onShowPress(p0: MotionEvent?) {
    }


    @SuppressLint("SetTextI18n")
    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        return true
    }


    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        window.decorView.setBackgroundColor(Color.GREEN)
        return true
    }


    override fun onLongPress(p0: MotionEvent?) {
        window.decorView.setBackgroundColor(Color.YELLOW)
        idGestureTextOne.setTextColor(Color.BLUE)
        idGestureTextTwo.setTextColor(Color.BLUE)
        idGestureTextThree.setTextColor(Color.BLUE)
    }


    @SuppressLint("SetTextI18n")
    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        return true
    }


    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        return true
    }


    @SuppressLint("SetTextI18n")
    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        window.decorView.setBackgroundColor(Color.BLUE)
        idGestureTextOne.setTextColor(Color.WHITE)
        idGestureTextTwo.setTextColor(Color.WHITE)
        idGestureTextThree.setTextColor(Color.WHITE)
        return true
    }


    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        return true
    }


}

