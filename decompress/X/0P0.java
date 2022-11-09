// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 0p0
{
    static {
        Covode.recordClassIndex(8051);
    }
    
    public static final void LIZ(final View view, final int width) {
        CTM.LIZ((Object)view);
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = width;
            view.setLayoutParams(layoutParams);
        }
    }
}
