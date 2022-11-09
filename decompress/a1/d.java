// 
// Decompiled by Procyon v0.6.0
// 

package a1;

import z0.r0;
import java.util.Arrays;
import qg2.j;
import ah2.f;

public final class d<T>
{
    public int[] a;
    public Object[] b;
    public c<T>[] c;
    public int d;
    
    public d() {
        final int[] a = new int[50];
        for (int i = 0; i < 50; ++i) {
            a[i] = i;
        }
        this.a = a;
        this.b = new Object[50];
        this.c = (c<T>[])new c[50];
    }
    
    public final void a(Object f, final Object o) {
        f.f(f, "value");
        f.f(o, "scope");
        Label_0347: {
            int n;
            if (this.d > 0) {
                final int c = this.c(f);
                if ((n = c) >= 0) {
                    f = this.f(c);
                    break Label_0347;
                }
            }
            else {
                n = -1;
            }
            final int n2 = -(n + 1);
            final int d = this.d;
            final int[] a = this.a;
            if (d < a.length) {
                final int n3 = a[d];
                this.b[n3] = f;
                if ((f = this.c[n3]) == null) {
                    f = new c();
                    this.c[n3] = (c<T>)f;
                }
                final int d2 = this.d;
                if (n2 < d2) {
                    final int[] a2 = this.a;
                    j.g1(n2 + 1, n2, d2, a2, a2);
                }
                this.a[n2] = n3;
                ++this.d;
            }
            else {
                final int n4 = a.length * 2;
                final c<T>[] copy = Arrays.copyOf(this.c, n4);
                f.e((Object)copy, "copyOf(this, newSize)");
                this.c = copy;
                final c c2 = new c();
                this.c[d] = (c<T>)c2;
                final Object[] copy2 = Arrays.copyOf(this.b, n4);
                f.e((Object)copy2, "copyOf(this, newSize)");
                (this.b = copy2)[d] = f;
                final int[] a3 = new int[n4];
                int d3 = this.d;
                while (++d3 < n4) {
                    a3[d3] = d3;
                }
                final int d4 = this.d;
                if (n2 < d4) {
                    j.g1(n2 + 1, n2, d4, this.a, a3);
                }
                a3[n2] = d;
                if (n2 > 0) {
                    j.l1(this.a, a3, 0, n2, 6);
                }
                this.a = a3;
                ++this.d;
                f = c2;
            }
        }
        ((c)f).add(o);
    }
    
    public final boolean b(final Object o) {
        f.f(o, "element");
        return this.c(o) >= 0;
    }
    
    public final int c(final Object o) {
        final int identityHashCode = System.identityHashCode(o);
        int i = 0;
        int n = this.d - 1;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final Object o2 = this.b[this.a[n2]];
            f.c(o2);
            final int identityHashCode2 = System.identityHashCode(o2);
            if (identityHashCode2 < identityHashCode) {
                i = n2 + 1;
            }
            else if (identityHashCode2 > identityHashCode) {
                n = n2 - 1;
            }
            else {
                if (o == o2) {
                    return n2;
                }
                for (int j = n2 - 1; -1 < j; --j) {
                    final Object o3 = this.b[this.a[j]];
                    f.c(o3);
                    if (o3 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o3) != identityHashCode) {
                        break;
                    }
                }
                for (int j = n2 + 1; j < this.d; ++j) {
                    final Object o4 = this.b[this.a[j]];
                    f.c(o4);
                    if (o4 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o4) != identityHashCode) {
                        j = -(j + 1);
                        return j;
                    }
                }
                int j = this.d;
                return -(j + 1);
            }
        }
        return -(i + 1);
    }
    
    public final boolean d(final Object o, final r0 r0) {
        f.f(o, "value");
        f.f((Object)r0, "scope");
        final int c = this.c(o);
        if (c < 0) {
            return false;
        }
        final int n = this.a[c];
        final c<T> c2 = this.c[n];
        if (c2 == null) {
            return false;
        }
        final boolean remove = c2.remove((Object)r0);
        if (c2.f == 0) {
            final int n2 = c + 1;
            final int d = this.d;
            if (n2 < d) {
                final int[] a = this.a;
                j.g1(c, n2, d, a, a);
            }
            final int[] a2 = this.a;
            final int d2 = this.d - 1;
            a2[d2] = n;
            this.b[n] = null;
            this.d = d2;
        }
        return remove;
    }
    
    public final void e(final T t) {
        f.f((Object)t, "scope");
        final int d = this.d;
        int i = 0;
        int d2 = 0;
        while (i < d) {
            final int n = this.a[i];
            final c<T> c = this.c[n];
            f.c((Object)c);
            c.remove((Object)t);
            int n2 = d2;
            if (c.f > 0) {
                if (d2 != i) {
                    final int[] a = this.a;
                    final int n3 = a[d2];
                    a[d2] = n;
                    a[i] = n3;
                }
                n2 = d2 + 1;
            }
            ++i;
            d2 = n2;
        }
        for (int d3 = this.d, j = d2; j < d3; ++j) {
            this.b[this.a[j]] = null;
        }
        this.d = d2;
    }
    
    public final c<T> f(final int n) {
        final c<T> c = this.c[this.a[n]];
        f.c((Object)c);
        return c;
    }
}
