// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import hh2.i0;
import di2.b;
import java.util.Iterator;
import java.util.AbstractCollection;
import mi2.d;
import rg2.l;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import java.util.Set;
import java.util.Collection;
import rg2.a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import sg2.h;
import si2.f;
import si2.e;
import pi2.j;
import zg2.k;
import mi2.g;

public abstract class DeserializedMemberScope extends g
{
    public static final /* synthetic */ k<Object>[] f;
    public final j b;
    public final a c;
    public final e d;
    public final f e;
    
    static {
        f = new k[] { (k)h.c((PropertyReference1)new PropertyReference1Impl((zg2.f)h.a((Class)DeserializedMemberScope.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), (k)h.c((PropertyReference1)new PropertyReference1Impl((zg2.f)h.a((Class)DeserializedMemberScope.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;")) };
    }
    
    public DeserializedMemberScope(final j b, final List<ProtoBuf$Function> list, final List<ProtoBuf$Property> list2, final List<ProtoBuf$TypeAlias> list3, final rg2.a<? extends Collection<di2.e>> a) {
        sg2.e.f((Object)b, "c");
        sg2.e.f((Object)a, "classNames");
        this.b = b;
        b.a.c.c();
        this.c = (a)new DeserializedMemberScope.DeserializedMemberScope$OptimizedImplementation(this, (List)list, (List)list2, (List)list3);
        this.d = (e)b.a.a.e((rg2.a)new DeserializedMemberScope$classNames.DeserializedMemberScope$classNames$2((rg2.a)a));
        this.e = (f)b.a.a.d((rg2.a)new DeserializedMemberScope$classifierNamesLazy.DeserializedMemberScope$classifierNamesLazy$2(this));
    }
    
    public final Set<di2.e> a() {
        return this.c.a();
    }
    
    public Collection b(final di2.e e, final NoLookupLocation noLookupLocation) {
        sg2.e.f((Object)e, "name");
        sg2.e.f((Object)noLookupLocation, "location");
        return this.c.b(e, noLookupLocation);
    }
    
    public Collection c(final di2.e e, final NoLookupLocation noLookupLocation) {
        sg2.e.f((Object)e, "name");
        sg2.e.f((Object)noLookupLocation, "location");
        return this.c.c(e, noLookupLocation);
    }
    
    public final Set<di2.e> d() {
        return this.c.d();
    }
    
    public hh2.e e(final di2.e e, final NoLookupLocation noLookupLocation) {
        sg2.e.f((Object)e, "name");
        sg2.e.f((Object)noLookupLocation, "location");
        Object o;
        if (this.q(e)) {
            o = this.b.a.b(this.l(e));
        }
        else if (this.c.f().contains(e)) {
            o = this.c.g(e);
        }
        else {
            o = null;
        }
        return (hh2.e)o;
    }
    
    public final Set<di2.e> f() {
        final f e = this.e;
        final k<Object> k = DeserializedMemberScope.f[1];
        sg2.e.f((Object)e, "<this>");
        sg2.e.f((Object)k, "p");
        return ((rg2.a<Set<di2.e>>)e).invoke();
    }
    
    public abstract void h(final ArrayList p0, final l p1);
    
    public final List i(final d d, final l l, final NoLookupLocation noLookupLocation) {
        sg2.e.f((Object)d, "kindFilter");
        sg2.e.f((Object)l, "nameFilter");
        sg2.e.f((Object)noLookupLocation, "location");
        final ArrayList list = new ArrayList(0);
        if (d.a(d.f)) {
            this.h(list, l);
        }
        this.c.e(list, d, l, noLookupLocation);
        if (d.a(d.l)) {
            for (final di2.e e : this.m()) {
                if (l.invoke(e)) {
                    bg.d.A((AbstractCollection)list, (Object)this.b.a.b(this.l(e)));
                }
            }
        }
        if (d.a(d.g)) {
            for (final di2.e e2 : this.c.f()) {
                if (l.invoke(e2)) {
                    bg.d.A((AbstractCollection)list, (Object)this.c.g(e2));
                }
            }
        }
        return bg.d.M(list);
    }
    
    public void j(final di2.e e, final ArrayList list) {
        sg2.e.f((Object)e, "name");
    }
    
    public void k(final di2.e e, final ArrayList list) {
        sg2.e.f((Object)e, "name");
    }
    
    public abstract b l(final di2.e p0);
    
    public final Set<di2.e> m() {
        return (Set)bg.d.j0(this.d, (k)DeserializedMemberScope.f[0]);
    }
    
    public abstract Set<di2.e> n();
    
    public abstract Set<di2.e> o();
    
    public abstract Set<di2.e> p();
    
    public boolean q(final di2.e e) {
        sg2.e.f((Object)e, "name");
        return this.m().contains(e);
    }
    
    public boolean r(final ri2.h h) {
        return true;
    }
    
    public interface a
    {
        Set<di2.e> a();
        
        Collection b(final di2.e p0, final NoLookupLocation p1);
        
        Collection c(final di2.e p0, final NoLookupLocation p1);
        
        Set<di2.e> d();
        
        void e(final ArrayList p0, final d p1, final l p2, final NoLookupLocation p3);
        
        Set<di2.e> f();
        
        i0 g(final di2.e p0);
    }
}
