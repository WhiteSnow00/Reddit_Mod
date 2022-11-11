// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import c2.e0;
import ej2.c0;
import c2.t;
import c2.r;
import c2.u;
import bg.d;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import sg2.e;
import androidx.compose.ui.platform.InspectableValueKt;
import z0.l0;
import p0.i0;
import d2.c;
import d2.b;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.o0;

public final class InsetsPaddingModifier extends o0 implements a, b, c<i0>
{
    public final i0 g;
    public final l0 h;
    public final l0 i;
    
    public InsetsPaddingModifier() {
        throw null;
    }
    
    public InsetsPaddingModifier(final p0.c g) {
        final l a = InspectableValueKt.a;
        e.f((Object)g, "insets");
        e.f((Object)a, "inspectorInfo");
        super(a);
        this.g = (i0)g;
        this.h = d.t0((Object)g);
        this.i = d.t0((Object)g);
    }
    
    public final void F0(final d2.d d) {
        e.f((Object)d, "scope");
        final i0 i0 = (i0)d.a(WindowInsetsPaddingKt.a);
        final i0 g = this.g;
        e.f((Object)g, "<this>");
        e.f((Object)i0, "insets");
        ((SnapshotMutableStateImpl)this.h).setValue((Object)new p0.l(g, i0));
        ((SnapshotMutableStateImpl)this.i).setValue((Object)d.O0(i0, this.g));
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof InsetsPaddingModifier && e.a((Object)((InsetsPaddingModifier)o).g, (Object)this.g));
    }
    
    public final d2.e<i0> getKey() {
        return WindowInsetsPaddingKt.a;
    }
    
    public final Object getValue() {
        return ((SnapshotMutableStateImpl)this.i).getValue();
    }
    
    public final int hashCode() {
        return this.g.hashCode();
    }
    
    public final t v(final u u, final r r, final long n) {
        e.f((Object)u, "$this$measure");
        e.f((Object)r, "measurable");
        final int a = ((i0)((SnapshotMutableStateImpl)this.h).getValue()).a((u2.b)u, ((c2.j)u).getLayoutDirection());
        final int d = ((i0)((SnapshotMutableStateImpl)this.h).getValue()).d((u2.b)u);
        final int c = ((i0)((SnapshotMutableStateImpl)this.h).getValue()).c((u2.b)u, ((c2.j)u).getLayoutDirection());
        final int b = ((i0)((SnapshotMutableStateImpl)this.h).getValue()).b((u2.b)u);
        final int n2 = c + a;
        final int n3 = b + d;
        final e0 h = r.H(c0.K3(-n2, -n3, n));
        return u.U(u, c0.S2(h.f + n2, n), c0.Q2(h.g + n3, n), (l)new InsetsPaddingModifier$measure.InsetsPaddingModifier$measure$1(h, a, d));
    }
}
