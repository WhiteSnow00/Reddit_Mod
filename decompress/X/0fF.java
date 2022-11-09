// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.AttributeSet;
import android.content.res.TypedArray;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class 0ff
{
    static {
        Covode.recordClassIndex(6119);
    }
    
    public final void LIZ(final Context context, final int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, this.LIZ());
        this.LIZ(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    public abstract void LIZ(final Context p0, final TypedArray p1);
    
    public final void LIZ(final Context context, final AttributeSet set, final int n, final int n2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, this.LIZ(), n, n2);
        this.LIZ(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
    
    public abstract int[] LIZ();
}
