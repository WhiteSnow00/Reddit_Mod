// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import c2.i;
import c2.e0;
import zg2.l;
import androidx.compose.foundation.gestures.Orientation;
import c2.t;
import c2.r;
import androidx.compose.ui.node.LayoutNodeWrapper;
import c2.u;
import ah2.f;
import m0.q;
import androidx.compose.ui.layout.a;

public final class ScrollingLayoutModifier implements a
{
    public final ScrollState f;
    public final boolean g;
    public final boolean h;
    public final q i;
    
    public ScrollingLayoutModifier(final ScrollState f, final boolean g, final boolean h, final q i) {
        ah2.f.f((Object)f, "scrollerState");
        ah2.f.f((Object)i, "overscrollEffect");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final int c(final u u, final LayoutNodeWrapper layoutNodeWrapper, final int n) {
        ah2.f.f((Object)u, "<this>");
        ah2.f.f((Object)layoutNodeWrapper, "measurable");
        return ((i)layoutNodeWrapper).u(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScrollingLayoutModifier)) {
            return false;
        }
        final ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier)o;
        return ah2.f.a((Object)this.f, (Object)scrollingLayoutModifier.f) && this.g == scrollingLayoutModifier.g && this.h == scrollingLayoutModifier.h && ah2.f.a((Object)this.i, (Object)scrollingLayoutModifier.i);
    }
    
    public final int h(final u u, final LayoutNodeWrapper layoutNodeWrapper, final int n) {
        ah2.f.f((Object)u, "<this>");
        ah2.f.f((Object)layoutNodeWrapper, "measurable");
        return ((i)layoutNodeWrapper).C(n);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        final int g = this.g ? 1 : 0;
        int n = 1;
        int n2 = g;
        if (g != 0) {
            n2 = 1;
        }
        final int h = this.h ? 1 : 0;
        if (h == 0) {
            n = h;
        }
        return this.i.hashCode() + ((hashCode * 31 + n2) * 31 + n) * 31;
    }
    
    public final int k(final u u, final LayoutNodeWrapper layoutNodeWrapper, final int n) {
        ah2.f.f((Object)u, "<this>");
        ah2.f.f((Object)layoutNodeWrapper, "measurable");
        return ((i)layoutNodeWrapper).D(n);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ScrollingLayoutModifier(scrollerState=");
        k.append(this.f);
        k.append(", isReversed=");
        k.append(this.g);
        k.append(", isVertical=");
        k.append(this.h);
        k.append(", overscrollEffect=");
        k.append(this.i);
        k.append(')');
        return k.toString();
    }
    
    public final t u(final u u, final r r, final long n) {
        ah2.f.f((Object)u, "$this$measure");
        ah2.f.f((Object)r, "measurable");
        Orientation orientation;
        if (this.h) {
            orientation = Orientation.Vertical;
        }
        else {
            orientation = Orientation.Horizontal;
        }
        at1.a.V(n, orientation);
        final boolean h = this.h;
        int h2 = Integer.MAX_VALUE;
        int g;
        if (h) {
            g = Integer.MAX_VALUE;
        }
        else {
            g = u2.a.g(n);
        }
        if (this.h) {
            h2 = u2.a.h(n);
        }
        final e0 i = r.I(u2.a.a(n, 0, h2, 0, g, 5));
        final int f = i.f;
        final int h3 = u2.a.h(n);
        int n2;
        if ((n2 = f) > h3) {
            n2 = h3;
        }
        final int g2 = i.g;
        final int g3 = u2.a.g(n);
        int n3;
        if ((n3 = g2) > g3) {
            n3 = g3;
        }
        int n4 = i.g - n3;
        final int f2 = i.f;
        if (!this.h) {
            n4 = f2 - n2;
        }
        this.i.setEnabled(n4 != 0);
        return u.E0(u, n2, n3, (l)new ScrollingLayoutModifier$measure.ScrollingLayoutModifier$measure$1(this, n4, i));
    }
    
    public final int y(final u u, final LayoutNodeWrapper layoutNodeWrapper, final int n) {
        ah2.f.f((Object)u, "<this>");
        ah2.f.f((Object)layoutNodeWrapper, "measurable");
        return ((i)layoutNodeWrapper).F(n);
    }
}
