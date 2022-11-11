// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation;

import c2.e0;
import lw0.b;
import c2.t;
import c2.r;
import c2.u;
import sg2.e;
import l0.s;
import androidx.compose.animation.core.Transition$b;
import k0.q;
import z0.e1;
import u2.g;
import androidx.compose.animation.core.Transition$a;
import k0.l;

public final class SlideModifier extends l
{
    public final Transition$a<g, l0.g> f;
    public final e1<q> g;
    public final e1<q> h;
    public final rg2.l<Transition$b<EnterExitState>, s<g>> i;
    
    public SlideModifier(final Transition$a<g, l0.g> f, final e1<q> g, final e1<q> h) {
        e.f((Object)f, "lazyAnimation");
        e.f((Object)g, "slideIn");
        e.f((Object)h, "slideOut");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (rg2.l<Transition$b<EnterExitState>, s<g>>)new SlideModifier$transitionSpec$1(this);
    }
    
    public final t v(final u u, final r r, long l) {
        e.f((Object)u, "$this$measure");
        e.f((Object)r, "measurable");
        final e0 h = r.H(l);
        l = b.l(h.f, h.g);
        return u.U(u, h.f, h.g, (rg2.l)new SlideModifier$measure$1(this, h, l));
    }
}
