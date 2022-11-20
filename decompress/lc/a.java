// 
// Decompiled by Procyon v0.6.0
// 

package lc;

import db.j;
import db.w$a;
import bd.c0;
import bd.t;
import zd.b;
import db.w;
import bd.s;
import kc.f;

public final class a implements d
{
    public final f a;
    public final s b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public w h;
    public long i;
    
    public a(final f a) {
        this.a = a;
        this.b = new s();
        this.c = a.b;
        final String s = (String)a.d.get((Object)"mode");
        s.getClass();
        if (zd.b.S(s, "AAC-hbr")) {
            this.d = 13;
            this.e = 3;
        }
        else {
            if (!zd.b.S(s, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.d = 6;
            this.e = 2;
        }
        this.f = this.e + this.d;
    }
    
    public final void a(final long g, final long i) {
        this.g = g;
        this.i = i;
    }
    
    public final void b(int i, long n, final t t, final boolean b) {
        this.h.getClass();
        i = t.n();
        final int n2 = i / this.f;
        n = this.i + c0.P(n - this.g, 1000000L, (long)this.c);
        final s b2 = this.b;
        b2.getClass();
        b2.j(t.c, t.a);
        b2.k(t.b * 8);
        if (n2 == 1) {
            i = this.b.g(this.d);
            this.b.m(this.e);
            this.h.c(t.c - t.b, t);
            if (b) {
                this.h.b(n, 1, i, 0, (w$a)null);
            }
        }
        else {
            t.C((i + 7) / 8);
            int g;
            for (i = 0; i < n2; ++i) {
                g = this.b.g(this.d);
                this.b.m(this.e);
                this.h.c(g, t);
                this.h.b(n, 1, g, 0, (w$a)null);
                n += c0.P((long)n2, 1000000L, (long)this.c);
            }
        }
    }
    
    public final void c(final long g) {
        this.g = g;
    }
    
    public final void d(final j j, final int n) {
        (this.h = j.k(n, 1)).a(this.a.c);
    }
}
