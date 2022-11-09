// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import db.w$a;
import bd.c0;
import bd.d0;
import bd.s;
import db.j;
import com.google.android.exoplayer2.n$a;
import db.w;
import bd.a0;
import com.google.android.exoplayer2.n;

public final class t implements y
{
    public n a;
    public a0 b;
    public w c;
    
    public t(final String k) {
        final n$a n$a = new n$a();
        n$a.k = k;
        this.a = new n(n$a);
    }
    
    public final void a(final a0 b, final j j, final e0$d e0$d) {
        this.b = b;
        e0$d.a();
        e0$d.b();
        (this.c = j.k(e0$d.d, 5)).a(this.a);
    }
    
    public final void c(final s s) {
        d0.g(this.b);
        final int a = c0.a;
        Object a2 = this.b;
        synchronized (a2) {
            final long c = ((a0)a2).c;
            long c2;
            if (c != -9223372036854775807L) {
                c2 = c + ((a0)a2).b;
            }
            else {
                c2 = ((a0)a2).c();
            }
            monitorexit(a2);
            a2 = this.b;
            synchronized (a2) {
                final long b = ((a0)a2).b;
                monitorexit(a2);
                if (c2 != -9223372036854775807L) {
                    if (b != -9223372036854775807L) {
                        a2 = this.a;
                        if (b != ((n)a2).u) {
                            a2 = new n$a((n)a2);
                            ((n$a)a2).o = b;
                            a2 = new n((n$a)a2);
                            this.a = (n)a2;
                            this.c.a((n)a2);
                        }
                        final int n = s.c - s.b;
                        this.c.c(n, s);
                        this.c.b(c2, 1, n, 0, (w$a)null);
                    }
                }
            }
        }
    }
}
