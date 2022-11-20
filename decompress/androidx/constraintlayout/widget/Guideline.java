// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class Guideline extends View
{
    public Guideline(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public Guideline(final Context context, final AttributeSet set) {
        super(context, set);
        super.setVisibility(8);
    }
    
    public final void draw(final Canvas canvas) {
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setGuidelineBegin(final int a) {
        final ConstraintLayout.a layoutParams = (ConstraintLayout.a)this.getLayoutParams();
        layoutParams.a = a;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelineEnd(final int b) {
        final ConstraintLayout.a layoutParams = (ConstraintLayout.a)this.getLayoutParams();
        layoutParams.b = b;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelinePercent(final float c) {
        final ConstraintLayout.a layoutParams = (ConstraintLayout.a)this.getLayoutParams();
        layoutParams.c = c;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setVisibility(final int n) {
    }
}
