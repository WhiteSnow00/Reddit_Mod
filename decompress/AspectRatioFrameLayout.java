// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import android.view.View;
import android.content.res.TypedArray;
import android.view.View$MeasureSpec;
import pd.r;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout
{
    public final b f;
    public float g;
    public int h;
    
    public AspectRatioFrameLayout(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        this.h = 0;
        if (set != null) {
            obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, r.X, 0, 0);
            try {
                this.h = ((TypedArray)obtainStyledAttributes).getInt(0, 0);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
        this.f = new b();
    }
    
    public int getResizeMode() {
        return this.h;
    }
    
    public final void onMeasure(int measuredWidth, int measuredHeight) {
        super.onMeasure(measuredWidth, measuredHeight);
        if (this.g <= 0.0f) {
            return;
        }
        measuredWidth = ((View)this).getMeasuredWidth();
        measuredHeight = ((View)this).getMeasuredHeight();
        final float n = (float)measuredWidth;
        final float n2 = (float)measuredHeight;
        final float n3 = this.g / (n / n2) - 1.0f;
        if (Math.abs(n3) <= 0.01f) {
            final b f = this.f;
            f.getClass();
            f.getClass();
            f.getClass();
            if (!f.f) {
                f.f = true;
                ((View)f.g).post((Runnable)f);
            }
            return;
        }
        final int h = this.h;
        Label_0221: {
            float n4 = 0.0f;
            Label_0214: {
                float n5;
                if (h != 0) {
                    if (h != 1) {
                        if (h == 2) {
                            n4 = this.g;
                            break Label_0214;
                        }
                        if (h != 4) {
                            break Label_0221;
                        }
                        if (n3 > 0.0f) {
                            n4 = this.g;
                            break Label_0214;
                        }
                        n5 = this.g;
                    }
                    else {
                        n5 = this.g;
                    }
                }
                else {
                    if (n3 <= 0.0f) {
                        n4 = this.g;
                        break Label_0214;
                    }
                    n5 = this.g;
                }
                measuredHeight = (int)(n / n5);
                break Label_0221;
            }
            measuredWidth = (int)(n2 * n4);
        }
        final b f2 = this.f;
        f2.getClass();
        f2.getClass();
        f2.getClass();
        if (!f2.f) {
            f2.f = true;
            ((View)f2.g).post((Runnable)f2);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View$MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
    
    public void setAspectRatio(final float g) {
        if (this.g != g) {
            this.g = g;
            ((View)this).requestLayout();
        }
    }
    
    public void setAspectRatioListener(final a a) {
    }
    
    public void setResizeMode(final int h) {
        if (this.h != h) {
            this.h = h;
            ((View)this).requestLayout();
        }
    }
    
    public interface a
    {
        void a();
    }
    
    public final class b implements Runnable
    {
        public boolean f;
        public final /* synthetic */ AspectRatioFrameLayout g;
        
        @Override
        public final void run() {
            this.f = false;
            AspectRatioFrameLayout.this.getClass();
        }
    }
}
