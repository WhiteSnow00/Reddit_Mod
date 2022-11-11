// 
// Decompiled by Procyon v0.6.0
// 

package i0;

import android.graphics.drawable.Drawable;

public final class c extends Drawable
{
    public static final double a;
    
    static {
        a = Math.cos(Math.toRadians(45.0));
    }
    
    public static float a(final float n, final float n2, final boolean b) {
        if (b) {
            return (float)((1.0 - c.a) * n2 + n * 1.5f);
        }
        return n * 1.5f;
    }
}
