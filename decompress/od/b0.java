// 
// Decompiled by Procyon v0.6.0
// 

package od;

import se.f;
import java.util.Iterator;
import pd.b$c;
import android.app.PendingIntent;
import md.b;
import java.util.ArrayList;
import pd.f0;
import java.util.HashMap;
import com.google.android.gms.common.api.a$e;
import java.util.Map;

public final class b0 extends g0
{
    public final Map<a$e, y> h;
    public final /* synthetic */ h0 i;
    
    public b0(final h0 i, final HashMap h) {
        this.i = i;
        super(i);
        this.h = h;
    }
    
    @Override
    public final void b() {
        final f0 f0 = new f0(this.i.d);
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (final a$e a$e : this.h.keySet()) {
            if (a$e.r() && !this.h.get(a$e).c) {
                list.add(a$e);
            }
            else {
                list2.add(a$e);
            }
        }
        final boolean empty = list.isEmpty();
        int n = -1;
        final int n2 = 0;
        int i = 0;
        if (empty) {
            while (i < list2.size()) {
                final int a = f0.a(this.i.c, (a$e)list2.get(i));
                ++i;
                if ((n = a) == 0) {
                    n = a;
                    break;
                }
            }
        }
        else {
            final int size = list.size();
            int j = n2;
            while (j < size) {
                final int a2 = f0.a(this.i.c, (a$e)list.get(j));
                ++j;
                if ((n = a2) != 0) {
                    n = a2;
                    break;
                }
            }
        }
        if (n != 0) {
            final b b = new b(n, (PendingIntent)null);
            final h0 k = this.i;
            k.a.i(new z(this, k, b));
            return;
        }
        final h0 l = this.i;
        if (l.m) {
            final f m = l.k;
            if (m != null) {
                m.i();
            }
        }
        for (final a$e a$e2 : this.h.keySet()) {
            final b$c b$c = (b$c)this.h.get(a$e2);
            if (a$e2.r() && f0.a(this.i.c, a$e2) != 0) {
                final h0 i2 = this.i;
                i2.a.i(new a0(i2, b$c));
            }
            else {
                a$e2.l(b$c);
            }
        }
    }
}
