// 
// Decompiled by Procyon v0.6.0
// 

package fh2;

import ch2.y;
import java.util.Iterator;
import java.util.AbstractCollection;
import zg.a;
import java.util.ArrayList;
import hi2.c$b;
import kotlin.collections.EmptyList;
import java.util.Collection;
import mg2.l;
import hi2.d;
import kotlin.collections.EmptySet;
import java.util.Set;
import ng2.e;
import yh2.c;
import ch2.t;
import hi2.g;

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
    
    @Override
    public final Set<yh2.e> f() {
        return (Set<yh2.e>)EmptySet.INSTANCE;
    }
    
    @Override
    public final Collection<ch2.g> g(final d d, final l<? super yh2.e, Boolean> l) {
        e.f((Object)d, "kindFilter");
        e.f((Object)l, "nameFilter");
        if (!d.a(d.h)) {
            return (Collection<ch2.g>)EmptyList.INSTANCE;
        }
        if (this.c.d() && d.a.contains(c$b.a)) {
            return (Collection<ch2.g>)EmptyList.INSTANCE;
        }
        final Collection k = this.b.k(this.c, (l)l);
        final ArrayList list = new ArrayList(k.size());
        final Iterator iterator = k.iterator();
        while (iterator.hasNext()) {
            final yh2.e f = ((c)iterator.next()).f();
            e.e((Object)f, "subFqName.shortName()");
            if (l.invoke((Object)f)) {
                final boolean g = f.g;
                Object o = null;
                if (!g) {
                    final y d2 = this.b.D0(this.c.c(f));
                    if (!d2.isEmpty()) {
                        o = d2;
                    }
                }
                a.g((AbstractCollection)list, o);
            }
        }
        return (Collection<ch2.g>)list;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("subpackages of ");
        t.append(this.c);
        t.append(" from ");
        t.append(this.b);
        return t.toString();
    }
}
