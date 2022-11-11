// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1Pd extends 0Gh
{
    static {
        Covode.recordClassIndex(7566);
    }
    
    public 1Pd(final Context context, final AttributeSet set) {
        CTM.LIZ((Object)context);
        super(context, set);
        this.setClipChildren(false);
        this.setFadingEdgeLength(0);
    }
    
    @Override
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    @Override
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    @Override
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
}
