// 
// Decompiled by Procyon v0.6.0
// 

package hi2;

import ch2.s;
import ch2.g;
import mg2.l;
import ch2.f;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xd.a;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import java.util.Collection;
import dg2.o;
import java.util.LinkedHashSet;
import yh2.e;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public final class b implements MemberScope
{
    public final String b;
    public final MemberScope[] c;
    
    public b(final String b, final MemberScope[] c) {
        this.b = b;
        this.c = c;
    }
    
    public final Set<e> a() {
        final MemberScope[] c = this.c;
        final LinkedHashSet set = new LinkedHashSet();
        for (int length = c.length, i = 0; i < length; ++i) {
            o.B4((Iterable)c[i].a(), (Collection)set);
        }
        return set;
    }
    
    public final Collection b(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        final MemberScope[] c = this.c;
        final int length = c.length;
        Object o;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Collection g = null;
                while (i < c.length) {
                    g = a.G(g, c[i].b(e, noLookupLocation));
                    ++i;
                }
                if ((o = g) == null) {
                    o = EmptySet.INSTANCE;
                }
            }
            else {
                o = c[0].b(e, noLookupLocation);
            }
        }
        else {
            o = EmptyList.INSTANCE;
        }
        return (Collection)o;
    }
    
    public final Collection c(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        final MemberScope[] c = this.c;
        final int length = c.length;
        Object o;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Collection g = null;
                while (i < c.length) {
                    g = a.G(g, c[i].c(e, noLookupLocation));
                    ++i;
                }
                if ((o = g) == null) {
                    o = EmptySet.INSTANCE;
                }
            }
            else {
                o = c[0].c(e, noLookupLocation);
            }
        }
        else {
            o = EmptyList.INSTANCE;
        }
        return (Collection)o;
    }
    
    public final Set<e> d() {
        final MemberScope[] c = this.c;
        final LinkedHashSet set = new LinkedHashSet();
        for (int length = c.length, i = 0; i < length; ++i) {
            o.B4((Iterable)c[i].d(), (Collection)set);
        }
        return set;
    }
    
    public final ch2.e e(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        final MemberScope[] c = this.c;
        final int length = c.length;
        Object o = null;
        int n = 0;
        Object e2;
        while (true) {
            e2 = o;
            if (n >= length) {
                break;
            }
            e2 = ((h)c[n]).e(e, noLookupLocation);
            Object o2 = o;
            if (e2 != null) {
                if (!(e2 instanceof f) || !((s)e2).p0()) {
                    break;
                }
                if ((o2 = o) == null) {
                    o2 = e2;
                }
            }
            ++n;
            o = o2;
        }
        return (ch2.e)e2;
    }
    
    public final Set<e> f() {
        return zg.a.I(kotlin.collections.b.Z1((Object[])this.c));
    }
    
    public final Collection<g> g(final d d, final l<? super e, Boolean> l) {
        ng2.e.f((Object)d, "kindFilter");
        ng2.e.f((Object)l, "nameFilter");
        final MemberScope[] c = this.c;
        final int length = c.length;
        Object o;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Collection g = null;
                while (i < c.length) {
                    g = a.G(g, ((h)c[i]).g(d, (l)l));
                    ++i;
                }
                if ((o = g) == null) {
                    o = EmptySet.INSTANCE;
                }
            }
            else {
                o = ((h)c[0]).g(d, (l)l);
            }
        }
        else {
            o = EmptyList.INSTANCE;
        }
        return (Collection<g>)o;
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
}
