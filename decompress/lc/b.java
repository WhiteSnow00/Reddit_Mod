// 
// Decompiled by Procyon v0.6.0
// 

package lc;

import db.j;
import ya.b$a;
import db.w$a;
import bd.c0;
import bd.t;
import db.w;
import bd.s;
import kc.f;

public final class b implements d
{
    public final f a;
    public final s b;
    public w c;
    public int d;
    public long e;
    public long f;
    public long g;
    
    public b(final f a) {
        this.a = a;
        this.b = new s();
        this.e = -9223372036854775807L;
    }
    
    public final void a(final long e, final long g) {
        this.e = e;
        this.g = g;
    }
    
    public final void b(int i, long f, final t t, final boolean b) {
        final int n = t.r() & 0x3;
        final int n2 = t.r() & 0xFF;
        f = this.g + c0.P(f - this.e, 1000000L, (long)this.a.b);
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
            i = t.c - t.b;
            final w c = this.c;
            c.getClass();
            c.c(i, t);
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
                i = t.c - t.b;
                final w c2 = this.c;
                c2.getClass();
                c2.c(i, t);
                this.c.b(f, 1, i, 0, (w$a)null);
            }
            else {
                final s b2 = this.b;
                final byte[] a = t.a;
                b2.getClass();
                b2.j(a.length, a);
                this.b.n(2);
                while (i < n2) {
                    final b$a b3 = b.b(this.b);
                    final w c3 = this.c;
                    c3.getClass();
                    c3.c(b3.d, t);
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
    
    public final void c(final long e) {
        ah0.b.H(this.e == -9223372036854775807L);
        this.e = e;
    }
    
    public final void d(final j j, final int n) {
        (this.c = j.k(n, 1)).a(this.a.c);
    }
}
