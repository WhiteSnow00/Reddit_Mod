// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import java.util.ArrayList;
import at1.a;
import ah2.f;

public final class w0
{
    public final x0 a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    
    public w0(final x0 a) {
        ah2.f.f((Object)a, "table");
        this.a = a;
        this.b = a.f;
        final int g = a.g;
        this.c = g;
        this.d = a.h;
        this.e = a.i;
        this.g = g;
        this.h = -1;
    }
    
    public final b a(final int n) {
        final ArrayList<b> m = this.a.m;
        final int f1 = at1.a.F1((ArrayList)m, n, this.c);
        b b;
        if (f1 < 0) {
            b = new b(n);
            m.add(-(f1 + 1), b);
        }
        else {
            final b value = m.get(f1);
            ah2.f.e((Object)value, "get(location)");
            b = value;
        }
        return b;
    }
    
    public final Object b(int length, final int[] array) {
        Object a;
        if (at1.a.r(length, array)) {
            final Object[] d = this.d;
            length *= 5;
            if (length >= array.length) {
                length = array.length;
            }
            else {
                length = at1.a.g0(array[length + 1] >> 29) + array[length + 4];
            }
            a = d[length];
        }
        else {
            a = d$a.a;
        }
        return a;
    }
    
    public final void c() {
        final x0 a = this.a;
        a.getClass();
        if (this.a == a && a.j > 0) {
            --a.j;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }
    
    public final void d() {
        if (this.i == 0) {
            if (this.f != this.g) {
                throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
            }
            final int[] b = this.b;
            final int h = b[this.h * 5 + 2];
            int c;
            if ((this.h = h) < 0) {
                c = this.c;
            }
            else {
                c = at1.a.q(h, b) + h;
            }
            this.g = c;
        }
    }
    
    public final Object e() {
        final int f = this.f;
        Object o;
        if (f < this.g) {
            o = this.b(f, this.b);
        }
        else {
            o = 0;
        }
        return o;
    }
    
    public final int f() {
        final int f = this.f;
        int n;
        if (f < this.g) {
            n = this.b[f * 5];
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public final Object g(int e, int n) {
        final int y = at1.a.y(e, this.b);
        if (++e < this.c) {
            e = this.b[e * 5 + 4];
        }
        else {
            e = this.e;
        }
        n += y;
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
        return at1.a.q(n, this.b);
    }
    
    public final boolean i(final int n) {
        return at1.a.t(n, this.b);
    }
    
    public final Object j(final int n) {
        Object a;
        if (at1.a.t(n, this.b)) {
            final int[] b = this.b;
            if (at1.a.t(n, b)) {
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
    
    public final Object k(int n, final int[] array) {
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
            o = d[at1.a.g0(n3 >> 30) + n];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final int l(final int n) {
        return this.b[n * 5 + 2];
    }
    
    public final void m(int n) {
        if (this.i == 0) {
            this.f = n;
            final int c = this.c;
            if (n < c) {
                n = this.b[n * 5 + 2];
            }
            else {
                n = -1;
            }
            this.h = n;
            if (n < 0) {
                this.g = c;
            }
            else {
                this.g = at1.a.q(n, this.b) + n;
            }
            this.j = 0;
            this.k = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }
    
    public final int n() {
        final int i = this.i;
        final int n = 1;
        if (i == 0) {
            int v;
            if (at1.a.t(this.f, this.b)) {
                v = n;
            }
            else {
                v = at1.a.v(this.f, this.b);
            }
            final int f = this.f;
            this.f = at1.a.q(f, this.b) + f;
            return v;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }
    
    public final void o() {
        if (this.i == 0) {
            this.f = this.g;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }
    
    public final void p() {
        if (this.i <= 0) {
            final int[] b = this.b;
            final int f = this.f;
            if (b[f * 5 + 2] != this.h) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            this.h = f;
            this.g = at1.a.q(f, b) + f;
            final int f2 = this.f;
            final int f3 = f2 + 1;
            this.f = f3;
            this.j = at1.a.y(f2, this.b);
            int e;
            if (f2 >= this.c - 1) {
                e = this.e;
            }
            else {
                e = this.b[f3 * 5 + 4];
            }
            this.k = e;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SlotReader(current=");
        k.append(this.f);
        k.append(", key=");
        k.append(this.f());
        k.append(", parent=");
        k.append(this.h);
        k.append(", end=");
        return d.k(k, this.g, ')');
    }
}
