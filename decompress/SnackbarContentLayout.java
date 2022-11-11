// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View$MeasureSpec;
import java.util.WeakHashMap;
import android.view.View;
import a4.p0;
import android.content.res.TypedArray;
import pj2.u;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import wf.h;
import android.widget.LinearLayout;

public class SnackbarContentLayout extends LinearLayout implements h
{
    public TextView f;
    public Button g;
    public int h;
    public int i;
    
    public SnackbarContentLayout(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, u.P);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }
    
    public final boolean a(final int orientation, final int n, final int n2) {
        final int orientation2 = this.getOrientation();
        final boolean b = true;
        boolean b2;
        if (orientation != orientation2) {
            this.setOrientation(orientation);
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (((View)this.f).getPaddingTop() != n || ((View)this.f).getPaddingBottom() != n2) {
            final TextView f = this.f;
            final WeakHashMap a = p0.a;
            if (p0.e.g((View)f)) {
                p0.e.k((View)f, p0.e.f((View)f), n, p0.e.e((View)f), n2);
                b2 = b;
            }
            else {
                ((View)f).setPadding(((View)f).getPaddingLeft(), n, ((View)f).getPaddingRight(), n2);
                b2 = b;
            }
        }
        return b2;
    }
    
    public Button getActionView() {
        return this.g;
    }
    
    public TextView getMessageView() {
        return this.f;
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (TextView)((View)this).findViewById(2131431304);
        this.g = (Button)((View)this).findViewById(2131431303);
    }
    
    public final void onMeasure(int lineCount, final int n) {
        super.onMeasure(lineCount, n);
        int measureSpec = lineCount;
        if (this.h > 0) {
            final int measuredWidth = ((View)this).getMeasuredWidth();
            final int h = this.h;
            measureSpec = lineCount;
            if (measuredWidth > h) {
                measureSpec = View$MeasureSpec.makeMeasureSpec(h, 1073741824);
                super.onMeasure(measureSpec, n);
            }
        }
        int dimensionPixelSize = ((View)this).getResources().getDimensionPixelSize(2131165646);
        final int dimensionPixelSize2 = ((View)this).getResources().getDimensionPixelSize(2131165645);
        lineCount = this.f.getLayout().getLineCount();
        final int n2 = 0;
        if (lineCount > 1) {
            lineCount = 1;
        }
        else {
            lineCount = 0;
        }
        Label_0172: {
            if (lineCount != 0 && this.i > 0 && ((View)this.g).getMeasuredWidth() > this.i) {
                lineCount = n2;
                if (!this.a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    break Label_0172;
                }
            }
            else {
                if (lineCount == 0) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                lineCount = n2;
                if (!this.a(0, dimensionPixelSize, dimensionPixelSize)) {
                    break Label_0172;
                }
            }
            lineCount = 1;
        }
        if (lineCount != 0) {
            super.onMeasure(measureSpec, n);
        }
    }
    
    public void setMaxInlineActionWidth(final int i) {
        this.i = i;
    }
}
