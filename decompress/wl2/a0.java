// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import android.support.v4.media.b;
import android.support.v4.media.c;
import nn0.a;
import tl2.g;
import tl2.f;
import tl2.d;
import tl2.g$c;

public final class a0 extends g$c
{
    public a0(final d d, final f f, final f f2) {
        super(d, f, f2);
    }
    
    public a0(final d d, final f f, final f f2, final f[] array) {
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
        final d a = ((g)this).a;
        final z z = (z)((g)this).b;
        final z z2 = (z)((g)this).c;
        final z z3 = (z)g.b;
        final z z4 = (z)g.g();
        final z z5 = (z)((g)this).d[0];
        final z z6 = (z)g.h();
        final int[] array = new int[14];
        final int[] array2 = new int[7];
        final int[] array3 = new int[7];
        final int[] array4 = new int[7];
        final boolean h = z5.h();
        int[] f;
        int[] f2;
        if (h) {
            f = z3.f;
            f2 = z4.f;
        }
        else {
            nn0.a.Q(z5.f, array3);
            nn0.a.D(array3, z3.f, array2);
            nn0.a.D(array3, z5.f, array3);
            nn0.a.D(array3, z4.f, array3);
            f = array2;
            f2 = array3;
        }
        final boolean h2 = z6.h();
        int[] f3;
        int[] f4;
        if (h2) {
            f3 = z.f;
            f4 = z2.f;
        }
        else {
            nn0.a.Q(z6.f, array4);
            nn0.a.D(array4, z.f, array);
            nn0.a.D(array4, z6.f, array4);
            nn0.a.D(array4, z2.f, array4);
            f3 = array;
            f4 = array4;
        }
        final int[] array5 = new int[7];
        nn0.a.X(f3, f, array5);
        nn0.a.X(f4, f2, array2);
        if (!c.t0(array5)) {
            nn0.a.Q(array5, array3);
            final int[] array6 = new int[7];
            nn0.a.D(array3, array5, array6);
            nn0.a.D(array3, f3, array3);
            if (c.t0(array6)) {
                array6[0] = 0;
                array6[2] = (array6[1] = 0);
                array6[4] = (array6[3] = 0);
                array6[6] = (array6[5] = 0);
            }
            else {
                c.N0(nn0.a.w, array6, array6);
            }
            c.E0(f4, array6, array);
            nn0.a.O(c.R(array3, array3, array6), array6);
            final z z7 = new z(array4);
            nn0.a.Q(array2, array4);
            final int[] f5 = z7.f;
            nn0.a.X(f5, array6, f5);
            final z z8 = new z(array6);
            nn0.a.X(array3, z7.f, array6);
            if ((c.G0(z8.f, array2, array) != 0 || (array[13] == -1 && b.V(14, array, nn0.a.x))) && b.n(9, nn0.a.y, array) != 0) {
                b.b0(14, 9, array);
            }
            nn0.a.K(array, z8.f);
            final z z9 = new z(array5);
            if (!h) {
                nn0.a.D(array5, z5.f, array5);
            }
            if (!h2) {
                final int[] f6 = z9.f;
                nn0.a.D(f6, z6.f, f6);
            }
            return (g)new a0(a, z7, z8, new f[] { z9 });
        }
        if (c.t0(array2)) {
            return this.v();
        }
        return a.l();
    }
    
    public final g l() {
        if (((g)this).j()) {
            return (g)this;
        }
        return (g)new a0(((g)this).a, ((g)this).b, ((g)this).c.m(), ((g)this).d);
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
        final d a = ((g)this).a;
        final z z = (z)((g)this).c;
        if (z.i()) {
            return a.l();
        }
        final z z2 = (z)((g)this).b;
        final z z3 = (z)((g)this).d[0];
        final int[] array = new int[7];
        nn0.a.Q(z.f, array);
        final int[] array2 = new int[7];
        nn0.a.Q(array, array2);
        final int[] array3 = new int[7];
        nn0.a.Q(z2.f, array3);
        nn0.a.O(c.R(array3, array3, array3), array3);
        nn0.a.D(array, z2.f, array);
        nn0.a.O(b.E0(7, array), array);
        final int[] array4 = new int[7];
        nn0.a.O(b.F0(7, array2, array4), array4);
        final z z4 = new z(array2);
        nn0.a.Q(array3, array2);
        final int[] f = z4.f;
        nn0.a.X(f, array, f);
        final int[] f2 = z4.f;
        nn0.a.X(f2, array, f2);
        final z z5 = new z(array);
        nn0.a.X(array, z4.f, array);
        final int[] f3 = z5.f;
        nn0.a.D(f3, array3, f3);
        final int[] f4 = z5.f;
        nn0.a.X(f4, array4, f4);
        final z z6 = new z(array3);
        if (b.D0(7, 0, z.f, array3) != 0 || (array3[6] == -1 && c.l0(array3, nn0.a.w))) {
            b.h(7, 6803, array3);
        }
        if (!z3.h()) {
            final int[] f5 = z6.f;
            nn0.a.D(f5, z3.f, f5);
        }
        return (g)new a0(a, z4, z5, new f[] { z6 });
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
