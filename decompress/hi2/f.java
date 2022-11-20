// 
// Decompiled by Procyon v0.6.0
// 

package hi2;

import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import java.util.Collection;
import mg2.l;
import ch2.i0;
import ch2.c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import java.util.Set;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public final class f extends g
{
    public final MemberScope b;
    
    public f(final MemberScope b) {
        e.f((Object)b, "workerScope");
        this.b = b;
    }
    
    @Override
    public final Set<yh2.e> a() {
        return this.b.a();
    }
    
    @Override
    public final Set<yh2.e> d() {
        return this.b.d();
    }
    
    @Override
    public final ch2.e e(final yh2.e e, final NoLookupLocation noLookupLocation) {
        e.f((Object)e, "name");
        e.f((Object)noLookupLocation, "location");
        final ch2.e e2 = ((h)this.b).e(e, noLookupLocation);
        Object o2;
        final Object o = o2 = null;
        if (e2 != null) {
            if (e2 instanceof c) {
                o2 = e2;
            }
            else {
                o2 = null;
            }
            if (o2 == null) {
                o2 = o;
                if (e2 instanceof i0) {
                    o2 = e2;
                }
            }
        }
        return (ch2.e)o2;
    }
    
    @Override
    public final Set<yh2.e> f() {
        return this.b.f();
    }
    
    @Override
    public final Collection g(d d, final l l) {
        e.f((Object)d, "kindFilter");
        e.f((Object)l, "nameFilter");
        final int n = d.l & d.b;
        if (n == 0) {
            d = null;
        }
        else {
            d = new d(n, d.a);
        }
        Object instance;
        if (d == null) {
            instance = EmptyList.INSTANCE;
        }
        else {
            final Collection g = ((h)this.b).g(d, l);
            instance = new ArrayList<Object>();
            for (final Object next : g) {
                if (next instanceof ch2.f) {
                    ((ArrayList<Object>)instance).add(next);
                }
            }
        }
        return (Collection)instance;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Classes from ");
        t.append(this.b);
        return t.toString();
    }
}
