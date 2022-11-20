// 
// Decompiled by Procyon v0.6.0
// 

package rl2;

import android.support.v4.media.b;
import oi2.d0;
import pl2.g;
import pl2.f;
import pl2.g$c;

public final class d extends g$c
{
    public d(final pl2.d d, final f f, final f f2) {
        super(d, f, f2);
    }
    
    public d(final pl2.d d, final f f, final f f2, final f[] array) {
        super(d, f, f2, array);
    }
    
    public final g a(final g g) {
        if (((g)this).j()) {
            return g;
        }
        if (g.j()) {
            return (g)this;
        }
        if (this == g) {
            return this.v();
        }
        final pl2.d a = ((g)this).a;
        final c c = (c)((g)this).b;
        final c c2 = (c)((g)this).c;
        final c c3 = (c)g.b;
        final c c4 = (c)g.g();
        final c c5 = (c)((g)this).d[0];
        final c c6 = (c)g.h();
        final int[] array = new int[16];
        final int[] array2 = new int[8];
        final int[] array3 = new int[8];
        final int[] array4 = new int[8];
        final boolean h = c5.h();
        int[] f;
        int[] f2;
        if (h) {
            f = c3.f;
            f2 = c4.f;
        }
        else {
            d0.B(c5.f, array3);
            d0.s(array3, c3.f, array2);
            d0.s(array3, c5.f, array3);
            d0.s(array3, c4.f, array3);
            f = array2;
            f2 = array3;
        }
        final boolean h2 = c6.h();
        int[] f3;
        int[] f4;
        if (h2) {
            f3 = c.f;
            f4 = c2.f;
        }
        else {
            d0.B(c6.f, array4);
            d0.s(array4, c.f, array);
            d0.s(array4, c6.f, array4);
            d0.s(array4, c2.f, array4);
            f3 = array;
            f4 = array4;
        }
        final int[] array5 = new int[8];
        d0.H(f3, f, array5);
        d0.H(f4, f2, array2);
        if (!b.Y1(array5)) {
            d0.B(array5, array3);
            final int[] array6 = new int[8];
            d0.s(array3, array5, array6);
            d0.s(array3, f3, array3);
            if (b.Y1(array6)) {
                b.R2(array6);
            }
            else {
                b.F2(d0.l, array6, array6);
            }
            b.g2(f4, array6, array);
            d0.y(b.J0(array3, array3, array6), array6);
            final c c7 = new c(array4);
            d0.B(array2, array4);
            final int[] f5 = c7.f;
            d0.H(f5, array6, f5);
            final c c8 = new c(array6);
            d0.H(array3, c7.f, array6);
            if (b.j2(c8.f, array2, array) != 0 || (array[15] >>> 1 >= Integer.MAX_VALUE && b.J1(16, array, d0.m))) {
                b.I2(16, d0.m, array);
            }
            d0.v(array, c8.f);
            final c c9 = new c(array5);
            if (!h) {
                d0.s(array5, c5.f, array5);
            }
            if (!h2) {
                final int[] f6 = c9.f;
                d0.s(f6, c6.f, f6);
            }
            return (g)new d(a, (f)c7, (f)c8, new f[] { (f)c9 });
        }
        if (b.Y1(array2)) {
            return this.v();
        }
        return a.l();
    }
    
    public final g l() {
        if (((g)this).j()) {
            return (g)this;
        }
        return (g)new d(((g)this).a, ((g)this).b, ((g)this).c.m(), ((g)this).d);
    }
    
    public final g t() {
        if (!((g)this).j() && !((g)this).c.i()) {
            return this.v().a((g)this);
        }
        return (g)this;
    }
    
    public final g v() {
        if (((g)this).j()) {
            return (g)this;
        }
        final pl2.d a = ((g)this).a;
        final c c = (c)((g)this).c;
        if (c.i()) {
            return a.l();
        }
        final c c2 = (c)((g)this).b;
        final c c3 = (c)((g)this).d[0];
        final int[] array = new int[8];
        final int[] array2 = new int[8];
        final int[] array3 = new int[8];
        d0.B(c.f, array3);
        final int[] array4 = new int[8];
        d0.B(array3, array4);
        final boolean h = c3.h();
        int[] f;
        final int[] array5 = f = c3.f;
        if (!h) {
            d0.B(array5, array2);
            f = array2;
        }
        d0.H(c2.f, f, array);
        if (b.t0(c2.f, f, array2) != 0 || (array2[7] >>> 1 >= Integer.MAX_VALUE && b.M1(array2, d0.l))) {
            d0.e(array2);
        }
        d0.s(array2, array, array2);
        d0.y(b.J0(array2, array2, array2), array2);
        d0.s(array3, c2.f, array3);
        d0.y(b.u2(8, array3), array3);
        d0.y(b.v2(8, array4, array), array);
        final c c4 = new c(array4);
        d0.B(array2, array4);
        final int[] f2 = c4.f;
        d0.H(f2, array3, f2);
        final int[] f3 = c4.f;
        d0.H(f3, array3, f3);
        final c c5 = new c(array3);
        d0.H(array3, c4.f, array3);
        final int[] f4 = c5.f;
        d0.s(f4, array2, f4);
        final int[] f5 = c5.f;
        d0.H(f5, array, f5);
        final c c6 = new c(array2);
        if (b.t2(8, 0, c.f, array2) != 0 || (array2[7] >>> 1 >= Integer.MAX_VALUE && b.M1(array2, d0.l))) {
            d0.e(array2);
        }
        if (!h) {
            final int[] f6 = c6.f;
            d0.s(f6, c3.f, f6);
        }
        return (g)new d(a, (f)c4, (f)c5, new f[] { (f)c6 });
    }
    
    public final g w(final g g) {
        if (this == g) {
            return this.t();
        }
        if (((g)this).j()) {
            return g;
        }
        if (g.j()) {
            return this.v();
        }
        if (((g)this).c.i()) {
            return g;
        }
        return this.v().a(g);
    }
}
