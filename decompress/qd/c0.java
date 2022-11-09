// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import java.util.Iterator;
import java.util.Map;
import rd.d;
import java.util.Set;
import rd.u;
import com.google.android.gms.common.api.a;
import java.util.Collection;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.Collections;
import com.google.android.gms.common.api.a$e;
import java.util.ArrayList;

public final class c0 extends g0
{
    public final ArrayList<a$e> h;
    public final /* synthetic */ h0 i;
    
    public c0(final h0 i, final ArrayList<a$e> h) {
        this.i = i;
        super(i);
        this.h = h;
    }
    
    public final void b() {
        final h0 i = this.i;
        final l0 m = i.a.m;
        final d r = i.r;
        Set<Scope> emptySet;
        if (r == null) {
            emptySet = Collections.emptySet();
        }
        else {
            emptySet = new HashSet<Scope>(r.b);
            final Map<a<?>, u> d = i.r.d;
            for (final a a : d.keySet()) {
                if (!i.a.g.containsKey(a.b)) {
                    d.get(a).getClass();
                    emptySet.addAll(null);
                }
            }
        }
        m.u = emptySet;
        final ArrayList<a$e> h = this.h;
        for (int size = h.size(), j = 0; j < size; ++j) {
            final a$e a$e = (a$e)h.get(j);
            final h0 k = this.i;
            a$e.q(k.o, (Set)k.a.m.u);
        }
    }
}
