// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import ya.c$a;
import com.google.android.exoplayer2.n$a;
import ya.c;
import db.w$a;
import bd.d0;
import com.google.android.exoplayer2.n;
import db.w;
import bd.s;
import bd.r;

public final class e implements k
{
    public final r a;
    public final s b;
    public final String c;
    public String d;
    public w e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public n k;
    public int l;
    public long m;
    
    public e(final String c) {
        final r a = new r(new byte[16], 16);
        this.a = a;
        this.b = new s(a.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = c;
    }
    
    public final void b() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }
    
    public final void c(final s s) {
        d0.g(this.e);
        while (true) {
            final int n = s.c - s.b;
            if (n <= 0) {
                break;
            }
            final int f = this.f;
            boolean b = true;
            if (f != 0) {
                if (f != 1) {
                    if (f != 2) {
                        continue;
                    }
                    final int min = Math.min(n, this.l - this.g);
                    this.e.c(min, s);
                    final int g = this.g + min;
                    this.g = g;
                    final int l = this.l;
                    if (g != l) {
                        continue;
                    }
                    final long m = this.m;
                    if (m != -9223372036854775807L) {
                        this.e.b(m, 1, l, 0, (w$a)null);
                        this.m += this.j;
                    }
                    this.f = 0;
                }
                else {
                    final byte[] a = this.b.a;
                    final int min2 = Math.min(n, 16 - this.g);
                    s.b(this.g, min2, a);
                    if ((this.g += min2) != 16) {
                        b = false;
                    }
                    if (!b) {
                        continue;
                    }
                    this.a.k(0);
                    final c$a b2 = ya.c.b(this.a);
                    final n k = this.k;
                    if (k == null || 2 != k.D || b2.a != k.E || !"audio/ac4".equals(k.q)) {
                        final n$a n$a = new n$a();
                        n$a.a = this.d;
                        n$a.k = "audio/ac4";
                        n$a.x = 2;
                        n$a.y = b2.a;
                        n$a.c = this.c;
                        final n i = new n(n$a);
                        this.k = i;
                        this.e.a(i);
                    }
                    this.l = b2.b;
                    this.j = b2.c * 1000000L / this.k.E;
                    this.b.B(0);
                    this.e.c(16, this.b);
                    this.f = 2;
                }
            }
            else {
                int n2;
                boolean b4;
                while (true) {
                    final int c = s.c;
                    final int b3 = s.b;
                    n2 = 65;
                    if (c - b3 <= 0) {
                        b4 = false;
                        break;
                    }
                    if (!this.h) {
                        this.h = (s.r() == 172);
                    }
                    else {
                        final int r = s.r();
                        this.h = (r == 172);
                        if (r == 64 || r == 65) {
                            this.i = (r == 65);
                            b4 = true;
                            break;
                        }
                        continue;
                    }
                }
                if (!b4) {
                    continue;
                }
                this.f = 1;
                final byte[] a2 = this.b.a;
                a2[0] = -84;
                int n3;
                if (this.i) {
                    n3 = n2;
                }
                else {
                    n3 = 64;
                }
                a2[1] = (byte)n3;
                this.g = 2;
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
    
    public final void f(final int n, final long m) {
        if (m != -9223372036854775807L) {
            this.m = m;
        }
    }
}
