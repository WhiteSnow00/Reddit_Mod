// 
// Decompiled by Procyon v0.6.0
// 

package hi2;

import mg2.l;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import java.util.ArrayList;
import ai2.g;

public final class e extends g
{
    public final ArrayList<ch2.g> b;
    public final GivenFunctionsMemberScope c;
    
    public e(final ArrayList<ch2.g> b, final GivenFunctionsMemberScope c) {
        this.b = b;
        this.c = c;
    }
    
    public final void n(final CallableMemberDescriptor callableMemberDescriptor) {
        ng2.e.f((Object)callableMemberDescriptor, "fakeOverride");
        OverridingUtil.r(callableMemberDescriptor, (l)null);
        this.b.add((ch2.g)callableMemberDescriptor);
    }
    
    public final void r0(final CallableMemberDescriptor callableMemberDescriptor, final CallableMemberDescriptor callableMemberDescriptor2) {
        ng2.e.f((Object)callableMemberDescriptor, "fromSuper");
        ng2.e.f((Object)callableMemberDescriptor2, "fromCurrent");
        final StringBuilder t = a.t("Conflict in scope of ");
        t.append(this.c.b);
        t.append(": ");
        t.append(callableMemberDescriptor);
        t.append(" vs ");
        t.append(callableMemberDescriptor2);
        throw new IllegalStateException(t.toString().toString());
    }
}
