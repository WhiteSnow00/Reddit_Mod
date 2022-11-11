// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerFixed extends ViewPager
{
    public ViewPagerFixed(final Context context) {
        super(context);
    }
    
    public ViewPagerFixed(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        }
        catch (final IllegalArgumentException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        }
        catch (final IllegalArgumentException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
