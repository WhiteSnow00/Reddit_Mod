// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import ui2.d;
import kotlin.collections.EmptyList;
import java.util.List;
import vi2.h;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import vi2.e;
import ui2.i;

public abstract class c extends x
{
    public final i g;
    public final boolean h;
    public final e i;
    
    public c(final i g, final boolean h) {
        sg2.e.f((Object)g, "originalTypeVariable");
        this.g = g;
        this.h = h;
        this.i = vi2.h.b(ErrorScopeKind.STUB_TYPE_SCOPE, new String[] { g.toString() });
    }
    
    public final List<n0> G0() {
        return (List<n0>)EmptyList.INSTANCE;
    }
    
    public final j0 H0() {
        j0.g.getClass();
        return j0.h;
    }
    
    public final boolean J0() {
        return this.h;
    }
    
    public final t K0(final d d) {
        sg2.e.f((Object)d, "kotlinTypeRefiner");
        return (t)this;
    }
    
    public final v0 N0(final d d) {
        sg2.e.f((Object)d, "kotlinTypeRefiner");
        return (v0)this;
    }
    
    public final v0 O0(final j0 j0) {
        sg2.e.f((Object)j0, "newAttributes");
        return (v0)this;
    }
    
    public final x P0(final boolean b) {
        Object r0;
        if (b == this.h) {
            r0 = this;
        }
        else {
            r0 = this.R0(b);
        }
        return (x)r0;
    }
    
    public final x Q0(final j0 j0) {
        sg2.e.f((Object)j0, "newAttributes");
        return this;
    }
    
    public abstract d0 R0(final boolean p0);
    
    public MemberScope p() {
        return (MemberScope)this.i;
    }
}
