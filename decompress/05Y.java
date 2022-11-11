// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.View;

public class 05Y extends View
{
    static {
        Covode.recordClassIndex(636);
    }
    
    public 05Y(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public 05Y(final Context context, final AttributeSet set) {
        super(context, set);
        super.setVisibility(8);
    }
    
    public void draw(final Canvas canvas) {
    }
    
    public void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public void setGuidelineBegin(final int guideBegin) {
        final ConstraintLayout.a layoutParams = (ConstraintLayout.a)this.getLayoutParams();
        layoutParams.guideBegin = guideBegin;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelineEnd(final int guideEnd) {
        final ConstraintLayout.a layoutParams = (ConstraintLayout.a)this.getLayoutParams();
        layoutParams.guideEnd = guideEnd;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setGuidelinePercent(final float guidePercent) {
        final ConstraintLayout.a layoutParams = (ConstraintLayout.a)this.getLayoutParams();
        layoutParams.guidePercent = guidePercent;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setVisibility(final int n) {
    }
}
