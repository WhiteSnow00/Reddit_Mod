// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import hh2.y;
import java.util.Iterator;
import java.util.AbstractCollection;
import java.util.ArrayList;
import mi2.c$b;
import kotlin.collections.EmptyList;
import java.util.Collection;
import rg2.l;
import mi2.d;
import kotlin.collections.EmptySet;
import java.util.Set;
import sg2.e;
import di2.c;
import hh2.t;
import mi2.g;

public final class i0 extends g
{
    public final t b;
    public final c c;
    
    public i0(final kotlin.reflect.jvm.internal.impl.descriptors.impl.c b, final c c) {
        e.f((Object)b, "moduleDescriptor");
        e.f((Object)c, "fqName");
        this.b = (t)b;
        this.c = c;
    }
    
    public final Set<di2.e> f() {
        return (Set<di2.e>)EmptySet.INSTANCE;
    }
    
    public final Collection<hh2.g> g(final d d, final l<? super di2.e, Boolean> l) {
        e.f((Object)d, "kindFilter");
        e.f((Object)l, "nameFilter");
        if (!d.a(d.h)) {
            return (Collection<hh2.g>)EmptyList.INSTANCE;
        }
        if (this.c.d() && d.a.contains(c$b.a)) {
            return (Collection<hh2.g>)EmptyList.INSTANCE;
        }
        final Collection r = this.b.r(this.c, (l)l);
        final ArrayList list = new ArrayList(r.size());
        final Iterator iterator = r.iterator();
        while (iterator.hasNext()) {
            final di2.e f = ((c)iterator.next()).f();
            e.e((Object)f, "subFqName.shortName()");
            if (l.invoke(f)) {
                final boolean g = f.g;
                Object o = null;
                if (!g) {
                    final y k0 = this.b.k0(this.c.c(f));
                    if (!k0.isEmpty()) {
                        o = k0;
                    }
                }
                bg.d.A((AbstractCollection)list, o);
            }
        }
        return (Collection<hh2.g>)list;
    }
    
    public final String toString() {
        final StringBuilder r = a.r("subpackages of ");
        r.append(this.c);
        r.append(" from ");
        r.append(this.b);
        return r.toString();
    }
}
