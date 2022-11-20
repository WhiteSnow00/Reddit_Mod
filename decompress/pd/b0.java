// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import te.f;
import java.util.Iterator;
import qd.b$c;
import android.app.PendingIntent;
import nd.b;
import java.util.ArrayList;
import qd.e0;
import java.util.HashMap;
import com.google.android.gms.common.api.a$e;
import java.util.Map;

public final class b0 extends g0
{
    public final Map<a$e, y> g;
    public final h0 h;
    
    public b0(final h0 h, final HashMap g) {
        super(this.h = h);
        this.g = g;
    }
    
    public final void a() {
        final e0 e0 = new e0(this.h.d);
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (final a$e a$e : this.g.keySet()) {
            if (a$e.p() && !this.g.get(a$e).c) {
                list.add(a$e);
            }
            else {
                list2.add(a$e);
            }
        }
        final boolean empty = list.isEmpty();
        int n = -1;
        int i = 0;
        final int n2 = 0;
        if (empty) {
            final int size = list2.size();
            int j = n2;
            while (j < size) {
                final int a = e0.a(this.h.c, (a$e)list2.get(j));
                ++j;
                if ((n = a) == 0) {
                    n = a;
                    break;
                }
            }
        }
        else {
            while (i < list.size()) {
                final int a2 = e0.a(this.h.c, (a$e)list.get(i));
                ++i;
                if ((n = a2) != 0) {
                    n = a2;
                    break;
                }
            }
        }
        if (n != 0) {
            final b b = new b(n, (PendingIntent)null);
            final h0 h = this.h;
            h.a.i((n0)new z(this, h, b));
            return;
        }
        final h0 h2 = this.h;
        if (h2.m) {
            final f k = h2.k;
            if (k != null) {
                k.g();
            }
        }
        for (final a$e a$e2 : this.g.keySet()) {
            final b$c b$c = (b$c)this.g.get(a$e2);
            if (a$e2.p() && e0.a(this.h.c, a$e2) != 0) {
                final h0 h3 = this.h;
                h3.a.i((n0)new a0(h3, b$c));
            }
            else {
                a$e2.s(b$c);
            }
        }
    }
}
