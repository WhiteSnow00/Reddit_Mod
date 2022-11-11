// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import wi2.f;
import sg2.e;
import ui2.d;
import java.util.List;

public abstract class l extends x
{
    public final List<n0> G0() {
        return ((t)this.R0()).G0();
    }
    
    public j0 H0() {
        return ((t)this.R0()).H0();
    }
    
    public final k0 I0() {
        return ((t)this.R0()).I0();
    }
    
    public boolean J0() {
        return ((t)this.R0()).J0();
    }
    
    public abstract x R0();
    
    public x S0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        final t b1 = d.b1((f)this.R0());
        e.d((Object)b1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return this.T0((x)b1);
    }
    
    public abstract l T0(final x p0);
    
    public final MemberScope p() {
        return ((t)this.R0()).p();
    }
}
