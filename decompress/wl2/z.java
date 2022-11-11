// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import android.support.v4.media.b;
import android.support.v4.media.c;
import sm2.a;
import java.math.BigInteger;
import tl2.f;

public final class z extends b
{
    public static final BigInteger g;
    public static final int[] h;
    public int[] f;
    
    static {
        g = new BigInteger(1, a.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
        h = new int[] { 868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644 };
    }
    
    public z() {
        this.f = new int[7];
    }
    
    public z(final BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(z.g) < 0) {
            final int[] h0 = c.h0(bigInteger);
            if (h0[6] == -1 && c.l0(h0, nn0.a.w)) {
                android.support.v4.media.b.h(7, 6803, h0);
            }
            this.f = h0;
            return;
        }
        throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
    }
    
    public z(final int[] f) {
        this.f = f;
    }
    
    public final f a(final f f) {
        final int[] array = new int[7];
        if (c.P(this.f, ((z)f).f, array) != 0 || (array[6] == -1 && c.l0(array, nn0.a.w))) {
            android.support.v4.media.b.h(7, 6803, array);
        }
        return new z(array);
    }
    
    public final f b() {
        final int[] array = new int[7];
        if (android.support.v4.media.b.Z(7, this.f, array) != 0 || (array[6] == -1 && c.l0(array, nn0.a.w))) {
            android.support.v4.media.b.h(7, 6803, array);
        }
        return new z(array);
    }
    
    public final f d(final f f) {
        final int[] array = new int[7];
        c.p0(nn0.a.w, ((z)f).f, array);
        nn0.a.D(array, this.f, array);
        return new z(array);
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof z && c.f0(this.f, ((z)o).f));
    }
    
    public final int f() {
        return z.g.bitLength();
    }
    
    public final f g() {
        final int[] array = new int[7];
        c.p0(nn0.a.w, this.f, array);
        return new z(array);
    }
    
    public final boolean h() {
        return c.r0(this.f);
    }
    
    public final int hashCode() {
        return z.g.hashCode() ^ rm2.a.d(7, this.f);
    }
    
    public final boolean i() {
        return c.t0(this.f);
    }
    
    public final f j(final f f) {
        final int[] array = new int[7];
        nn0.a.D(this.f, ((z)f).f, array);
        return new z(array);
    }
    
    public final f m() {
        final int[] array = new int[7];
        final int[] f = this.f;
        if (c.t0(f)) {
            array[0] = 0;
            array[2] = (array[1] = 0);
            array[4] = (array[3] = 0);
            array[6] = (array[5] = 0);
        }
        else {
            c.N0(nn0.a.w, f, array);
        }
        return new z(array);
    }
    
    public final f n() {
        final int[] f = this.f;
        if (c.t0(f) || c.r0(f)) {
            return this;
        }
        final int[] array = new int[7];
        nn0.a.Q(f, array);
        nn0.a.D(array, f, array);
        nn0.a.Q(array, array);
        nn0.a.D(array, f, array);
        final int[] array2 = new int[7];
        nn0.a.Q(array, array2);
        nn0.a.D(array2, f, array2);
        final int[] array3 = new int[7];
        nn0.a.T(4, array2, array3);
        nn0.a.D(array3, array2, array3);
        final int[] array4 = new int[7];
        nn0.a.T(3, array3, array4);
        nn0.a.D(array4, array, array4);
        nn0.a.T(8, array4, array4);
        nn0.a.D(array4, array3, array4);
        nn0.a.T(4, array4, array3);
        nn0.a.D(array3, array2, array3);
        nn0.a.T(19, array3, array2);
        nn0.a.D(array2, array4, array2);
        final int[] array5 = new int[7];
        nn0.a.T(42, array2, array5);
        nn0.a.D(array5, array2, array5);
        nn0.a.T(23, array5, array2);
        nn0.a.D(array2, array3, array2);
        nn0.a.T(84, array2, array3);
        nn0.a.D(array3, array5, array3);
        nn0.a.T(20, array3, array3);
        nn0.a.D(array3, array4, array3);
        nn0.a.T(3, array3, array3);
        nn0.a.D(array3, f, array3);
        nn0.a.T(2, array3, array3);
        nn0.a.D(array3, f, array3);
        nn0.a.T(4, array3, array3);
        nn0.a.D(array3, array, array3);
        nn0.a.Q(array3, array3);
        nn0.a.Q(array3, array5);
        if (c.f0(f, array5)) {
            return new z(array3);
        }
        nn0.a.D(array3, z.h, array3);
        nn0.a.Q(array3, array5);
        if (c.f0(f, array5)) {
            return new z(array3);
        }
        return null;
    }
    
    public final f o() {
        final int[] array = new int[7];
        nn0.a.Q(this.f, array);
        return new z(array);
    }
    
    public final f r(final f f) {
        final int[] array = new int[7];
        nn0.a.X(this.f, ((z)f).f, array);
        return new z(array);
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
        return c.Q0(this.f);
    }
}
