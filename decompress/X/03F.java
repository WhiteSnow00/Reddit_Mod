// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.LinearLayout$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.View;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.LinearLayout;

public class 03F extends LinearLayout
{
    public boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(420);
    }
    
    public 03F(final Context context, final AttributeSet set) {
        super(context, set);
        this.LIZIZ = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 2130969038 });
        if (Build$VERSION.SDK_INT >= 29) {
            this.saveAttributeDataForStyleable(context, new int[] { 2130969038 }, set, obtainStyledAttributes, 0, 0);
        }
        this.LIZ = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
    
    private int LIZ(int i) {
        while (i < this.getChildCount()) {
            if (this.getChildAt(i).getVisibility() == 0) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    private boolean LIZ() {
        return this.getOrientation() == 1;
    }
    
    private void setStacked(final boolean orientation) {
        this.setOrientation((int)(orientation ? 1 : 0));
        int gravity;
        if ((orientation ? 1 : 0) != 0) {
            gravity = 5;
        }
        else {
            gravity = 80;
        }
        this.setGravity(gravity);
        final View viewById = this.findViewById(2131371520);
        if (viewById != null) {
            int visibility;
            if ((orientation ? 1 : 0) != 0) {
                visibility = 8;
            }
            else {
                visibility = 4;
            }
            viewById.setVisibility(visibility);
        }
        for (int i = this.getChildCount() - 2; i >= 0; --i) {
            this.bringChildToFront(this.getChildAt(i));
        }
    }
    
    public int getMinimumHeight() {
        return Math.max(this.LIZJ, super.getMinimumHeight());
    }
    
    public void onMeasure(int minimumHeight, int n) {
        final int size = View$MeasureSpec.getSize(minimumHeight);
        final boolean liz = this.LIZ;
        final int n2 = 0;
        if (liz) {
            if (size > this.LIZIZ && this.LIZ()) {
                this.setStacked(false);
            }
            this.LIZIZ = size;
        }
        int measureSpec;
        int n3;
        if (!this.LIZ() && View$MeasureSpec.getMode(minimumHeight) == 1073741824) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            n3 = 1;
        }
        else {
            measureSpec = minimumHeight;
            n3 = 0;
        }
        super.onMeasure(measureSpec, n);
        Label_0113: {
            if (this.LIZ && !this.LIZ() && (this.getMeasuredWidthAndState() & 0xFF000000) == 0x1000000) {
                this.setStacked(true);
            }
            else if (n3 == 0) {
                break Label_0113;
            }
            super.onMeasure(minimumHeight, n);
        }
        final int liz2 = this.LIZ(0);
        minimumHeight = n2;
        if (liz2 >= 0) {
            final View child = this.getChildAt(liz2);
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)child.getLayoutParams();
            n = this.getPaddingTop() + child.getMeasuredHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin + 0;
            if (this.LIZ()) {
                final int liz3 = this.LIZ(liz2 + 1);
                minimumHeight = n;
                if (liz3 >= 0) {
                    minimumHeight = n + (this.getChildAt(liz3).getPaddingTop() + (int)(this.getResources().getDisplayMetrics().density * 16.0f));
                }
            }
            else {
                minimumHeight = n + this.getPaddingBottom();
            }
        }
        if (this.getMinimumHeight() != minimumHeight) {
            this.setMinimumHeight(minimumHeight);
        }
    }
    
    public void setAllowStacking(final boolean liz) {
        if (this.LIZ != liz) {
            this.LIZ = liz;
            if (!liz && this.getOrientation() == 1) {
                this.setStacked(false);
            }
            this.requestLayout();
        }
    }
}
