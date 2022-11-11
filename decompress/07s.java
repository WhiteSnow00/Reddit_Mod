// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.animation.PathInterpolator;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public final class 07s
{
    static {
        Covode.recordClassIndex(841);
    }
    
    public static Interpolator LIZ(final float n, final float n2, final float n3, final float n4) {
        return (Interpolator)new PathInterpolator(n, n2, n3, n4);
    }
}
