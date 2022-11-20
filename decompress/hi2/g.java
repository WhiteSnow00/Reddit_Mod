// 
// Decompiled by Procyon v0.6.0
// 

package hi2;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import java.util.Iterator;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import java.util.LinkedHashSet;
import mg2.l;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import yh2.e;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public abstract class g implements MemberScope
{
    public Set<e> a() {
        final Collection<ch2.g> g = this.g(d.p, (l<? super e, Boolean>)FunctionsKt.a);
        final LinkedHashSet set = new LinkedHashSet();
        for (final f next : g) {
            if (next instanceof f) {
                final e name = ((ch2.g)next).getName();
                ng2.e.e((Object)name, "it.name");
                set.add(name);
            }
        }
        return set;
    }
    
    public Collection b(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return (Collection)EmptyList.INSTANCE;
    }
    
    public Collection c(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return (Collection)EmptyList.INSTANCE;
    }
    
    public Set<e> d() {
        final Collection<ch2.g> g = this.g(d.q, (l<? super e, Boolean>)FunctionsKt.a);
        final LinkedHashSet set = new LinkedHashSet();
        for (final f next : g) {
            if (next instanceof f) {
                final e name = ((ch2.g)next).getName();
                ng2.e.e((Object)name, "it.name");
                set.add(name);
            }
        }
        return set;
    }
    
    public ch2.e e(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return null;
    }
    
    public Set<e> f() {
        return null;
    }
    
    public Collection<ch2.g> g(final d d, final l<? super e, Boolean> l) {
        ng2.e.f((Object)d, "kindFilter");
        ng2.e.f((Object)l, "nameFilter");
        return (Collection<ch2.g>)EmptyList.INSTANCE;
    }
}
