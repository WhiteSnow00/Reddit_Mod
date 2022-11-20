// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.view.View;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import com.twitter.sdk.android.tweetui.R$styleable;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class AspectRatioFrameLayout extends FrameLayout
{
    public static final int ADJUST_DIMENSION_HEIGHT = 0;
    public static final int ADJUST_DIMENSION_WIDTH = 1;
    private static final int DEFAULT_ADJUST_DIMENSION = 0;
    private static final float DEFAULT_ASPECT_RATIO = 1.0f;
    public double aspectRatio;
    private int dimensionToAdjust;
    
    public AspectRatioFrameLayout(final Context context) {
        this(context, null);
    }
    
    public AspectRatioFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AspectRatioFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.initAttributes(n);
    }
    
    private void initAttributes(final int n) {
        final TypedArray obtainStyledAttributes = ((View)this).getContext().getTheme().obtainStyledAttributes(n, R$styleable.AspectRatioFrameLayout);
        try {
            this.aspectRatio = obtainStyledAttributes.getFloat(R$styleable.AspectRatioFrameLayout_tw__frame_layout_aspect_ratio, 1.0f);
            this.dimensionToAdjust = obtainStyledAttributes.getInt(R$styleable.AspectRatioFrameLayout_tw__frame_layout_dimension_to_adjust, 0);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public void onMeasure(int n, int n2) {
        final int n3 = ((View)this).getPaddingRight() + ((View)this).getPaddingLeft();
        final int n4 = ((View)this).getPaddingTop() + ((View)this).getPaddingBottom();
        if (this.dimensionToAdjust == 0) {
            if (View$MeasureSpec.getMode(n) == 1073741824) {
                n = View$MeasureSpec.getSize(n);
            }
            else {
                super.onMeasure(n, n2);
                n = ((View)this).getMeasuredWidth();
            }
            n2 = n - n3;
            n = (int)(n2 / this.aspectRatio);
        }
        else {
            if (View$MeasureSpec.getMode(n2) == 1073741824) {
                n = View$MeasureSpec.getSize(n2);
            }
            else {
                super.onMeasure(n, n2);
                n = ((View)this).getMeasuredHeight();
            }
            n -= n4;
            n2 = (int)(n * this.aspectRatio);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n2 + n3, 1073741824), View$MeasureSpec.makeMeasureSpec(n + n4, 1073741824));
    }
    
    public void setAspectRatio(final double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }
}
