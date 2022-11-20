// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.collections.EmptyList;
import mg2.l;
import hi2.d;
import java.util.Iterator;
import ch2.a0;
import zd.b;
import java.util.List;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import mg2.a;
import kotlin.jvm.internal.PropertyReference1;
import ug2.f;
import kotlin.jvm.internal.PropertyReference1Impl;
import ng2.h;
import ni2.e;
import ch2.c;
import ug2.k;
import hi2.g;

public abstract class GivenFunctionsMemberScope extends g
{
    public static final k<Object>[] d;
    public final c b;
    public final e c;
    
    static {
        d = new k[] { (k)h.c((PropertyReference1)new PropertyReference1Impl((f)h.a((Class)GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;")) };
    }
    
    public GivenFunctionsMemberScope(final ni2.h h, final c b) {
        ng2.e.f((Object)h, "storageManager");
        ng2.e.f((Object)b, "containingClass");
        this.b = b;
        this.c = (e)h.h((a)new GivenFunctionsMemberScope$allDescriptors.GivenFunctionsMemberScope$allDescriptors$2(this));
    }
    
    @Override
    public final Collection b(final yh2.e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        final List list = (List)zd.b.f0(this.c, GivenFunctionsMemberScope.d[0]);
        final ui2.c c = new ui2.c();
        for (final Object next : list) {
            if (next instanceof a0 && ng2.e.a((Object)((ch2.g)next).getName(), (Object)e)) {
                c.add(next);
            }
        }
        return c;
    }
    
    @Override
    public final Collection c(final yh2.e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        final List list = (List)zd.b.f0(this.c, GivenFunctionsMemberScope.d[0]);
        final ui2.c c = new ui2.c();
        for (final Object next : list) {
            if (next instanceof kotlin.reflect.jvm.internal.impl.descriptors.f && ng2.e.a((Object)((ch2.g)next).getName(), (Object)e)) {
                c.add(next);
            }
        }
        return c;
    }
    
    @Override
    public final Collection<ch2.g> g(final d d, final l<? super yh2.e, Boolean> l) {
        ng2.e.f((Object)d, "kindFilter");
        ng2.e.f((Object)l, "nameFilter");
        if (!d.a(d.n.b)) {
            return (Collection<ch2.g>)EmptyList.INSTANCE;
        }
        return (List)zd.b.f0(this.c, GivenFunctionsMemberScope.d[0]);
    }
    
    public abstract List<kotlin.reflect.jvm.internal.impl.descriptors.d> h();
}
