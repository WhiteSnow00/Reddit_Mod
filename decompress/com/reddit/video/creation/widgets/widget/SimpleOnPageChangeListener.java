// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget;

import androidx.viewpager.widget.ViewPager$j;

public abstract class SimpleOnPageChangeListener implements ViewPager$j
{
    public void onPageScrollStateChanged(final int n) {
    }
    
    public void onPageScrolled(final int n, final float n2, final int n3) {
    }
    
    public abstract void onPageSelected(final int p0);
}
