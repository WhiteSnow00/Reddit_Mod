// 
// Decompiled by Procyon v0.6.0
// 

package vi2;

import ti2.v0;
import ti2.t;
import ui2.d;
import ti2.j0;
import java.util.Arrays;
import sg2.e;
import ti2.n0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import ti2.k0;
import ti2.x;

public final class f extends x
{
    public final k0 g;
    public final MemberScope h;
    public final ErrorTypeKind i;
    public final List<n0> j;
    public final boolean k;
    public final String[] l;
    public final String m;
    
    public f(final k0 g, final MemberScope h, final ErrorTypeKind i, final List<? extends n0> j, final boolean k, final String... l) {
        e.f((Object)g, "constructor");
        e.f((Object)h, "memberScope");
        e.f((Object)i, "kind");
        e.f((Object)j, "arguments");
        e.f((Object)l, "formatParams");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = (List<n0>)j;
        this.k = k;
        this.l = l;
        final String debugMessage = i.getDebugMessage();
        final String[] copy = Arrays.copyOf(l, l.length);
        this.m = a81.e.p((Object[])copy, copy.length, debugMessage, "format(format, *args)");
    }
    
    public final List<n0> G0() {
        return this.j;
    }
    
    public final j0 H0() {
        j0.g.getClass();
        return j0.h;
    }
    
    public final k0 I0() {
        return this.g;
    }
    
    public final boolean J0() {
        return this.k;
    }
    
    public final t K0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        return (t)this;
    }
    
    public final v0 N0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        return (v0)this;
    }
    
    public final v0 O0(final j0 j0) {
        e.f((Object)j0, "newAttributes");
        return (v0)this;
    }
    
    public final x P0(final boolean b) {
        final k0 g = this.g;
        final MemberScope h = this.h;
        final ErrorTypeKind i = this.i;
        final List<n0> j = this.j;
        final String[] l = this.l;
        return new f(g, h, i, j, b, (String[])Arrays.copyOf(l, l.length));
    }
    
    public final x Q0(final j0 j0) {
        e.f((Object)j0, "newAttributes");
        return this;
    }
    
    public final MemberScope p() {
        return this.h;
    }
}
