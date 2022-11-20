// 
// Decompiled by Procyon v0.6.0
// 

package tl2;

import java.math.BigInteger;

public final class e
{
    public final BigInteger a;
    public final BigInteger b;
    public final BigInteger c;
    public final BigInteger d;
    public final BigInteger e;
    public final BigInteger f;
    public final int g;
    
    public e(final BigInteger[] array, final BigInteger[] array2, final BigInteger e, final BigInteger f, final int g) {
        a(array, "v1");
        a(array2, "v2");
        this.a = array[0];
        this.b = array[1];
        this.c = array2[0];
        this.d = array2[1];
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static void a(final BigInteger[] array, final String s) {
        if (array.length == 2 && array[0] != null && array[1] != null) {
            return;
        }
        throw new IllegalArgumentException(a.n("'", s, "' must consist of exactly 2 (non-null) values"));
    }
}
