// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.j;
import com.google.android.exoplayer2.n;
import db.w$a;
import bd.d0;
import db.w;
import ya.n$a;
import bd.s;

public final class r implements k
{
    public final s a;
    public final n$a b;
    public final String c;
    public w d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;
    
    public r(final String c) {
        this.f = 0;
        final s a = new s(4);
        this.a = a;
        a.a[0] = -1;
        this.b = new n$a();
        this.l = -9223372036854775807L;
        this.c = c;
    }
    
    public final void b() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
    
    public final void c(final s s) {
        d0.g(this.d);
    Label_0007:
        while (true) {
            final int c = s.c;
            int i = s.b;
            final int n = c - i;
            if (n <= 0) {
                return;
            }
            final int f = this.f;
            if (f != 0) {
                if (f != 1) {
                    if (f != 2) {
                        throw new IllegalStateException();
                    }
                    final int min = Math.min(n, this.k - this.g);
                    this.d.c(min, s);
                    final int g = this.g + min;
                    this.g = g;
                    final int k = this.k;
                    if (g < k) {
                        continue;
                    }
                    final long l = this.l;
                    if (l != -9223372036854775807L) {
                        this.d.b(l, 1, k, 0, (w$a)null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
                else {
                    final int min2 = Math.min(n, 4 - this.g);
                    s.b(this.g, min2, this.a.a);
                    if ((this.g += min2) < 4) {
                        continue;
                    }
                    this.a.B(0);
                    if (!this.b.a(this.a.c())) {
                        this.g = 0;
                        this.f = 1;
                    }
                    else {
                        final n$a b = this.b;
                        this.k = b.c;
                        if (!this.h) {
                            final long n2 = b.g;
                            final int d = b.d;
                            this.j = n2 * 1000000L / d;
                            final com.google.android.exoplayer2.n$a n$a = new com.google.android.exoplayer2.n$a();
                            n$a.a = this.e;
                            n$a.k = b.b;
                            n$a.l = 4096;
                            n$a.x = b.e;
                            n$a.y = d;
                            n$a.c = this.c;
                            this.d.a(new n(n$a));
                            this.h = true;
                        }
                        this.a.B(0);
                        this.d.c(4, this.a);
                        this.f = 2;
                    }
                }
            }
            else {
                final byte[] a = s.a;
                while (i < c) {
                    final byte b2 = a[i];
                    final boolean j = (b2 & 0xFF) == 0xFF;
                    final boolean b3 = this.i && (b2 & 0xE0) == 0xE0;
                    this.i = j;
                    if (b3) {
                        s.B(i + 1);
                        this.i = false;
                        this.a.a[1] = a[i];
                        this.g = 2;
                        this.f = 1;
                        continue Label_0007;
                    }
                    ++i;
                }
                s.B(c);
            }
        }
    }
    
    public final void d(final j j, final e0$d e0$d) {
        e0$d.a();
        e0$d.b();
        this.e = e0$d.e;
        e0$d.b();
        this.d = j.k(e0$d.d, 1);
    }
    
    public final void e() {
    }
    
    public final void f(final int n, final long l) {
        if (l != -9223372036854775807L) {
            this.l = l;
        }
    }
}
