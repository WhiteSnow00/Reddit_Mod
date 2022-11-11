// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import android.support.v4.media.c;
import android.support.v4.media.b;
import sm2.a;
import java.math.BigInteger;
import tl2.f;

public final class t0 extends b
{
    public static final BigInteger g;
    public int[] f;
    
    static {
        g = new BigInteger(1, a.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
    }
    
    public t0() {
        this.f = new int[17];
    }
    
    public t0(final BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(t0.g) < 0) {
            final int[] l = android.support.v4.media.b.L(521, bigInteger);
            if (android.support.v4.media.b.G(17, l, nn0.a.z)) {
                for (int i = 0; i < 17; ++i) {
                    l[i] = 0;
                }
            }
            this.f = l;
            return;
        }
        throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
    }
    
    public t0(final int[] f) {
        this.f = f;
    }
    
    public final f a(final f f) {
        final int[] array = new int[17];
        nn0.a.f(this.f, ((t0)f).f, array);
        return new t0(array);
    }
    
    public final f b() {
        final int[] array = new int[17];
        final int[] f = this.f;
        final int n = android.support.v4.media.b.Z(16, f, array) + f[16];
        int n2 = 0;
        Label_0067: {
            if (n <= 511) {
                if ((n2 = n) != 511) {
                    break Label_0067;
                }
                n2 = n;
                if (!android.support.v4.media.b.G(16, array, nn0.a.z)) {
                    break Label_0067;
                }
            }
            n2 = (android.support.v4.media.b.a0(array) + n & 0x1FF);
        }
        array[16] = n2;
        return new t0(array);
    }
    
    public final f d(final f f) {
        final int[] array = new int[17];
        c.p0(nn0.a.z, ((t0)f).f, array);
        nn0.a.F(array, this.f, array);
        return new t0(array);
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof t0 && android.support.v4.media.b.G(17, this.f, ((t0)o).f));
    }
    
    public final int f() {
        return t0.g.bitLength();
    }
    
    public final f g() {
        final int[] array = new int[17];
        c.p0(nn0.a.z, this.f, array);
        return new t0(array);
    }
    
    public final boolean h() {
        return android.support.v4.media.b.e0(17, this.f);
    }
    
    public final int hashCode() {
        return t0.g.hashCode() ^ rm2.a.d(17, this.f);
    }
    
    public final boolean i() {
        return android.support.v4.media.b.i0(17, this.f);
    }
    
    public final f j(final f f) {
        final int[] array = new int[17];
        nn0.a.F(this.f, ((t0)f).f, array);
        return new t0(array);
    }
    
    public final f m() {
        final int[] array = new int[17];
        final int[] f = this.f;
        if (android.support.v4.media.b.i0(17, f)) {
            for (int i = 0; i < 17; ++i) {
                array[i] = 0;
            }
        }
        else {
            android.support.v4.media.b.K0(17, nn0.a.z, f, array);
        }
        return new t0(array);
    }
    
    public final f n() {
        final int[] f = this.f;
        if (!android.support.v4.media.b.i0(17, f) && !android.support.v4.media.b.e0(17, f)) {
            final int[] array = new int[17];
            final int[] array2 = new int[17];
            int n = 519;
            final int[] array3 = new int[33];
            nn0.a.B(f, array3);
            while (true) {
                nn0.a.M(array3, array);
                if (--n <= 0) {
                    break;
                }
                nn0.a.B(array, array3);
            }
            nn0.a.S(array, array2);
            t0 t0;
            if (android.support.v4.media.b.G(17, f, array2)) {
                t0 = new t0(array);
            }
            else {
                t0 = null;
            }
            return t0;
        }
        return this;
    }
    
    public final f o() {
        final int[] array = new int[17];
        nn0.a.S(this.f, array);
        return new t0(array);
    }
    
    public final f r(final f f) {
        final int[] array = new int[17];
        nn0.a.Y(this.f, ((t0)f).f, array);
        return new t0(array);
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
        return android.support.v4.media.b.V0(17, this.f);
    }
}
