// 
// Decompiled by Procyon v0.6.0
// 

package lc;

import db.j;
import bd.d0;
import ya.b$a;
import ya.b;
import db.w$a;
import bd.c0;
import bd.s;
import db.w;
import bd.r;

public final class c implements e
{
    public final kc.e a;
    public final r b;
    public w c;
    public int d;
    public long e;
    public long f;
    public long g;
    
    public c(final kc.e a) {
        this.a = a;
        this.b = new r();
        this.e = -9223372036854775807L;
    }
    
    @Override
    public final void a(final long e, final long g) {
        this.e = e;
        this.g = g;
    }
    
    @Override
    public final void b(int i, long f, final s s, final boolean b) {
        final int n = s.r() & 0x3;
        final int n2 = s.r() & 0xFF;
        f = this.g + c0.P(f - this.e, 1000000L, this.a.b);
        i = 0;
        if (n != 0) {
            if (n != 1 && n != 2) {
                if (n != 3) {
                    throw new IllegalArgumentException(String.valueOf(n));
                }
            }
            else {
                i = this.d;
                if (i > 0) {
                    this.c.b(this.f, 1, i, 0, (w$a)null);
                    this.d = 0;
                }
            }
            i = s.c - s.b;
            final w c = this.c;
            c.getClass();
            c.c(i, s);
            i += this.d;
            this.d = i;
            this.f = f;
            if (b && n == 3) {
                this.c.b(f, 1, i, 0, (w$a)null);
                this.d = 0;
            }
        }
        else {
            final int d = this.d;
            if (d > 0) {
                this.c.b(this.f, 1, d, 0, (w$a)null);
                this.d = 0;
            }
            if (n2 == 1) {
                i = s.c - s.b;
                final w c2 = this.c;
                c2.getClass();
                c2.c(i, s);
                this.c.b(f, 1, i, 0, (w$a)null);
            }
            else {
                final r b2 = this.b;
                final byte[] a = s.a;
                b2.getClass();
                b2.j(a.length, a);
                this.b.n(2);
                while (i < n2) {
                    final b$a b3 = b.b(this.b);
                    final w c3 = this.c;
                    c3.getClass();
                    c3.c(b3.d, s);
                    final w c4 = this.c;
                    final int a2 = c0.a;
                    c4.b(f, 1, b3.d, 0, (w$a)null);
                    f += b3.e / b3.b * 1000000L;
                    this.b.n(b3.d);
                    ++i;
                }
            }
        }
    }
    
    @Override
    public final void c(final long e) {
        d0.f(this.e == -9223372036854775807L);
        this.e = e;
    }
    
    @Override
    public final void d(final j j, final int n) {
        (this.c = j.k(n, 1)).a(this.a.c);
    }
}
