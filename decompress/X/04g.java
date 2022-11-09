// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.LinearLayout;

public class 04g extends LinearLayout
{
    public final int LIZ;
    public final int LIZIZ;
    
    static {
        Covode.recordClassIndex(552);
    }
    
    public 04g(final Context context, final AttributeSet set) {
        super(context, set);
        this.LIZ = this.getResources().getDimensionPixelOffset(2131165381);
        this.LIZIZ = this.getResources().getDimensionPixelOffset(2131165380);
    }
    
    public void onMeasure(final int n, final int n2) {
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(Math.min(this.getResources().getDisplayMetrics().widthPixels - this.LIZ * 2, this.LIZIZ), 1073741824), n2);
    }
}
