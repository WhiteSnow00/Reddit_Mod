// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 1sl extends 1ii
{
    static {
        Covode.recordClassIndex(5905);
    }
    
    public 1sl(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int dimensionPixelSize = this.getContext().getResources().getDimensionPixelSize(2131165780);
        int min = size;
        if (size > 0) {
            min = Math.min(dimensionPixelSize, (int)(size * 0.8f));
        }
        final int size2 = View$MeasureSpec.getSize(n2);
        final int dimensionPixelSize2 = this.getContext().getResources().getDimensionPixelSize(2131165779);
        int min2;
        if ((min2 = size2) > 0) {
            min2 = Math.min(dimensionPixelSize2, (int)(size2 * 0.84f));
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(min, View$MeasureSpec.getMode(n)), View$MeasureSpec.makeMeasureSpec(min2, View$MeasureSpec.getMode(n2)));
    }
}
