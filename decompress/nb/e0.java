// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import com.google.android.exoplayer2.n$a;
import db.j;
import db.b;
import bd.t;
import db.w;
import com.google.android.exoplayer2.n;
import java.util.List;

public final class e0
{
    public final List<n> a;
    public final w[] b;
    
    public e0(final List<n> a) {
        this.a = a;
        this.b = new w[a.size()];
    }
    
    public final void a(final long n, final t t) {
        if (t.c - t.b < 9) {
            return;
        }
        final int c = t.c();
        final int c2 = t.c();
        final int r = t.r();
        if (c == 434 && c2 == 1195456820 && r == 3) {
            db.b.b(n, t, this.b);
        }
    }
    
    public final void b(final j j, final d0.d d) {
        for (int i = 0; i < this.b.length; ++i) {
            d.a();
            d.b();
            final w k = j.k(d.d, 3);
            final n n = this.a.get(i);
            final String q = n.q;
            final boolean b = "application/cea-608".equals(q) || "application/cea-708".equals(q);
            final String value = String.valueOf(q);
            String concat;
            if (value.length() != 0) {
                concat = "Invalid closed caption mime type provided: ".concat(value);
            }
            else {
                concat = new String("Invalid closed caption mime type provided: ");
            }
            ah0.b.D(b, concat);
            final n$a n$a = new n$a();
            d.b();
            n$a.a = d.e;
            n$a.k = q;
            n$a.d = n.i;
            n$a.c = n.h;
            n$a.C = n.I;
            n$a.m = n.s;
            k.a(new n(n$a));
            this.b[i] = k;
        }
    }
}
