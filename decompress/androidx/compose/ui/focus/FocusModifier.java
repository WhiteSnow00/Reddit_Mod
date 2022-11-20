// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.focus;

import e2.b0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import d2.h;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.platform.o0;
import ng2.e;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.node.NodeCoordinator;
import m1.m;
import m1.k;
import c2.b;
import d2.g;
import w1.a;
import m1.c;
import cg2.j;
import mg2.l;
import e2.c0;
import d2.f;
import d2.d;
import androidx.compose.ui.platform.p0;

public final class FocusModifier extends p0 implements d, f<FocusModifier>, c0, c2.c0
{
    public static final l<FocusModifier, j> v;
    public FocusModifier g;
    public final a1.d<FocusModifier> h;
    public FocusStateImpl i;
    public FocusModifier j;
    public c k;
    public a<b2.a> l;
    public g m;
    public b n;
    public k o;
    public final FocusPropertiesImpl p;
    public m q;
    public NodeCoordinator r;
    public boolean s;
    public x1.d t;
    public final a1.d<x1.d> u;
    
    static {
        v = (l)FocusModifier$Companion$RefreshFocusProperties.FocusModifier$Companion$RefreshFocusProperties$1.INSTANCE;
    }
    
    public FocusModifier() {
        throw null;
    }
    
    public FocusModifier(final FocusStateImpl i) {
        final l<o0, j> a = InspectableValueKt.a;
        e.f((Object)i, "initialFocus");
        e.f((Object)a, "inspectorInfo");
        super((l)a);
        this.h = (a1.d<FocusModifier>)new a1.d((Object[])new FocusModifier[16]);
        this.i = i;
        this.p = new FocusPropertiesImpl();
        this.u = (a1.d<x1.d>)new a1.d((Object[])new x1.d[16]);
    }
    
    public final void E0(final g m) {
        e.f((Object)m, "scope");
        this.m = m;
        final FocusModifier g = (FocusModifier)m.i(FocusModifierKt.a);
        if (!e.a((Object)g, (Object)this.g)) {
            if (g == null) {
                final int n = FocusModifier.FocusModifier$a.a[((Enum)this.i).ordinal()];
                if (n == 1 || n == 2) {
                    final NodeCoordinator r = this.r;
                    if (r != null) {
                        final LayoutNode l = r.l;
                        if (l != null) {
                            final b0 i = l.m;
                            if (i != null) {
                                final m1.d focusManager = i.getFocusManager();
                                if (focusManager != null) {
                                    focusManager.b(true);
                                }
                            }
                        }
                    }
                }
            }
            final FocusModifier g2 = this.g;
            if (g2 != null) {
                final a1.d<FocusModifier> h = g2.h;
                if (h != null) {
                    h.l((Object)this);
                }
            }
            if (g != null) {
                final a1.d<FocusModifier> h2 = g.h;
                if (h2 != null) {
                    h2.b((Object)this);
                }
            }
        }
        this.g = g;
        final c k = (c)m.i(FocusEventModifierKt.a);
        if (!e.a((Object)k, (Object)this.k)) {
            final c j = this.k;
            if (j != null) {
                j.i(this);
            }
            if (k != null) {
                k.a(this);
            }
        }
        this.k = k;
        final m q = (m)m.i(FocusRequesterModifierKt.a);
        if (!e.a((Object)q, (Object)this.q)) {
            final m q2 = this.q;
            if (q2 != null) {
                q2.i(this);
            }
            if (q != null) {
                q.a(this);
            }
        }
        this.q = q;
        this.l = (a<b2.a>)m.i((h)RotaryInputModifierKt.a);
        this.n = (b)m.i((h)BeyondBoundsLayoutKt.a);
        this.t = (x1.d)m.i((h)KeyInputModifierKt.a);
        this.o = (k)m.i(FocusPropertiesKt.a);
        FocusPropertiesKt.a(this);
    }
    
    public final void d(final FocusStateImpl i) {
        e.f((Object)i, "value");
        this.i = i;
        final c k = this.k;
        if (k != null) {
            k.e();
        }
    }
    
    public final h<FocusModifier> getKey() {
        return FocusModifierKt.a;
    }
    
    public final Object getValue() {
        return this;
    }
    
    public final boolean isValid() {
        return this.g != null;
    }
    
    public final void s(final NodeCoordinator r) {
        e.f((Object)r, "coordinates");
        final boolean b = this.r == null;
        this.r = r;
        if (b) {
            FocusPropertiesKt.a(this);
        }
        if (this.s) {
            this.s = false;
            FocusTransactionsKt.f(this);
        }
    }
}
