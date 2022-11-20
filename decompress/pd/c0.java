// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import java.util.Iterator;
import java.util.Map;
import qd.d;
import java.util.Set;
import qd.u;
import com.google.android.gms.common.api.a;
import java.util.Collection;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.Collections;
import com.google.android.gms.common.api.a$e;
import java.util.ArrayList;

public final class c0 extends g0
{
    public final ArrayList<a$e> g;
    public final h0 h;
    
    public c0(final h0 h, final ArrayList<a$e> g) {
        super(this.h = h);
        this.g = g;
    }
    
    public final void a() {
        final h0 h = this.h;
        final l0 m = h.a.m;
        final d r = h.r;
        Set<Scope> emptySet;
        if (r == null) {
            emptySet = Collections.emptySet();
        }
        else {
            emptySet = new HashSet<Scope>(r.b);
            final Map d = h.r.d;
            for (final a a : d.keySet()) {
                if (!h.a.g.containsKey(a.b)) {
                    ((u)d.get(a)).getClass();
                    emptySet.addAll(null);
                }
            }
        }
        m.u = emptySet;
        final ArrayList<a$e> g = this.g;
        for (int size = g.size(), i = 0; i < size; ++i) {
            final a$e a$e = (a$e)g.get(i);
            final h0 h2 = this.h;
            a$e.u(h2.o, (Set)h2.a.m.u);
        }
    }
}
