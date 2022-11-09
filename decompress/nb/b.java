// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import ya.b$a;
import com.google.android.exoplayer2.n$a;
import bd.c0;
import db.w$a;
import bd.d0;
import com.google.android.exoplayer2.n;
import db.w;
import bd.s;
import bd.r;

public final class b implements k
{
    public final r a;
    public final s b;
    public final String c;
    public String d;
    public w e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public n j;
    public int k;
    public long l;
    
    public b(final String c) {
        final r a = new r(new byte[128], 128);
        this.a = a;
        this.b = new s(a.a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = c;
    }
    
    public final void b() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }
    
    public final void c(final s s) {
        d0.g(this.e);
    Label_0007:
        while (true) {
            final int n = s.c - s.b;
            if (n <= 0) {
                break;
            }
            final int f = this.f;
            boolean b = true;
            if (f == 0) {
                while (true) {
                    while (s.c - s.b > 0) {
                        if (!this.h) {
                            this.h = (s.r() == 11);
                        }
                        else {
                            final int r = s.r();
                            if (r == 119) {
                                this.h = false;
                                final boolean b2 = true;
                                if (b2) {
                                    this.f = 1;
                                    final byte[] a = this.b.a;
                                    a[0] = 11;
                                    a[1] = 119;
                                    this.g = 2;
                                    continue Label_0007;
                                }
                                continue Label_0007;
                            }
                            else {
                                this.h = (r == 11);
                            }
                        }
                    }
                    final boolean b2 = false;
                    continue;
                }
            }
            if (f != 1) {
                if (f != 2) {
                    continue;
                }
                final int min = Math.min(n, this.k - this.g);
                this.e.c(min, s);
                final int g = this.g + min;
                this.g = g;
                final int k = this.k;
                if (g != k) {
                    continue;
                }
                final long l = this.l;
                if (l != -9223372036854775807L) {
                    this.e.b(l, 1, k, 0, (w$a)null);
                    this.l += this.i;
                }
                this.f = 0;
            }
            else {
                final byte[] a2 = this.b.a;
                final int min2 = Math.min(n, 128 - this.g);
                s.b(this.g, min2, a2);
                if ((this.g += min2) != 128) {
                    b = false;
                }
                if (!b) {
                    continue;
                }
                this.a.k(0);
                final b$a b3 = ya.b.b(this.a);
                final n j = this.j;
                if (j == null || b3.c != j.D || b3.b != j.E || !c0.a(b3.a, j.q)) {
                    final n$a n$a = new n$a();
                    n$a.a = this.d;
                    n$a.k = b3.a;
                    n$a.x = b3.c;
                    n$a.y = b3.b;
                    n$a.c = this.c;
                    final n i = new n(n$a);
                    this.j = i;
                    this.e.a(i);
                }
                this.k = b3.d;
                this.i = b3.e * 1000000L / this.j.E;
                this.b.B(0);
                this.e.c(128, this.b);
                this.f = 2;
            }
        }
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.d = e0$d.e;
        e0$d.b();
        this.e = j.k(e0$d.d, 1);
    }
    
    public final void e() {
    }
    
    public final void f(final int n, final long l) {
        if (l != -9223372036854775807L) {
            this.l = l;
        }
    }
}
