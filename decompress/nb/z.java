// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import com.google.android.exoplayer2.n$a;
import ah0.b;
import db.j;
import db.w;
import com.google.android.exoplayer2.n;
import java.util.List;

public final class z
{
    public final List<n> a;
    public final w[] b;
    
    public z(final List<n> a) {
        this.a = a;
        this.b = new w[a.size()];
    }
    
    public final void a(final j j, final d0.d d) {
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
            String a = n.f;
            if (a == null) {
                d.b();
                a = d.e;
            }
            final n$a n$a = new n$a();
            n$a.a = a;
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
