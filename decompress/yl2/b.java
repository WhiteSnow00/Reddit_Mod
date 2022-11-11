// 
// Decompiled by Procyon v0.6.0
// 

package yl2;

import java.math.BigInteger;

public abstract class b
{
    public static final f a;
    public static final f b;
    
    static {
        a = new f(BigInteger.valueOf(2L));
        b = new f(BigInteger.valueOf(3L));
    }
    
    public static d a(final int[] array) {
        if (array[0] == 0) {
            for (int i = 1; i < array.length; ++i) {
                if (array[i] <= array[i - 1]) {
                    throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
                }
            }
            return new d(yl2.b.a, new c(array));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }
}
