// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import ui.b;
import tl2.g;
import tl2.f;
import tl2.g$c;

public final class d extends g$c
{
    public d(final tl2.d d, final f f, final f f2) {
        super(d, f, f2);
    }
    
    public d(final tl2.d d, final f f, final f f2, final f[] array) {
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
        final tl2.d a = ((g)this).a;
        final c c = (c)((g)this).b;
        final c c2 = (c)((g)this).c;
        final c c3 = (c)g.b;
        final c c4 = (c)g.g();
        final c c5 = (c)((g)this).d[0];
        final c c6 = (c)g.h();
        final int[] array = new int[8];
        final int[] array2 = new int[4];
        final int[] array3 = new int[4];
        final int[] array4 = new int[4];
        final boolean h = c5.h();
        int[] f;
        int[] f2;
        if (h) {
            f = c3.f;
            f2 = c4.f;
        }
        else {
            b.U(c5.f, array3);
            b.L(array3, c3.f, array2);
            b.L(array3, c5.f, array3);
            b.L(array3, c4.f, array3);
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
            b.U(c6.f, array4);
            b.L(array4, c.f, array);
            b.L(array4, c6.f, array4);
            b.L(array4, c2.f, array4);
            f3 = array;
            f4 = array4;
        }
        final int[] array5 = new int[4];
        b.a0(f3, f, array5);
        b.a0(f4, f2, array2);
        if (!android.support.v4.media.b.j0(array5)) {
            b.U(array5, array3);
            final int[] array6 = new int[4];
            b.L(array3, array5, array6);
            b.L(array3, f3, array3);
            if (android.support.v4.media.b.j0(array6)) {
                array6[1] = (array6[0] = 0);
                array6[3] = (array6[2] = 0);
            }
            else {
                android.support.v4.media.b.L0(b.A, array6, array6);
            }
            android.support.v4.media.b.o0(f4, array6, array);
            b.N(android.support.v4.media.b.j(array3, array3, array6), array6);
            final c c7 = new c(array4);
            b.U(array2, array4);
            final int[] f5 = c7.f;
            b.a0(f5, array6, f5);
            final c c8 = new c(array6);
            b.a0(array3, c7.f, array6);
            final int[] f6 = c8.f;
            final long n = (long)array2[0] & 0xFFFFFFFFL;
            final long n2 = (long)array2[1] & 0xFFFFFFFFL;
            final long n3 = (long)array2[2] & 0xFFFFFFFFL;
            final long n4 = array2[3];
            long n5 = 0L;
            int n9;
            long n14;
            long n15;
            for (int i = 0; i < 4; i += 4, n15 = (n14 >>> 32) + ((long)array[i] & 0xFFFFFFFFL) + n5, array[i] = (int)n15, n5 = n15 >>> 32, i = n9) {
                final long n6 = (long)f6[i] & 0xFFFFFFFFL;
                final int n7 = i + 0;
                final long n8 = n6 * n + ((long)array[n7] & 0xFFFFFFFFL) + 0L;
                array[n7] = (int)n8;
                n9 = i + 1;
                final long n10 = n6 * n2 + ((long)array[n9] & 0xFFFFFFFFL) + (n8 >>> 32);
                array[n9] = (int)n10;
                final int n11 = i + 2;
                final long n12 = n6 * n3 + ((long)array[n11] & 0xFFFFFFFFL) + (n10 >>> 32);
                array[n11] = (int)n12;
                final int n13 = i + 3;
                n14 = n6 * (n4 & 0xFFFFFFFFL) + ((long)array[n13] & 0xFFFFFFFFL) + (n12 >>> 32);
                array[n13] = (int)n14;
            }
            if ((int)n5 != 0 || (array[7] >>> 1 >= 2147483646 && android.support.v4.media.b.Y(array, b.B))) {
                android.support.v4.media.b.n(8, b.C, array);
            }
            b.M(array, c8.f);
            final c c9 = new c(array5);
            if (!h) {
                b.L(array5, c5.f, array5);
            }
            if (!h2) {
                final int[] f7 = c9.f;
                b.L(f7, c6.f, f7);
            }
            return (g)new d(a, (f)c7, (f)c8, new f[] { (f)c9 });
        }
        if (android.support.v4.media.b.j0(array2)) {
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
        final tl2.d a = ((g)this).a;
        final c c = (c)((g)this).c;
        if (c.i()) {
            return a.l();
        }
        final c c2 = (c)((g)this).b;
        final c c3 = (c)((g)this).d[0];
        final int[] array = new int[4];
        final int[] array2 = new int[4];
        final int[] array3 = new int[4];
        b.U(c.f, array3);
        final int[] array4 = new int[4];
        b.U(array3, array4);
        final boolean h = c3.h();
        int[] f;
        final int[] array5 = f = c3.f;
        if (!h) {
            b.U(array5, array2);
            f = array2;
        }
        b.a0(c2.f, f, array);
        b.f(c2.f, f, array2);
        b.L(array2, array, array2);
        b.N(android.support.v4.media.b.j(array2, array2, array2), array2);
        b.L(array3, c2.f, array3);
        b.N(android.support.v4.media.b.E0(4, array3), array3);
        b.N(android.support.v4.media.b.F0(4, array4, array), array);
        final c c4 = new c(array4);
        b.U(array2, array4);
        final int[] f2 = c4.f;
        b.a0(f2, array3, f2);
        final int[] f3 = c4.f;
        b.a0(f3, array3, f3);
        final c c5 = new c(array3);
        b.a0(array3, c4.f, array3);
        final int[] f4 = c5.f;
        b.L(f4, array2, f4);
        final int[] f5 = c5.f;
        b.a0(f5, array, f5);
        final c c6 = new c(array2);
        if (android.support.v4.media.b.D0(4, 0, c.f, array2) != 0 || (array2[3] >>> 1 >= 2147483646 && android.support.v4.media.b.W(array2, b.A))) {
            b.g(array2);
        }
        if (!h) {
            final int[] f6 = c6.f;
            b.L(f6, c3.f, f6);
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
