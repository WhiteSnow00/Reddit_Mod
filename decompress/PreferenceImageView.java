// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference.internal;

import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import a4.u1;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class PreferenceImageView extends ImageView
{
    public int f;
    public int g;
    
    public PreferenceImageView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, u1.s, 0, 0);
        this.setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        this.setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
    
    public int getMaxHeight() {
        return this.g;
    }
    
    public int getMaxWidth() {
        return this.f;
    }
    
    public final void onMeasure(int measureSpec, final int n) {
        final int mode = View$MeasureSpec.getMode(measureSpec);
        int measureSpec2 = 0;
        Label_0063: {
            if (mode != Integer.MIN_VALUE) {
                measureSpec2 = measureSpec;
                if (mode != 0) {
                    break Label_0063;
                }
            }
            final int size = View$MeasureSpec.getSize(measureSpec);
            final int maxWidth = this.getMaxWidth();
            measureSpec2 = measureSpec;
            if (maxWidth != Integer.MAX_VALUE) {
                if (maxWidth >= size) {
                    measureSpec2 = measureSpec;
                    if (mode != 0) {
                        break Label_0063;
                    }
                }
                measureSpec2 = View$MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        final int mode2 = View$MeasureSpec.getMode(n);
        Label_0122: {
            if (mode2 != Integer.MIN_VALUE) {
                measureSpec = n;
                if (mode2 != 0) {
                    break Label_0122;
                }
            }
            final int size2 = View$MeasureSpec.getSize(n);
            final int maxHeight = this.getMaxHeight();
            measureSpec = n;
            if (maxHeight != Integer.MAX_VALUE) {
                if (maxHeight >= size2) {
                    measureSpec = n;
                    if (mode2 != 0) {
                        break Label_0122;
                    }
                }
                measureSpec = View$MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(measureSpec2, measureSpec);
    }
    
    public void setMaxHeight(final int g) {
        super.setMaxHeight(this.g = g);
    }
    
    public void setMaxWidth(final int f) {
        super.setMaxWidth(this.f = f);
    }
}
