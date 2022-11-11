// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import yg.a;
import android.support.v4.media.b;
import java.math.BigInteger;
import tl2.f;

public final class t1 extends a
{
    public long[] f;
    
    public t1() {
        this.f = new long[4];
    }
    
    public t1(final BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= 193) {
            this.f = b.O(193, bigInteger);
            return;
        }
        throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
    }
    
    public t1(final long[] f) {
        this.f = f;
    }
    
    public final f a(final f f) {
        final long[] f2 = this.f;
        final long[] f3 = ((t1)f).f;
        return new t1(new long[] { f2[0] ^ f3[0], f2[1] ^ f3[1], f2[2] ^ f3[2], f2[3] ^ f3[3] });
    }
    
    public final f b() {
        final long[] f = this.f;
        return new t1(new long[] { f[0] ^ 0x1L, f[1], f[2], f[3] });
    }
    
    public final f d(final f f) {
        return this.j(f.g());
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof t1 && b.J(this.f, ((t1)o).f));
    }
    
    public final int f() {
        return 193;
    }
    
    public final f g() {
        final long[] array = new long[4];
        final long[] f = this.f;
        if (!b.n0(f)) {
            final long[] array2 = new long[4];
            final long[] array3 = new long[4];
            final long[] array4 = new long[8];
            yg.a.P0(f, array4);
            yg.a.w1(array4, array2);
            yg.a.K1(1, array2, array3);
            yg.a.Y0(array2, array3, array2);
            yg.a.K1(1, array3, array3);
            yg.a.Y0(array2, array3, array2);
            yg.a.K1(3, array2, array3);
            yg.a.Y0(array2, array3, array2);
            yg.a.K1(6, array2, array3);
            yg.a.Y0(array2, array3, array2);
            yg.a.K1(12, array2, array3);
            yg.a.Y0(array2, array3, array2);
            yg.a.K1(24, array2, array3);
            yg.a.Y0(array2, array3, array2);
            yg.a.K1(48, array2, array3);
            yg.a.Y0(array2, array3, array2);
            yg.a.K1(96, array2, array3);
            yg.a.Y0(array2, array3, array);
            return new t1(array);
        }
        throw new IllegalStateException();
    }
    
    public final boolean h() {
        return b.h0(this.f);
    }
    
    public final int hashCode() {
        return rm2.a.g(this.f, 4) ^ 0x1D731F;
    }
    
    public final boolean i() {
        return b.n0(this.f);
    }
    
    public final f j(final f f) {
        final long[] array = new long[4];
        yg.a.Y0(this.f, ((t1)f).f, array);
        return new t1(array);
    }
    
    public final f k(final f f, final f f2, final f f3) {
        return this.l(f, f2, f3);
    }
    
    public final f l(final f f, final f f2, final f f3) {
        final long[] f4 = this.f;
        final long[] f5 = ((t1)f).f;
        final long[] f6 = ((t1)f2).f;
        final long[] f7 = ((t1)f3).f;
        final long[] array = new long[8];
        final long[] array2 = new long[8];
        yg.a.N0(f4, f5, array2);
        yg.a.R(array, array2, array);
        final long[] array3 = new long[8];
        yg.a.N0(f6, f7, array3);
        yg.a.R(array, array3, array);
        final long[] array4 = new long[4];
        yg.a.w1(array, array4);
        return new t1(array4);
    }
    
    public final f m() {
        return this;
    }
    
    public final f n() {
        final long[] f = this.f;
        final long i0 = vl.a.I0(f[0]);
        final long i2 = vl.a.I0(f[1]);
        final long n = i0 >>> 32 | (i2 & 0xFFFFFFFF00000000L);
        final long i3 = vl.a.I0(f[2]);
        final long n2 = f[3];
        final long n3 = i3 >>> 32;
        return new t1(new long[] { ((i0 & 0xFFFFFFFFL) | i2 << 32) ^ n << 8, n3 << 8 ^ ((i3 & 0xFFFFFFFFL) ^ n2 << 32) ^ n >>> 56 ^ n << 33, n3 >>> 56 ^ n3 << 33 ^ n >>> 31, n3 >>> 31 });
    }
    
    public final f o() {
        final long[] array = new long[4];
        final long[] f = this.f;
        final long[] array2 = new long[8];
        yg.a.P0(f, array2);
        yg.a.w1(array2, array);
        return new t1(array);
    }
    
    public final f p(final f f, final f f2) {
        final long[] f3 = this.f;
        final long[] f4 = ((t1)f).f;
        final long[] f5 = ((t1)f2).f;
        final long[] array = new long[8];
        final long[] array2 = new long[8];
        yg.a.P0(f3, array2);
        yg.a.R(array, array2, array);
        final long[] array3 = new long[8];
        yg.a.N0(f4, f5, array3);
        yg.a.R(array, array3, array);
        final long[] array4 = new long[4];
        yg.a.w1(array, array4);
        return new t1(array4);
    }
    
    public final f q(final int n) {
        if (n < 1) {
            return this;
        }
        final long[] array = new long[4];
        yg.a.K1(n, this.f, array);
        return new t1(array);
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
        return b.Z0(this.f);
    }
    
    @Override
    public final f u() {
        final long[] array = new long[4];
        final long[] f = this.f;
        final long[] array2 = new long[8];
        b.B(f, array);
        for (int i = 1; i < 193; i += 2) {
            yg.a.P0(array, array2);
            yg.a.w1(array2, array);
            yg.a.P0(array, array2);
            yg.a.w1(array2, array);
            array[0] ^= f[0];
            array[1] ^= f[1];
            array[2] ^= f[2];
            array[3] ^= f[3];
        }
        return new t1(array);
    }
    
    @Override
    public final boolean v() {
        return true;
    }
    
    @Override
    public final int w() {
        return (int)this.f[0] & 0x1;
    }
}
