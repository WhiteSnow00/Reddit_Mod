// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import yi2.a;
import vi2.i;
import sg2.e;
import ui2.d;
import rg2.l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import java.util.List;

public final class y extends x
{
    public final k0 g;
    public final List<n0> h;
    public final boolean i;
    public final MemberScope j;
    public final l<d, x> k;
    
    public y(final k0 g, final List<? extends n0> h, final boolean i, final MemberScope j, final l<? super d, ? extends x> k) {
        e.f((Object)g, "constructor");
        e.f((Object)h, "arguments");
        e.f((Object)j, "memberScope");
        e.f((Object)k, "refinedTypeFactory");
        this.g = g;
        this.h = (List<n0>)h;
        this.i = i;
        this.j = j;
        this.k = (l<d, x>)k;
        if (j instanceof vi2.e && !(j instanceof i)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SimpleTypeImpl should not be created for error type: ");
            sb.append(j);
            sb.append('\n');
            sb.append(g);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public final List<n0> G0() {
        return this.h;
    }
    
    public final j0 H0() {
        j0.g.getClass();
        return j0.h;
    }
    
    public final k0 I0() {
        return this.g;
    }
    
    public final boolean J0() {
        return this.i;
    }
    
    public final t K0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        x x;
        if ((x = this.k.invoke(d)) == null) {
            x = this;
        }
        return (t)x;
    }
    
    public final v0 N0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        x x;
        if ((x = this.k.invoke(d)) == null) {
            x = this;
        }
        return (v0)x;
    }
    
    public final x P0(final boolean b) {
        Object o;
        if (b == this.i) {
            o = this;
        }
        else if (b) {
            o = new v((x)this);
        }
        else {
            o = new u((x)this);
        }
        return (x)o;
    }
    
    public final x Q0(final j0 j0) {
        e.f((Object)j0, "newAttributes");
        Object o;
        if (((a)j0).isEmpty()) {
            o = this;
        }
        else {
            o = new z((x)this, j0);
        }
        return (x)o;
    }
    
    public final MemberScope p() {
        return this.j;
    }
}
