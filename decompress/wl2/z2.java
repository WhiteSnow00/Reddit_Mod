// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import android.support.v4.media.c;
import nn0.a;
import android.support.v4.media.b;
import java.math.BigInteger;
import tl2.f;

public final class z2 extends a
{
    public long[] f;
    
    public z2() {
        this.f = new long[9];
    }
    
    public z2(final BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= 571) {
            this.f = b.O(571, bigInteger);
            return;
        }
        throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
    }
    
    public z2(final long[] f) {
        this.f = f;
    }
    
    public final f a(final f f) {
        final long[] array = new long[9];
        nn0.a.g(this.f, ((z2)f).f, array);
        return new z2(array);
    }
    
    public final f b() {
        final long[] array = new long[9];
        final long[] f = this.f;
        array[0] = (f[0] ^ 0x1L);
        for (int i = 1; i < 9; ++i) {
            array[i] = f[i];
        }
        return new z2(array);
    }
    
    public final f d(final f f) {
        return this.j(f.g());
    }
    
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof z2)) {
            return false;
        }
        final z2 z2 = (z2)o;
        final long[] f = this.f;
        final long[] f2 = z2.f;
        int n = 8;
        boolean b2;
        while (true) {
            b2 = b;
            if (n < 0) {
                break;
            }
            if (f[n] != f2[n]) {
                b2 = false;
                break;
            }
            --n;
        }
        return b2;
    }
    
    public final int f() {
        return 571;
    }
    
    public final f g() {
        final long[] array = new long[9];
        final long[] f = this.f;
        if (!c.u0(f)) {
            final long[] array2 = new long[9];
            final long[] array3 = new long[9];
            final long[] array4 = new long[9];
            nn0.a.R(f, array4);
            nn0.a.R(array4, array2);
            nn0.a.R(array2, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.U(2, array2, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.E(array2, array4, array2);
            nn0.a.U(5, array2, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.U(5, array3, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.U(15, array2, array3);
            nn0.a.E(array2, array3, array4);
            nn0.a.U(30, array4, array2);
            nn0.a.U(30, array2, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.U(60, array2, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.U(60, array3, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.U(180, array2, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.U(180, array3, array3);
            nn0.a.E(array2, array3, array2);
            nn0.a.E(array2, array4, array);
            return new z2(array);
        }
        throw new IllegalStateException();
    }
    
    public final boolean h() {
        final long[] f = this.f;
        boolean b = false;
        if (f[0] == 1L) {
            for (int i = 1; i < 9; ++i) {
                if (f[i] != 0L) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    public final int hashCode() {
        return rm2.a.g(this.f, 9) ^ 0x5724CC;
    }
    
    public final boolean i() {
        return c.u0(this.f);
    }
    
    public final f j(final f f) {
        final long[] array = new long[9];
        nn0.a.E(this.f, ((z2)f).f, array);
        return new z2(array);
    }
    
    public final f k(final f f, final f f2, final f f3) {
        return this.l(f, f2, f3);
    }
    
    public final f l(final f f, final f f2, final f f3) {
        final long[] f4 = this.f;
        final long[] f5 = ((z2)f).f;
        final long[] f6 = ((z2)f2).f;
        final long[] f7 = ((z2)f3).f;
        final long[] array = new long[18];
        nn0.a.G(f4, f5, array);
        nn0.a.G(f6, f7, array);
        final long[] array2 = new long[9];
        nn0.a.L(array, array2);
        return new z2(array2);
    }
    
    public final f m() {
        return this;
    }
    
    public final f n() {
        final long[] array = new long[9];
        final long[] f = this.f;
        final long[] array2 = new long[9];
        final long[] array3 = new long[9];
        int i = 0;
        int n = 0;
        while (i < 4) {
            final int n2 = n + 1;
            final long i2 = vl.a.I0(f[n]);
            n = n2 + 1;
            final long i3 = vl.a.I0(f[n2]);
            array2[i] = ((0xFFFFFFFFL & i2) | i3 << 32);
            array3[i] = (i2 >>> 32 | (0xFFFFFFFF00000000L & i3));
            ++i;
        }
        final long i4 = vl.a.I0(f[n]);
        array2[4] = (0xFFFFFFFFL & i4);
        array3[4] = i4 >>> 32;
        nn0.a.E(array3, nn0.a.A, array);
        nn0.a.g(array, array2, array);
        return new z2(array);
    }
    
    public final f o() {
        final long[] array = new long[9];
        nn0.a.R(this.f, array);
        return new z2(array);
    }
    
    public final f p(final f f, final f f2) {
        final long[] f3 = this.f;
        final long[] f4 = ((z2)f).f;
        final long[] f5 = ((z2)f2).f;
        final long[] array = new long[18];
        final long[] array2 = new long[18];
        nn0.a.C(f3, array2);
        for (int i = 0; i < 18; ++i) {
            array[i] ^= array2[i];
        }
        nn0.a.G(f4, f5, array);
        final long[] array3 = new long[9];
        nn0.a.L(array, array3);
        return new z2(array3);
    }
    
    public final f q(final int n) {
        if (n < 1) {
            return this;
        }
        final long[] array = new long[9];
        nn0.a.U(n, this.f, array);
        return new z2(array);
    }
    
    public final f r(final f f) {
        return this.a(f);
    }
    
    public final boolean s() {
        final long[] f = this.f;
        boolean b = false;
        if ((f[0] & 0x1L) != 0x0L) {
            b = true;
        }
        return b;
    }
    
    public final BigInteger t() {
        final long[] f = this.f;
        final byte[] array = new byte[72];
        for (int i = 0; i < 9; ++i) {
            final long n = f[i];
            if (n != 0L) {
                c.B0(n, array, 8 - i << 3);
            }
        }
        return new BigInteger(1, array);
    }
    
    @Override
    public final f u() {
        final long[] array = new long[9];
        final long[] f = this.f;
        final long[] array2 = new long[18];
        array[0] = f[0];
        int i = 1;
        array[1] = f[1];
        array[2] = f[2];
        array[3] = f[3];
        array[4] = f[4];
        array[5] = f[5];
        array[6] = f[6];
        array[7] = f[7];
        array[8] = f[8];
        while (i < 571) {
            nn0.a.C(array, array2);
            nn0.a.L(array2, array);
            nn0.a.C(array, array2);
            nn0.a.L(array2, array);
            for (int j = 0; j < 9; ++j) {
                array[j] ^= f[j];
            }
            i += 2;
        }
        return new z2(array);
    }
    
    @Override
    public final boolean v() {
        return true;
    }
    
    @Override
    public final int w() {
        final long[] f = this.f;
        final long n = f[0];
        final long n2 = f[8];
        return (int)(n ^ n2 >>> 49 ^ n2 >>> 57) & 0x1;
    }
}
