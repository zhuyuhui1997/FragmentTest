package com.example.zyh.fragmenttest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by zyh on 16-7-15.
 */
public class MyLayout extends LinearLayout {
    public MyLayout(Context context) {
        super(context);
    }

    public MyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyLayout(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);
    }
    public  boolean onInterceptTouchEvent(MotionEvent event){
        return true;

    }
}
