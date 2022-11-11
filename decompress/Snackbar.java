// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View$OnClickListener;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import a4.c2;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;

public final class Snackbar extends BaseTransientBottomBar<Snackbar>
{
    public static final int[] s;
    public final AccessibilityManager q;
    public boolean r;
    
    static {
        s = new int[] { 2130969806, 2130969808 };
    }
    
    public Snackbar(final ViewGroup viewGroup, final SnackbarContentLayout snackbarContentLayout, final SnackbarContentLayout snackbarContentLayout2) {
        super(viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.q = (AccessibilityManager)((View)viewGroup).getContext().getSystemService("accessibility");
    }
    
    @Override
    public final void a() {
        this.b(3);
    }
    
    public final int f() {
        final int e = super.e;
        if (e == -2) {
            return -2;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            int n;
            if (this.r) {
                n = 4;
            }
            else {
                n = 0;
            }
            return c2.c(this.q, e, n | 0x1 | 0x2);
        }
        int n2 = e;
        if (this.r) {
            n2 = e;
            if (this.q.isTouchExplorationEnabled()) {
                n2 = -2;
            }
        }
        return n2;
    }
    
    public static final class SnackbarLayout extends g
    {
        public SnackbarLayout(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public final void onMeasure(int i, int measuredWidth) {
            super.onMeasure(i, measuredWidth);
            final int childCount = ((ViewGroup)this).getChildCount();
            measuredWidth = ((View)this).getMeasuredWidth();
            final int paddingLeft = ((View)this).getPaddingLeft();
            final int paddingRight = ((View)this).getPaddingRight();
            View child;
            for (i = 0; i < childCount; ++i) {
                child = ((ViewGroup)this).getChildAt(i);
                if (child.getLayoutParams().width == -1) {
                    child.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth - paddingLeft - paddingRight, 1073741824), View$MeasureSpec.makeMeasureSpec(child.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }
}
