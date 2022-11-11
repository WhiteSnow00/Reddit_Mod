// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation;

import c2.e0;
import androidx.compose.ui.unit.LayoutDirection;
import lw0.b;
import c2.t;
import c2.r;
import c2.u;
import sg2.e;
import z0.h0;
import l0.s;
import androidx.compose.animation.core.Transition$b;
import j1.a;
import k0.d;
import z0.e1;
import l0.g;
import u2.i;
import androidx.compose.animation.core.Transition$a;
import k0.l;

public final class ExpandShrinkModifier extends l
{
    public final Transition$a<i, g> f;
    public final Transition$a<u2.g, g> g;
    public final e1<d> h;
    public final e1<d> i;
    public final e1<a> j;
    public a k;
    public final rg2.l<Transition$b<EnterExitState>, s<i>> l;
    
    public ExpandShrinkModifier(final Transition$a f, final Transition$a g, final e1 h, final e1 i, final h0 j) {
        e.f((Object)f, "sizeAnimation");
        e.f((Object)g, "offsetAnimation");
        e.f((Object)h, "expand");
        e.f((Object)i, "shrink");
        this.f = (Transition$a<i, g>)f;
        this.g = (Transition$a<u2.g, g>)g;
        this.h = (e1<d>)h;
        this.i = (e1<d>)i;
        this.j = (e1<a>)j;
        this.l = (rg2.l<Transition$b<EnterExitState>, s<i>>)new ExpandShrinkModifier$sizeTransitionSpec$1(this);
    }
    
    public final t v(final u u, final r r, long n) {
        e.f((Object)u, "$this$measure");
        e.f((Object)r, "measurable");
        final e0 h = r.H(n);
        n = b.l(h.f, h.g);
        final long a = ((i)this.f.a((rg2.l)this.l, (rg2.l)new ExpandShrinkModifier$measure$currentSize$1(this, n)).getValue()).a;
        final long a2 = ((u2.g)this.g.a((rg2.l)ExpandShrinkModifier$measure$offsetDelta$1.INSTANCE, (rg2.l)new ExpandShrinkModifier$measure$offsetDelta$2(this, n)).getValue()).a;
        final a k = this.k;
        if (k != null) {
            n = k.a(n, a, LayoutDirection.Ltr);
        }
        else {
            n = u2.g.b;
        }
        return u.U(u, (int)(a >> 32), u2.i.b(a), (rg2.l)new ExpandShrinkModifier$measure$1(h, n, a2));
    }
}
