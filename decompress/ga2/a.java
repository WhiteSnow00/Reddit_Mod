// 
// Decompiled by Procyon v0.6.0
// 

package ga2;

import android.view.animation.Interpolator;

public final class a implements Interpolator
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public final float getInterpolation(float n) {
        n = 1 - Math.abs(n - 0.5f) * 2;
        return ((6 * n - 15) * n + 10) * (n * n * n);
    }
}
