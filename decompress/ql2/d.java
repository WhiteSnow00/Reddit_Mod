// 
// Decompiled by Procyon v0.6.0
// 

package ql2;

import android.support.v4.media.b;
import o90.t7;
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
        final c c3 = (c)((g)this).d[0];
        final c c4 = (c)g.b;
        final c c5 = (c)g.g();
        final c c6 = (c)g.h();
        final int[] array = new int[16];
        final int[] array2 = new int[8];
        final int[] array3 = new int[8];
        final int[] array4 = new int[8];
        final boolean h = c3.h();
        int[] f;
        int[] f2;
        if (h) {
            f = c4.f;
            f2 = c5.f;
        }
        else {
            t7.z(c3.f, array3);
            t7.o(array3, c4.f, array2);
            t7.o(array3, c3.f, array3);
            t7.o(array3, c5.f, array3);
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
            t7.z(c6.f, array4);
            t7.o(array4, c.f, array);
            t7.o(array4, c6.f, array4);
            t7.o(array4, c2.f, array4);
            f3 = array;
            f4 = array4;
        }
        final int[] array5 = new int[8];
        t7.I(f3, f, array5);
        t7.I(f4, f2, array2);
        if (!b.Y1(array5)) {
            int[] array6 = new int[8];
            t7.z(array5, array6);
            final int[] array7 = new int[8];
            t7.o(array6, array5, array7);
            t7.o(array6, f3, array3);
            if (b.Y1(array7)) {
                b.R2(array7);
            }
            else {
                b.F2(t7.g, array7, array7);
            }
            b.g2(f4, array7, array);
            t7.u(b.J0(array3, array3, array7), array7);
            final c c7 = new c(array4);
            t7.z(array2, array4);
            final int[] f5 = c7.f;
            t7.I(f5, array7, f5);
            final c c8 = new c(array7);
            t7.I(array3, c7.f, array7);
            b.j2(c8.f, array2, array);
            final int[] h3 = t7.h;
            if (b.J1(16, array, h3)) {
                final long n = ((long)array[0] & 0xFFFFFFFFL) - ((long)h3[0] & 0xFFFFFFFFL);
                array[0] = (int)n;
                long n2 = n >> 32;
                if (n2 != 0L) {
                    n2 = b.p1(8, 1, array);
                }
                final long n3 = ((long)array[8] & 0xFFFFFFFFL) + 19L + n2;
                array[8] = (int)n3;
                long n4;
                if ((n4 = n3 >> 32) != 0L) {
                    n4 = b.P1(15, 9, array);
                }
                array[15] = (int)(((long)array[15] & 0xFFFFFFFFL) - ((long)(h3[15] + 1) & 0xFFFFFFFFL) + n4);
            }
            t7.r(array, c8.f);
            final c c9 = new c(array5);
            if (!h) {
                t7.o(array5, c3.f, array5);
            }
            if (!h2) {
                final int[] f6 = c9.f;
                t7.o(f6, c6.f, f6);
            }
            if (!h || !h2) {
                array6 = null;
            }
            return (g)new d(a, (f)c7, (f)c8, new f[] { (f)c9, (f)this.x(c9, array6) });
        }
        if (b.Y1(array2)) {
            return this.v();
        }
        return a.l();
    }
    
    public final f h() {
        return super.h();
    }
    
    public final g l() {
        if (((g)this).j()) {
            return (g)this;
        }
        return (g)new d(((g)this).a, ((g)this).b, ((g)this).c.m(), ((g)this).d);
    }
    
    public final g t() {
        if (((g)this).j()) {
            return (g)this;
        }
        if (((g)this).c.i()) {
            return (g)this;
        }
        return this.y(false).a((g)this);
    }
    
    public final g v() {
        if (((g)this).j()) {
            return (g)this;
        }
        final pl2.d a = ((g)this).a;
        if (((g)this).c.i()) {
            return a.l();
        }
        return (g)this.y(true);
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
        return this.y(false).a(g);
    }
    
    public final c x(final c c, final int[] array) {
        final c c2 = (c)((g)this).a.b;
        if (c.h()) {
            return c2;
        }
        final c c3 = new c();
        int[] f;
        if ((f = array) == null) {
            f = c3.f;
            t7.z(c.f, f);
        }
        t7.z(f, c3.f);
        final int[] f2 = c3.f;
        t7.o(f2, c2.f, f2);
        return c3;
    }
    
    public final d y(final boolean b) {
        final c c = (c)((g)this).b;
        final c c2 = (c)((g)this).c;
        final f[] d = ((g)this).d;
        final f f = d[0];
        final c c3 = (c)f;
        c x;
        if ((x = (c)d[1]) == null) {
            x = this.x((c)f, null);
            d[1] = (f)x;
        }
        final int[] array = new int[8];
        t7.z(c.f, array);
        final int j0 = b.J0(array, array, array);
        final int[] f2 = x.f;
        final long n = ((long)f2[0] & 0xFFFFFFFFL) + ((long)array[0] & 0xFFFFFFFFL) + 0L;
        array[0] = (int)n;
        final long n2 = ((long)f2[1] & 0xFFFFFFFFL) + ((long)array[1] & 0xFFFFFFFFL) + (n >>> 32);
        array[1] = (int)n2;
        final long n3 = ((long)f2[2] & 0xFFFFFFFFL) + ((long)array[2] & 0xFFFFFFFFL) + (n2 >>> 32);
        array[2] = (int)n3;
        final long n4 = ((long)f2[3] & 0xFFFFFFFFL) + ((long)array[3] & 0xFFFFFFFFL) + (n3 >>> 32);
        array[3] = (int)n4;
        final long n5 = ((long)f2[4] & 0xFFFFFFFFL) + ((long)array[4] & 0xFFFFFFFFL) + (n4 >>> 32);
        array[4] = (int)n5;
        final long n6 = ((long)f2[5] & 0xFFFFFFFFL) + ((long)array[5] & 0xFFFFFFFFL) + (n5 >>> 32);
        array[5] = (int)n6;
        final long n7 = ((long)f2[6] & 0xFFFFFFFFL) + ((long)array[6] & 0xFFFFFFFFL) + (n6 >>> 32);
        array[6] = (int)n7;
        final long n8 = ((long)f2[7] & 0xFFFFFFFFL) + ((long)array[7] & 0xFFFFFFFFL) + (n7 >>> 32);
        array[7] = (int)n8;
        t7.u(j0 + (int)(n8 >>> 32), array);
        final int[] array2 = new int[8];
        t7.N(c2.f, array2);
        final int[] array3 = new int[8];
        t7.o(array2, c2.f, array3);
        final int[] array4 = new int[8];
        t7.o(array3, c.f, array4);
        t7.N(array4, array4);
        final int[] array5 = new int[8];
        t7.z(array3, array5);
        t7.N(array5, array5);
        final c c4 = new c(array3);
        t7.z(array, array3);
        final int[] f3 = c4.f;
        t7.I(f3, array4, f3);
        final int[] f4 = c4.f;
        t7.I(f4, array4, f4);
        final c c5 = new c(array4);
        t7.I(array4, c4.f, array4);
        final int[] f5 = c5.f;
        t7.o(f5, array, f5);
        final int[] f6 = c5.f;
        t7.I(f6, array5, f6);
        final c c6 = new c(array2);
        if (!b.T1(c3.f)) {
            final int[] f7 = c6.f;
            t7.o(f7, c3.f, f7);
        }
        Object o;
        if (b) {
            final c c7 = new c(array5);
            t7.o(array5, x.f, array5);
            final int[] f8 = c7.f;
            t7.N(f8, f8);
            o = c7;
        }
        else {
            o = null;
        }
        return new d(((g)this).a, (f)c4, (f)c5, new f[] { (f)c6, (f)o });
    }
}
