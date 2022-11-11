// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import ad.c0;
import android.util.Pair;
import va.d0;
import ac.q;

public abstract class a extends e0
{
    public final int g;
    public final q h;
    public final boolean i;
    
    public a(final q h) {
        this.i = false;
        this.h = h;
        this.g = h.getLength();
    }
    
    public final int a(boolean b) {
        if (this.g == 0) {
            return -1;
        }
        final boolean i = this.i;
        int n = 0;
        if (i) {
            b = false;
        }
        if (b) {
            n = this.h.e();
        }
        do {
            final d0 d0 = (d0)this;
            if (d0.o[n].p()) {
                continue;
            }
            return d0.o[n].a(b) + d0.n[n];
        } while ((n = this.r(n, b)) != -1);
        return -1;
    }
    
    public final int b(final Object o) {
        final boolean b = o instanceof Pair;
        final int n = -1;
        if (!b) {
            return -1;
        }
        final Pair pair = (Pair)o;
        final Object first = pair.first;
        final Object second = pair.second;
        final d0 d0 = (d0)this;
        final Integer n2 = d0.q.get(first);
        int intValue;
        if (n2 == null) {
            intValue = -1;
        }
        else {
            intValue = n2;
        }
        if (intValue == -1) {
            return -1;
        }
        final int b2 = d0.o[intValue].b(second);
        int n3;
        if (b2 == -1) {
            n3 = n;
        }
        else {
            n3 = d0.m[intValue] + b2;
        }
        return n3;
    }
    
    public final int c(boolean b) {
        final int g = this.g;
        if (g == 0) {
            return -1;
        }
        if (this.i) {
            b = false;
        }
        int c;
        if (b) {
            c = this.h.c();
        }
        else {
            c = g - 1;
        }
        int i;
        do {
            final d0 d0 = (d0)this;
            if (!d0.o[c].p()) {
                return d0.o[c].c(b) + d0.n[c];
            }
            if (b) {
                i = this.h.a(c);
            }
            else if (c > 0) {
                i = c - 1;
            }
            else {
                i = -1;
            }
            c = i;
        } while (i != -1);
        return -1;
    }
    
    public final int e(int n, int n2, boolean b) {
        final boolean i = this.i;
        final int n3 = 0;
        int n4 = n2;
        if (i) {
            if ((n4 = n2) == 1) {
                n4 = 2;
            }
            b = false;
        }
        final d0 d0 = (d0)this;
        final int c = c0.c(n + 1, d0.n);
        final int n5 = d0.n[c];
        final e0 e0 = d0.o[c];
        if (n4 == 2) {
            n2 = n3;
        }
        else {
            n2 = n4;
        }
        n = e0.e(n - n5, n2, b);
        if (n != -1) {
            return n5 + n;
        }
        for (n = this.r(c, b); n != -1 && d0.o[n].p(); n = this.r(n, b)) {}
        if (n != -1) {
            n2 = d0.n[n];
            return d0.o[n].a(b) + n2;
        }
        if (n4 == 2) {
            return this.a(b);
        }
        return -1;
    }
    
    public final e0$b f(final int n, final e0$b e0$b, final boolean b) {
        final d0 d0 = (d0)this;
        final int c = c0.c(n + 1, d0.m);
        final int n2 = d0.n[c];
        d0.o[c].f(n - d0.m[c], e0$b, b);
        e0$b.h += n2;
        if (b) {
            final Object o = d0.p[c];
            final Object g = e0$b.g;
            g.getClass();
            e0$b.g = Pair.create(o, g);
        }
        return e0$b;
    }
    
    public final e0$b g(final Object g, final e0$b e0$b) {
        final Pair pair = (Pair)g;
        final Object first = pair.first;
        final Object second = pair.second;
        final d0 d0 = (d0)this;
        final Integer n = d0.q.get(first);
        int intValue;
        if (n == null) {
            intValue = -1;
        }
        else {
            intValue = n;
        }
        final int n2 = d0.n[intValue];
        d0.o[intValue].g(second, e0$b);
        e0$b.h += n2;
        e0$b.g = g;
        return e0$b;
    }
    
    public final int k(int n, int n2, boolean b) {
        final boolean i = this.i;
        final int n3 = 0;
        int n4 = n2;
        if (i) {
            if ((n4 = n2) == 1) {
                n4 = 2;
            }
            b = false;
        }
        final d0 d0 = (d0)this;
        final int c = c0.c(n + 1, d0.n);
        final int n5 = d0.n[c];
        final e0 e0 = d0.o[c];
        if (n4 == 2) {
            n2 = n3;
        }
        else {
            n2 = n4;
        }
        n = e0.k(n - n5, n2, b);
        if (n != -1) {
            return n5 + n;
        }
        while (true) {
            boolean b2 = false;
            Label_0144: {
                if (b) {
                    n = this.h.a(c);
                }
                else {
                    n2 = n4;
                    b2 = b;
                    if (c <= 0) {
                        break Label_0144;
                    }
                    n = c - 1;
                }
                while (n != -1 && d0.o[n].p()) {
                    if (b) {
                        n = this.h.a(n);
                    }
                    else {
                        n2 = n4;
                        b2 = b;
                        if (n <= 0) {
                            break Label_0144;
                        }
                        --n;
                    }
                }
                if (n != -1) {
                    n2 = d0.n[n];
                    return d0.o[n].c(b) + n2;
                }
                if (n4 == 2) {
                    return this.c(b);
                }
                return -1;
            }
            n = -1;
            b = b2;
            n4 = n2;
            continue;
        }
    }
    
    public final Object l(final int n) {
        final d0 d0 = (d0)this;
        final int c = c0.c(n + 1, d0.m);
        return Pair.create(d0.p[c], d0.o[c].l(n - d0.m[c]));
    }
    
    public final e0$c n(final int n, final e0$c e0$c, final long n2) {
        final d0 d0 = (d0)this;
        final int c = c0.c(n + 1, d0.n);
        final int n3 = d0.n[c];
        final int n4 = d0.m[c];
        d0.o[c].n(n - n3, e0$c, n2);
        Object create = d0.p[c];
        if (!e0$c.w.equals(e0$c.f)) {
            create = Pair.create(create, e0$c.f);
        }
        e0$c.f = create;
        e0$c.t += n4;
        e0$c.u += n4;
        return e0$c;
    }
    
    public final int r(int b, final boolean b2) {
        if (b2) {
            b = this.h.b(b);
        }
        else if (b < this.g - 1) {
            ++b;
        }
        else {
            b = -1;
        }
        return b;
    }
}
