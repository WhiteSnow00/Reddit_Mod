// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import android.support.v4.media.c;
import cg.m0;
import android.support.v4.media.b;
import sm2.a;
import java.math.BigInteger;
import tl2.f;

public final class v extends b
{
    public static final BigInteger g;
    public int[] f;
    
    static {
        g = new BigInteger(1, a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    }
    
    public v() {
        this.f = new int[6];
    }
    
    public v(final BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(v.g) < 0) {
            final int[] m = android.support.v4.media.b.M(bigInteger);
            if (m[5] == -1) {
                final int[] e0 = m0.e0;
                if (android.support.v4.media.b.X(m, e0)) {
                    android.support.v4.media.b.T0(e0, m);
                }
            }
            this.f = m;
            return;
        }
        throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
    }
    
    public v(final int[] f) {
        this.f = f;
    }
    
    public final f a(final f f) {
        final int[] array = new int[6];
        if (android.support.v4.media.b.e(this.f, ((v)f).f, array) != 0 || (array[5] == -1 && android.support.v4.media.b.X(array, m0.e0))) {
            m0.p(array);
        }
        return new v(array);
    }
    
    public final f b() {
        final int[] array = new int[6];
        if (android.support.v4.media.b.Z(6, this.f, array) != 0 || (array[5] == -1 && android.support.v4.media.b.X(array, m0.e0))) {
            m0.p(array);
        }
        return new v(array);
    }
    
    public final f d(final f f) {
        final int[] array = new int[6];
        c.p0(m0.e0, ((v)f).f, array);
        m0.M(array, this.f, array);
        return new v(array);
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof v && android.support.v4.media.b.H(this.f, ((v)o).f));
    }
    
    public final int f() {
        return v.g.bitLength();
    }
    
    public final f g() {
        final int[] array = new int[6];
        c.p0(m0.e0, this.f, array);
        return new v(array);
    }
    
    public final boolean h() {
        return android.support.v4.media.b.f0(this.f);
    }
    
    public final int hashCode() {
        return v.g.hashCode() ^ rm2.a.d(6, this.f);
    }
    
    public final boolean i() {
        return android.support.v4.media.b.k0(this.f);
    }
    
    public final f j(final f f) {
        final int[] array = new int[6];
        m0.M(this.f, ((v)f).f, array);
        return new v(array);
    }
    
    public final f m() {
        final int[] array = new int[6];
        final int[] f = this.f;
        if (android.support.v4.media.b.k0(f)) {
            array[1] = (array[0] = 0);
            array[3] = (array[2] = 0);
            array[5] = (array[4] = 0);
        }
        else {
            android.support.v4.media.b.N0(m0.e0, f, array);
        }
        return new v(array);
    }
    
    public final f n() {
        final int[] f = this.f;
        if (!android.support.v4.media.b.k0(f) && !android.support.v4.media.b.f0(f)) {
            final int[] array = new int[6];
            final int[] array2 = new int[6];
            m0.Z(f, array);
            m0.M(array, f, array);
            m0.a0(2, array, array2);
            m0.M(array2, array, array2);
            m0.a0(4, array2, array);
            m0.M(array, array2, array);
            m0.a0(8, array, array2);
            m0.M(array2, array, array2);
            m0.a0(16, array2, array);
            m0.M(array, array2, array);
            m0.a0(32, array, array2);
            m0.M(array2, array, array2);
            m0.a0(64, array2, array);
            m0.M(array, array2, array);
            m0.a0(62, array, array);
            m0.Z(array, array2);
            v v;
            if (android.support.v4.media.b.H(f, array2)) {
                v = new v(array);
            }
            else {
                v = null;
            }
            return v;
        }
        return this;
    }
    
    public final f o() {
        final int[] array = new int[6];
        m0.Z(this.f, array);
        return new v(array);
    }
    
    public final f r(final f f) {
        final int[] array = new int[6];
        m0.d0(this.f, ((v)f).f, array);
        return new v(array);
    }
    
    public final boolean s() {
        final int[] f = this.f;
        boolean b = false;
        if ((f[0] & 0x1) == 0x1) {
            b = true;
        }
        return b;
    }
    
    public final BigInteger t() {
        return android.support.v4.media.b.W0(this.f);
    }
}
