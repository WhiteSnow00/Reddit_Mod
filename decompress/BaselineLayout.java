// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup
{
    public int f;
    
    public BaselineLayout(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.f = -1;
    }
    
    public int getBaseline() {
        return this.f;
    }
    
    public final void onLayout(final boolean b, final int n, int i, final int n2, int n3) {
        final int childCount = this.getChildCount();
        final int paddingLeft = ((View)this).getPaddingLeft();
        final int paddingRight = ((View)this).getPaddingRight();
        final int paddingTop = ((View)this).getPaddingTop();
        View child;
        int measuredWidth;
        int measuredHeight;
        int n4;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n4 = (n2 - n - paddingRight - paddingLeft - measuredWidth) / 2 + paddingLeft;
                if (this.f != -1 && child.getBaseline() != -1) {
                    n3 = this.f + paddingTop - child.getBaseline();
                }
                else {
                    n3 = paddingTop;
                }
                child.layout(n4, n3, measuredWidth + n4, measuredHeight + n3);
            }
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3;
        int f = n3 = -1;
        final int n4 = 0;
        int max;
        int combineMeasuredStates = max = n4;
        int max2 = n4;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                this.measureChild(child, n, n2);
                final int baseline = child.getBaseline();
                int max3 = f;
                int max4 = n3;
                if (baseline != -1) {
                    max3 = Math.max(f, baseline);
                    max4 = Math.max(n3, child.getMeasuredHeight() - baseline);
                }
                max = Math.max(max, child.getMeasuredWidth());
                max2 = Math.max(max2, child.getMeasuredHeight());
                combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, child.getMeasuredState());
                n3 = max4;
                f = max3;
            }
            ++i;
        }
        int max5 = max2;
        if (f != -1) {
            max5 = Math.max(max2, Math.max(n3, ((View)this).getPaddingBottom()) + f);
            this.f = f;
        }
        ((View)this).setMeasuredDimension(View.resolveSizeAndState(Math.max(max, ((View)this).getSuggestedMinimumWidth()), n, combineMeasuredStates), View.resolveSizeAndState(Math.max(max5, ((View)this).getSuggestedMinimumHeight()), n2, combineMeasuredStates << 16));
    }
}
