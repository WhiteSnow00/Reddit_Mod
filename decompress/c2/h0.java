// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import mj2.c0;

public final class h0
{
    public static final long a;
    
    static {
        a = c0.g(Float.NaN, Float.NaN);
    }
    
    public static final float a(final long n) {
        if (n != h0.a) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
    
    public static final float b(final long n) {
        if (n != h0.a) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}
