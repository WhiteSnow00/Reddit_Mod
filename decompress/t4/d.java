// 
// Decompiled by Procyon v0.6.0
// 

package t4;

import android.view.animation.Interpolator;

public abstract class d implements Interpolator
{
    public final float[] a;
    public final float b;
    
    public d(final float[] a) {
        this.a = a;
        this.b = 1.0f / (a.length - 1);
    }
    
    public final float getInterpolation(float n) {
        if (n >= 1.0f) {
            return 1.0f;
        }
        if (n <= 0.0f) {
            return 0.0f;
        }
        final float[] a = this.a;
        final int min = Math.min((int)((a.length - 1) * n), a.length - 2);
        final float n2 = (float)min;
        final float b = this.b;
        final float n3 = (n - n2 * b) / b;
        final float[] a2 = this.a;
        n = a2[min];
        return a.b(a2[min + 1], n, n3, n);
    }
}
