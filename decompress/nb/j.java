// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.w$a;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import bd.s;
import db.w;
import java.util.List;

public final class j implements k
{
    public final List<e0$a> a;
    public final w[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    
    public j(final List<e0$a> a) {
        this.a = a;
        this.b = new w[a.size()];
        this.f = -9223372036854775807L;
    }
    
    public final void b() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
    
    public final void c(final s s) {
        if (this.c) {
            final int d = this.d;
            int i = 0;
            if (d == 2) {
                boolean c;
                if (s.c - s.b == 0) {
                    c = false;
                }
                else {
                    if (s.r() != 32) {
                        this.c = false;
                    }
                    --this.d;
                    c = this.c;
                }
                if (!c) {
                    return;
                }
            }
            if (this.d == 1) {
                boolean c2;
                if (s.c - s.b == 0) {
                    c2 = false;
                }
                else {
                    if (s.r() != 0) {
                        this.c = false;
                    }
                    --this.d;
                    c2 = this.c;
                }
                if (!c2) {
                    return;
                }
            }
            final int b = s.b;
            final int n = s.c - b;
            for (w[] b2 = this.b; i < b2.length; ++i) {
                final w w = b2[i];
                s.B(b);
                w.c(n, s);
            }
            this.e += n;
        }
    }
    
    public final void d(final db.j j, final e0$d e0$d) {
        for (int i = 0; i < this.b.length; ++i) {
            final e0$a e0$a = this.a.get(i);
            e0$d.a();
            e0$d.b();
            final w k = j.k(e0$d.d, 3);
            final n$a n$a = new n$a();
            e0$d.b();
            n$a.a = e0$d.e;
            n$a.k = "application/dvbsubs";
            n$a.m = Collections.singletonList(e0$a.b);
            n$a.c = e0$a.a;
            k.a(new n(n$a));
            this.b[i] = k;
        }
    }
    
    public final void e() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                final w[] b = this.b;
                for (int length = b.length, i = 0; i < length; ++i) {
                    b[i].b(this.f, 1, this.e, 0, (w$a)null);
                }
            }
            this.c = false;
        }
    }
    
    public final void f(final int n, final long f) {
        if ((n & 0x4) == 0x0) {
            return;
        }
        this.c = true;
        if (f != -9223372036854775807L) {
            this.f = f;
        }
        this.e = 0;
        this.d = 2;
    }
}
