// 
// Decompiled by Procyon v0.6.0
// 

package lc;

import db.j;
import db.w$a;
import bd.c0;
import bd.s;
import db.w;
import bd.r;

public final class b implements e
{
    public final kc.e a;
    public final r b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public w h;
    public long i;
    
    public b(final kc.e a) {
        this.a = a;
        this.b = new r();
        this.c = a.b;
        final String s = (String)a.d.get((Object)"mode");
        s.getClass();
        if (mk2.e.w((CharSequence)s, "AAC-hbr")) {
            this.d = 13;
            this.e = 3;
        }
        else {
            if (!mk2.e.w((CharSequence)s, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.d = 6;
            this.e = 2;
        }
        this.f = this.e + this.d;
    }
    
    @Override
    public final void a(final long g, final long i) {
        this.g = g;
        this.i = i;
    }
    
    @Override
    public final void b(int i, long n, final s s, final boolean b) {
        this.h.getClass();
        i = s.n();
        final int n2 = i / this.f;
        n = this.i + c0.P(n - this.g, 1000000L, this.c);
        final r b2 = this.b;
        b2.getClass();
        b2.j(s.c, s.a);
        b2.k(s.b * 8);
        if (n2 == 1) {
            i = this.b.g(this.d);
            this.b.m(this.e);
            this.h.c(s.c - s.b, s);
            if (b) {
                this.h.b(n, 1, i, 0, (w$a)null);
            }
        }
        else {
            s.C((i + 7) / 8);
            int g;
            for (i = 0; i < n2; ++i) {
                g = this.b.g(this.d);
                this.b.m(this.e);
                this.h.c(g, s);
                this.h.b(n, 1, g, 0, (w$a)null);
                n += c0.P(n2, 1000000L, this.c);
            }
        }
    }
    
    @Override
    public final void c(final long g) {
        this.g = g;
    }
    
    @Override
    public final void d(final j j, final int n) {
        (this.h = j.k(n, 1)).a(this.a.c);
    }
}
