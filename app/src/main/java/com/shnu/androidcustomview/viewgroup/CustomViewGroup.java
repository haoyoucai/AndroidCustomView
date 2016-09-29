package com.shnu.androidcustomview.viewgroup;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Author: ShenDanLai on 2016/9/28.
 * Email: 17721129316@163.com
 */

public class CustomViewGroup extends ViewGroup {
    public CustomViewGroup(Context context) {
        this(context,null);
    }


    public CustomViewGroup(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new MarginLayoutParams(getContext(),attrs);
    }
}
