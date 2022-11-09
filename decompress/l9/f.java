// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import android.os.SystemClock;

public final class f
{
    public static final double a;
    
    static {
        a = 1.0 / Math.pow(10.0, 6.0);
    }
    
    public static double a(final long n) {
        return (SystemClock.elapsedRealtimeNanos() - n) * f.a;
    }
}
