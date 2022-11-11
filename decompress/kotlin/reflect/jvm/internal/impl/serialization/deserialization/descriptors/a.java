// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import hg2.j;
import rg2.l;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.a$a;
import hh2.n;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import java.util.ArrayList;
import java.util.List;
import fi2.g;

public final class a extends g
{
    public final /* synthetic */ List<Object> f;
    
    public a(final ArrayList f) {
        this.f = f;
    }
    
    public final void c1(final CallableMemberDescriptor callableMemberDescriptor, final CallableMemberDescriptor callableMemberDescriptor2) {
        e.f((Object)callableMemberDescriptor, "fromSuper");
        e.f((Object)callableMemberDescriptor2, "fromCurrent");
        if (callableMemberDescriptor2 instanceof b) {
            ((b)callableMemberDescriptor2).L0((a$a)n.a, (Object)callableMemberDescriptor);
        }
    }
    
    public final void m(final CallableMemberDescriptor callableMemberDescriptor) {
        e.f((Object)callableMemberDescriptor, "fakeOverride");
        OverridingUtil.r(callableMemberDescriptor, null);
        this.f.add(callableMemberDescriptor);
    }
}
