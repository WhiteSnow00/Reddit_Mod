// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 09c
{
    public int LIZ;
    
    static {
        Covode.recordClassIndex(1005);
    }
    
    public 09c(final View view, final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(set, new int[] { 2130970648 }, 16842862, 0);
            this.LIZ = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }
}
