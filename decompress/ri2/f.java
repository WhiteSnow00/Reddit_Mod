// 
// Decompiled by Procyon v0.6.0
// 

package ri2;

import kotlin.collections.EmptySet;
import java.util.Set;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ig2.o;
import java.util.ArrayList;
import rg2.l;
import yd.b;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import pi2.j;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import java.util.List;
import bi2.f$a;
import di2.e;
import java.util.Collection;
import pi2.h;
import bi2.a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import di2.c;
import hh2.v;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

public final class f extends DeserializedMemberScope
{
    public final v g;
    public final String h;
    public final c i;
    
    public f(final v g, final ProtoBuf$Package protoBuf$Package, final bi2.c c, final bi2.a a, final d d, final h h, final String h2, final rg2.a<? extends Collection<e>> a2) {
        sg2.e.f((Object)g, "packageDescriptor");
        sg2.e.f((Object)c, "nameResolver");
        sg2.e.f((Object)a, "metadataVersion");
        sg2.e.f((Object)h2, "debugName");
        sg2.e.f((Object)a2, "classNames");
        final ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
        sg2.e.e((Object)typeTable, "proto.typeTable");
        final bi2.e e = new bi2.e(typeTable);
        final bi2.f b = bi2.f.b;
        final ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
        sg2.e.e((Object)versionRequirementTable, "proto.versionRequirementTable");
        final j a3 = h.a(g, c, e, f$a.a(versionRequirementTable), a, d);
        final List functionList = protoBuf$Package.getFunctionList();
        sg2.e.e((Object)functionList, "proto.functionList");
        final List propertyList = protoBuf$Package.getPropertyList();
        sg2.e.e((Object)propertyList, "proto.propertyList");
        final List typeAliasList = protoBuf$Package.getTypeAliasList();
        sg2.e.e((Object)typeAliasList, "proto.typeAliasList");
        super(a3, functionList, propertyList, typeAliasList, a2);
        this.g = g;
        this.h = h2;
        this.i = g.d();
    }
    
    @Override
    public final hh2.e e(final e e, final NoLookupLocation noLookupLocation) {
        sg2.e.f((Object)e, "name");
        sg2.e.f((Object)noLookupLocation, "location");
        yd.b.V(super.b.a.i, noLookupLocation, this.g, e);
        return super.e(e, noLookupLocation);
    }
    
    public final Collection g(final mi2.d d, final l l) {
        sg2.e.f((Object)d, "kindFilter");
        sg2.e.f((Object)l, "nameFilter");
        final List i = this.i(d, l, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        final Iterable k = super.b.a.k;
        final ArrayList list = new ArrayList();
        final Iterator iterator = k.iterator();
        while (iterator.hasNext()) {
            o.j3((Iterable)((jh2.b)iterator.next()).b(this.i), (Collection)list);
        }
        return CollectionsKt___CollectionsKt.W3((Iterable)list, (Collection)i);
    }
    
    @Override
    public final void h(final ArrayList list, final l l) {
        sg2.e.f((Object)l, "nameFilter");
    }
    
    @Override
    public final di2.b l(final e e) {
        sg2.e.f((Object)e, "name");
        return new di2.b(this.i, e);
    }
    
    @Override
    public final Set<e> n() {
        return (Set<e>)EmptySet.INSTANCE;
    }
    
    @Override
    public final Set<e> o() {
        return (Set<e>)EmptySet.INSTANCE;
    }
    
    @Override
    public final Set<e> p() {
        return (Set<e>)EmptySet.INSTANCE;
    }
    
    @Override
    public final boolean q(final e e) {
        sg2.e.f((Object)e, "name");
        final boolean q = super.q(e);
        boolean b = true;
        if (!q) {
            final Iterable k = super.b.a.k;
            boolean b2 = false;
            Label_0105: {
                if (!(k instanceof Collection) || !((Collection)k).isEmpty()) {
                    final Iterator iterator = k.iterator();
                    while (iterator.hasNext()) {
                        if (((jh2.b)iterator.next()).c(this.i, e)) {
                            b2 = true;
                            break Label_0105;
                        }
                    }
                }
                b2 = false;
            }
            b = (b2 && b);
        }
        return b;
    }
    
    public final String toString() {
        return this.h;
    }
}
