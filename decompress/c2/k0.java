// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import vl.a;

public final class k0
{
    public static final long a;
    public static final int b = 0;
    
    static {
        a = vl.a.c0(Float.NaN, Float.NaN);
    }
    
    public static final float a(final long n) {
        if (n != k0.a) {
            return Float.intBitsToFloat((int)(n >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
    
    public static final float b(final long n) {
        if (n != k0.a) {
            return Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}
