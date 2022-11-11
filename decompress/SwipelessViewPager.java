// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;

public class SwipelessViewPager extends ViewPager
{
    private boolean enabled;
    
    public SwipelessViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.enabled = false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.enabled && super.onInterceptTouchEvent(motionEvent);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.enabled && super.onTouchEvent(motionEvent);
    }
    
    public void setPagingEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
}
