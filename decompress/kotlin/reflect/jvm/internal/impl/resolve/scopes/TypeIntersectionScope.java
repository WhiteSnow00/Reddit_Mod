// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.List;
import kotlin.Pair;
import java.util.ArrayList;
import ch2.g;
import hi2.d;
import mg2.l;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import yh2.e;
import hi2.a;

public final class TypeIntersectionScope extends a
{
    public final MemberScope b;
    
    public TypeIntersectionScope(final MemberScope b) {
        this.b = b;
    }
    
    @Override
    public final Collection b(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return OverridingUtilsKt.a(super.b(e, noLookupLocation), (l)TypeIntersectionScope$getContributedVariables$1.INSTANCE);
    }
    
    @Override
    public final Collection c(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return OverridingUtilsKt.a(super.c(e, noLookupLocation), (l)TypeIntersectionScope$getContributedFunctions$1.INSTANCE);
    }
    
    @Override
    public final Collection<g> g(final d d, final l<? super e, Boolean> l) {
        ng2.e.f((Object)d, "kindFilter");
        ng2.e.f((Object)l, "nameFilter");
        final Collection<g> g = super.g(d, l);
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (final Object next : g) {
            if (((g)next) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                list.add(next);
            }
            else {
                list2.add(next);
            }
        }
        final Pair pair = new Pair((Object)list, (Object)list2);
        final List list3 = (List)pair.component1();
        final List list4 = (List)pair.component2();
        ng2.e.d((Object)list3, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return CollectionsKt___CollectionsKt.o5((Iterable)list4, OverridingUtilsKt.a((Collection)list3, (l)TypeIntersectionScope$getContributedDescriptors.TypeIntersectionScope$getContributedDescriptors$2.INSTANCE));
    }
    
    @Override
    public final MemberScope i() {
        return this.b;
    }
}
