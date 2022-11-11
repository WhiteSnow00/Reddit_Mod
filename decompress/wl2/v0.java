// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import android.support.v4.media.c;
import rm2.a;
import ej2.c0;
import android.support.v4.media.b;
import java.math.BigInteger;
import tl2.f;

public final class v0 extends a
{
    public long[] f;
    
    public v0() {
        this.f = new long[2];
    }
    
    public v0(final BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= 113) {
            this.f = b.O(113, bigInteger);
            return;
        }
        throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
    }
    
    public v0(final long[] f) {
        this.f = f;
    }
    
    public final f a(final f f) {
        final long[] f2 = this.f;
        final long[] f3 = ((v0)f).f;
        return new v0(new long[] { f2[0] ^ f3[0], f2[1] ^ f3[1] });
    }
    
    public final f b() {
        final long[] f = this.f;
        return new v0(new long[] { f[0] ^ 0x1L, f[1] });
    }
    
    public final f d(final f f) {
        return this.j(f.g());
    }
    
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof v0)) {
            return false;
        }
        final v0 v0 = (v0)o;
        final long[] f = this.f;
        final long[] f2 = v0.f;
        int n = 1;
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
        return 113;
    }
    
    public final f g() {
        final long[] array = new long[2];
        final long[] f = this.f;
        final int n = 0;
        int i = 0;
        while (true) {
            while (i < 2) {
                if (f[i] != 0L) {
                    final int n2 = n;
                    if (n2 == 0) {
                        final long[] array2 = new long[2];
                        final long[] array3 = new long[2];
                        final long[] array4 = new long[4];
                        c0.q3(f, array4);
                        c0.d4(array4, array2);
                        c0.I3(array2, f, array2);
                        final long[] array5 = new long[4];
                        c0.q3(array2, array5);
                        c0.d4(array5, array2);
                        c0.I3(array2, f, array2);
                        c0.f4(3, array2, array3);
                        c0.I3(array3, array2, array3);
                        final long[] array6 = new long[4];
                        c0.q3(array3, array6);
                        c0.d4(array6, array3);
                        c0.I3(array3, f, array3);
                        c0.f4(7, array3, array2);
                        c0.I3(array2, array3, array2);
                        c0.f4(14, array2, array3);
                        c0.I3(array3, array2, array3);
                        c0.f4(28, array3, array2);
                        c0.I3(array2, array3, array2);
                        c0.f4(56, array2, array3);
                        c0.I3(array3, array2, array3);
                        final long[] array7 = new long[4];
                        c0.q3(array3, array7);
                        c0.d4(array7, array);
                        return new v0(array);
                    }
                    throw new IllegalStateException();
                }
                else {
                    ++i;
                }
            }
            final int n2 = 1;
            continue;
        }
    }
    
    public final boolean h() {
        final long[] f = this.f;
        boolean b = false;
        if (f[0] == 1L) {
            for (int i = 1; i < 2; ++i) {
                if (f[i] != 0L) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    public final int hashCode() {
        return rm2.a.g(this.f, 2) ^ 0x1B971;
    }
    
    public final boolean i() {
        final long[] f = this.f;
        boolean b = false;
        for (int i = 0; i < 2; ++i) {
            if (f[i] != 0L) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public final f j(final f f) {
        final long[] array = new long[2];
        c0.I3(this.f, ((v0)f).f, array);
        return new v0(array);
    }
    
    public final f k(final f f, final f f2, final f f3) {
        return this.l(f, f2, f3);
    }
    
    public final f l(final f f, final f f2, final f f3) {
        final long[] f4 = this.f;
        final long[] f5 = ((v0)f).f;
        final long[] f6 = ((v0)f2).f;
        final long[] f7 = ((v0)f3).f;
        final long[] array = new long[4];
        final long[] array2 = new long[4];
        c0.o3(f4, f5, array2);
        c0.u2(array, array2, array);
        final long[] array3 = new long[4];
        c0.o3(f6, f7, array3);
        c0.u2(array, array3, array);
        final long[] array4 = new long[2];
        c0.d4(array, array4);
        return new v0(array4);
    }
    
    public final f m() {
        return this;
    }
    
    public final f n() {
        final long[] f = this.f;
        final long i0 = vl.a.I0(f[0]);
        final long i2 = vl.a.I0(f[1]);
        final long n = i0 >>> 32 | (i2 & 0xFFFFFFFF00000000L);
        return new v0(new long[] { n << 57 ^ ((0xFFFFFFFFL & i0) | i2 << 32) ^ n << 5, n >>> 7 ^ n >>> 59 });
    }
    
    public final f o() {
        final long[] array = new long[2];
        final long[] f = this.f;
        final long[] array2 = new long[4];
        c0.q3(f, array2);
        c0.d4(array2, array);
        return new v0(array);
    }
    
    public final f p(final f f, final f f2) {
        final long[] f3 = this.f;
        final long[] f4 = ((v0)f).f;
        final long[] f5 = ((v0)f2).f;
        final long[] array = new long[4];
        final long[] array2 = new long[4];
        c0.q3(f3, array2);
        c0.u2(array, array2, array);
        final long[] array3 = new long[4];
        c0.o3(f4, f5, array3);
        c0.u2(array, array3, array);
        final long[] array4 = new long[2];
        c0.d4(array, array4);
        return new v0(array4);
    }
    
    public final f q(final int n) {
        if (n < 1) {
            return this;
        }
        final long[] array = new long[2];
        c0.f4(n, this.f, array);
        return new v0(array);
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
        final byte[] array = new byte[16];
        for (int i = 0; i < 2; ++i) {
            final long n = f[i];
            if (n != 0L) {
                c.B0(n, array, 1 - i << 3);
            }
        }
        return new BigInteger(1, array);
    }
    
    @Override
    public final f u() {
        final long[] array = new long[2];
        final long[] f = this.f;
        final long[] array2 = new long[4];
        array[0] = f[0];
        array[1] = f[1];
        for (int i = 1; i < 113; i += 2) {
            c0.q3(array, array2);
            c0.d4(array2, array);
            c0.q3(array, array2);
            c0.d4(array2, array);
            array[0] ^= f[0];
            array[1] ^= f[1];
        }
        return new v0(array);
    }
    
    @Override
    public final int w() {
        return (int)this.f[0] & 0x1;
    }
}
