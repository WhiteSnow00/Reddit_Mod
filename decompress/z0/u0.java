// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import cg.d;
import ng2.e;

public final class u0
{
    public final v0 a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    
    public u0(final v0 a) {
        ng2.e.f((Object)a, "table");
        this.a = a;
        this.b = a.f;
        final int g = a.g;
        this.c = g;
        this.d = a.h;
        this.e = a.i;
        this.h = g;
        this.i = -1;
    }
    
    public final b a(final int n) {
        final ArrayList m = this.a.m;
        final int l3 = cg.d.L3(m, n, this.c);
        b b;
        if (l3 < 0) {
            b = new b(n);
            m.add(-(l3 + 1), b);
        }
        else {
            final Object value = m.get(l3);
            ng2.e.e(value, "get(location)");
            b = (b)value;
        }
        return b;
    }
    
    public final Object b(int length, final int[] array) {
        Object a;
        if (cg.d.g0(length, array)) {
            final Object[] d = this.d;
            final int n = length * 5;
            if (n >= array.length) {
                length = array.length;
            }
            else {
                length = array[n + 4];
                length += cg.d.v1(array[n + 1] >> 29);
            }
            a = d[length];
        }
        else {
            a = d$a.a;
        }
        return a;
    }
    
    public final void c() {
        boolean b = true;
        this.f = true;
        final v0 a = this.a;
        a.getClass();
        if (this.a != a || a.j <= 0) {
            b = false;
        }
        if (b) {
            --a.j;
            return;
        }
        ComposerKt.c("Unexpected reader close()".toString());
        throw null;
    }
    
    public final void d() {
        if (this.j == 0) {
            if (this.g != this.h) {
                ComposerKt.c("endGroup() not called at the end of a group".toString());
                throw null;
            }
            final int[] b = this.b;
            final int i = b[this.i * 5 + 2];
            int c;
            if ((this.i = i) < 0) {
                c = this.c;
            }
            else {
                c = cg.d.d0(i, b) + i;
            }
            this.h = c;
        }
    }
    
    public final Object e() {
        final int g = this.g;
        Object o;
        if (g < this.h) {
            o = this.b(g, this.b);
        }
        else {
            o = 0;
        }
        return o;
    }
    
    public final int f() {
        final int g = this.g;
        int n;
        if (g < this.h) {
            n = this.b[g * 5];
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public final Object g(int e, int n) {
        final int r0 = cg.d.r0(e, this.b);
        if (++e < this.c) {
            e = this.b[e * 5 + 4];
        }
        else {
            e = this.e;
        }
        n += r0;
        Object a;
        if (n < e) {
            a = this.d[n];
        }
        else {
            a = d$a.a;
        }
        return a;
    }
    
    public final int h(final int n) {
        return cg.d.d0(n, this.b);
    }
    
    public final boolean i(final int n) {
        return cg.d.h0(n, this.b);
    }
    
    public final Object j(final int n) {
        Object a;
        if (cg.d.h0(n, this.b)) {
            final int[] b = this.b;
            if (cg.d.h0(n, b)) {
                a = this.d[b[n * 5 + 4]];
            }
            else {
                a = d$a.a;
            }
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final int k(final int n) {
        return cg.d.k0(n, this.b);
    }
    
    public final Object l(int n, final int[] array) {
        final int n2 = n * 5;
        n = 1;
        final int n3 = array[n2 + 1];
        if ((0x20000000 & n3) == 0x0) {
            n = 0;
        }
        Object o;
        if (n != 0) {
            final Object[] d = this.d;
            n = array[n2 + 4];
            o = d[cg.d.v1(n3 >> 30) + n];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final int m(final int n) {
        return this.b[n * 5 + 2];
    }
    
    public final void n(int n) {
        if (this.j == 0) {
            this.g = n;
            final int c = this.c;
            if (n < c) {
                n = this.b[n * 5 + 2];
            }
            else {
                n = -1;
            }
            this.i = n;
            if (n < 0) {
                this.h = c;
            }
            else {
                this.h = cg.d.d0(n, this.b) + n;
            }
            this.k = 0;
            this.l = 0;
            return;
        }
        ComposerKt.c("Cannot reposition while in an empty region".toString());
        throw null;
    }
    
    public final int o() {
        final int j = this.j;
        final int n = 1;
        if (j == 0) {
            int k0;
            if (cg.d.h0(this.g, this.b)) {
                k0 = n;
            }
            else {
                k0 = cg.d.k0(this.g, this.b);
            }
            final int g = this.g;
            this.g = cg.d.d0(g, this.b) + g;
            return k0;
        }
        ComposerKt.c("Cannot skip while in an empty region".toString());
        throw null;
    }
    
    public final void p() {
        if (this.j == 0) {
            this.g = this.h;
            return;
        }
        ComposerKt.c("Cannot skip the enclosing group while in an empty region".toString());
        throw null;
    }
    
    public final void q() {
        if (this.j <= 0) {
            final int[] b = this.b;
            final int g = this.g;
            if (b[g * 5 + 2] != this.i) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            this.i = g;
            this.h = cg.d.d0(g, b) + g;
            final int g2 = this.g;
            final int g3 = g2 + 1;
            this.g = g3;
            this.k = cg.d.r0(g2, this.b);
            int e;
            if (g2 >= this.c - 1) {
                e = this.e;
            }
            else {
                e = this.b[g3 * 5 + 4];
            }
            this.l = e;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SlotReader(current=");
        t.append(this.g);
        t.append(", key=");
        t.append(this.f());
        t.append(", parent=");
        t.append(this.i);
        t.append(", end=");
        return d.j(t, this.h, ')');
    }
}
