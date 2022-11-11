// 
// Decompiled by Procyon v0.6.0
// 

package ui2;

import vi2.h;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import ti2.t;
import ti2.k0;
import kotlin.collections.EmptyList;
import ti2.n0;
import java.util.List;
import sg2.e;
import ti2.j0;
import ti2.v0;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import wi2.b;
import ti2.x;

public final class f extends x implements b
{
    public final CaptureStatus g;
    public final NewCapturedTypeConstructor h;
    public final v0 i;
    public final j0 j;
    public final boolean k;
    public final boolean l;
    
    public f(final CaptureStatus captureStatus, final NewCapturedTypeConstructor newCapturedTypeConstructor, final v0 v0, j0 h, boolean b, final int n) {
        if ((n & 0x8) != 0x0) {
            j0.g.getClass();
            h = j0.h;
        }
        if ((n & 0x10) != 0x0) {
            b = false;
        }
        this(captureStatus, newCapturedTypeConstructor, v0, h, b, false);
    }
    
    public f(final CaptureStatus g, final NewCapturedTypeConstructor h, final v0 i, final j0 j, final boolean k, final boolean l) {
        e.f((Object)g, "captureStatus");
        e.f((Object)h, "constructor");
        e.f((Object)j, "attributes");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final List<n0> G0() {
        return (List<n0>)EmptyList.INSTANCE;
    }
    
    public final j0 H0() {
        return this.j;
    }
    
    public final k0 I0() {
        return (k0)this.h;
    }
    
    public final boolean J0() {
        return this.k;
    }
    
    public final v0 M0(final boolean b) {
        return (v0)new f(this.g, this.h, this.i, this.j, b, 32);
    }
    
    public final x P0(final boolean b) {
        return new f(this.g, this.h, this.i, this.j, b, 32);
    }
    
    public final x Q0(final j0 j0) {
        e.f((Object)j0, "newAttributes");
        return new f(this.g, this.h, this.i, j0, this.k, this.l);
    }
    
    public final f R0(final d d) {
        e.f((Object)d, "kotlinTypeRefiner");
        final CaptureStatus g = this.g;
        final NewCapturedTypeConstructor h = this.h.h(d);
        final v0 i = this.i;
        v0 l0;
        if (i != null) {
            l0 = d.b1((wi2.f)i).L0();
        }
        else {
            l0 = null;
        }
        return new f(g, h, l0, this.j, this.k, 32);
    }
    
    public final MemberScope p() {
        return (MemberScope)vi2.h.a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }
}
