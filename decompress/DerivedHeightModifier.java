// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import c2.e0;
import c2.t;
import c2.r;
import c2.u;
import bg.d;
import sg2.e;
import hg2.j;
import androidx.compose.ui.platform.n0;
import rg2.l;
import z0.l0;
import rg2.p;
import p0.i0;
import d2.b;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.o0;

public final class DerivedHeightModifier extends o0 implements a, b
{
    public final i0 g;
    public final p<i0, u2.b, Integer> h;
    public final l0 i;
    
    public DerivedHeightModifier(final i0 g, final l<? super n0, j> l, final p<? super i0, ? super u2.b, Integer> h) {
        e.f((Object)g, "insets");
        e.f((Object)l, "inspectorInfo");
        e.f((Object)h, "heightCalc");
        super(l);
        this.g = g;
        this.h = (p<i0, u2.b, Integer>)h;
        this.i = d.t0((Object)g);
    }
    
    public final void F0(final d2.d d) {
        e.f((Object)d, "scope");
        final i0 g = this.g;
        final i0 i0 = (i0)d.a(WindowInsetsPaddingKt.a);
        e.f((Object)g, "<this>");
        e.f((Object)i0, "insets");
        ((SnapshotMutableStateImpl)this.i).setValue((Object)new p0.l(g, i0));
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof DerivedHeightModifier)) {
            return false;
        }
        final i0 g = this.g;
        final DerivedHeightModifier derivedHeightModifier = (DerivedHeightModifier)o;
        if (!e.a((Object)g, (Object)derivedHeightModifier.g) || !e.a((Object)this.h, (Object)derivedHeightModifier.h)) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        return this.h.hashCode() + this.g.hashCode() * 31;
    }
    
    public final t v(final u u, final r r, final long n) {
        e.f((Object)u, "$this$measure");
        e.f((Object)r, "measurable");
        final int intValue = this.h.invoke((i0)((SnapshotMutableStateImpl)this.i).getValue(), (u2.b)u).intValue();
        if (intValue == 0) {
            return u.U(u, 0, 0, (l)DerivedHeightModifier$measure.DerivedHeightModifier$measure$1.INSTANCE);
        }
        final e0 h = r.H(u2.a.a(n, 0, 0, intValue, intValue, 3));
        return u.U(u, h.f, intValue, (l)new DerivedHeightModifier$measure.DerivedHeightModifier$measure$2(h));
    }
}
