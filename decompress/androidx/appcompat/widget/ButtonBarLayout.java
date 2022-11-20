// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import a4.l0$d;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.view.View;
import a4.l0;
import mg.d0;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout
{
    public boolean f;
    public boolean g;
    public int h;
    
    public ButtonBarLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.h = -1;
        final int[] h = d0.H;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, h);
        l0.k((View)this, context, h, set, obtainStyledAttributes, 0);
        this.f = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (this.getOrientation() == 1) {
            this.setStacked(this.f);
        }
    }
    
    private void setStacked(final boolean g) {
        if (this.g != g && (!g || this.f)) {
            this.setOrientation((int)((this.g = g) ? 1 : 0));
            int gravity;
            if (g) {
                gravity = 8388613;
            }
            else {
                gravity = 80;
            }
            this.setGravity(gravity);
            final View viewById = ((View)this).findViewById(2131431364);
            if (viewById != null) {
                int visibility;
                if (g) {
                    visibility = 8;
                }
                else {
                    visibility = 4;
                }
                viewById.setVisibility(visibility);
            }
            for (int i = ((ViewGroup)this).getChildCount() - 2; i >= 0; --i) {
                ((ViewGroup)this).bringChildToFront(((ViewGroup)this).getChildAt(i));
            }
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final boolean f = this.f;
        final int n3 = 0;
        if (f) {
            if (size > this.h && this.g) {
                this.setStacked(false);
            }
            this.h = size;
        }
        int measureSpec;
        boolean b;
        if (!this.g && View$MeasureSpec.getMode(n) == 1073741824) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            b = true;
        }
        else {
            measureSpec = n;
            b = false;
        }
        super.onMeasure(measureSpec, n2);
        boolean b2 = b;
        if (this.f) {
            b2 = b;
            if (!this.g) {
                final boolean b3 = (((View)this).getMeasuredWidthAndState() & 0xFF000000) == 0x1000000;
                b2 = b;
                if (b3) {
                    this.setStacked(true);
                    b2 = true;
                }
            }
        }
        if (b2) {
            super.onMeasure(n, n2);
        }
        final int childCount = ((ViewGroup)this).getChildCount();
        int n4 = 0;
        int n5;
        int n6;
        while (true) {
            n5 = -1;
            if (n4 >= childCount) {
                n6 = -1;
                break;
            }
            if (((ViewGroup)this).getChildAt(n4).getVisibility() == 0) {
                n6 = n4;
                break;
            }
            ++n4;
        }
        int minimumHeight = n3;
        Label_0347: {
            if (n6 >= 0) {
                final View child = ((ViewGroup)this).getChildAt(n6);
                final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
                final int n7 = 0 + (child.getMeasuredHeight() + ((View)this).getPaddingTop() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin);
                int paddingBottom;
                if (this.g) {
                    int n8 = n6 + 1;
                    final int childCount2 = ((ViewGroup)this).getChildCount();
                    int n9;
                    while (true) {
                        n9 = n5;
                        if (n8 >= childCount2) {
                            break;
                        }
                        if (((ViewGroup)this).getChildAt(n8).getVisibility() == 0) {
                            n9 = n8;
                            break;
                        }
                        ++n8;
                    }
                    minimumHeight = n7;
                    if (n9 < 0) {
                        break Label_0347;
                    }
                    paddingBottom = ((ViewGroup)this).getChildAt(n9).getPaddingTop() + (int)(((View)this).getResources().getDisplayMetrics().density * 16.0f);
                }
                else {
                    paddingBottom = ((View)this).getPaddingBottom();
                }
                minimumHeight = n7 + paddingBottom;
            }
        }
        final WeakHashMap a = l0.a;
        if (l0$d.d((View)this) != minimumHeight) {
            ((View)this).setMinimumHeight(minimumHeight);
            if (n2 == 0) {
                super.onMeasure(n, n2);
            }
        }
    }
    
    public void setAllowStacking(final boolean f) {
        if (this.f != f) {
            this.f = f;
            if (!f && this.g) {
                this.setStacked(false);
            }
            ((View)this).requestLayout();
        }
    }
}
