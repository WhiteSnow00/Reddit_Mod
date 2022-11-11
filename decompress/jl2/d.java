// 
// Decompiled by Procyon v0.6.0
// 

package jl2;

import java.math.BigInteger;

public final class d extends c
{
    public final BigInteger g;
    
    public d(final BigInteger g, final b b) {
        super(b);
        if (g == null) {
            throw new NullPointerException("Scalar cannot be null");
        }
        if (g.compareTo(tl2.b.b) >= 0 && g.compareTo(b.i) < 0) {
            this.g = g;
            return;
        }
        throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
    }
}
