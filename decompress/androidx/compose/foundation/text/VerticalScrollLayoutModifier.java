// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import c2.e0;
import zg2.l;
import c2.t;
import c2.u;
import ak0.n;
import androidx.appcompat.widget.s0;
import ah2.f;
import v0.r;
import o2.x;
import androidx.compose.ui.layout.a;

public final class VerticalScrollLayoutModifier implements a
{
    public final TextFieldScrollerPosition f;
    public final int g;
    public final x h;
    public final zg2.a<r> i;
    
    public VerticalScrollLayoutModifier(final TextFieldScrollerPosition f, final int g, final x h, final zg2.a<r> i) {
        ah2.f.f((Object)h, "transformedText");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        final VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier)o;
        return ah2.f.a((Object)this.f, (Object)verticalScrollLayoutModifier.f) && this.g == verticalScrollLayoutModifier.g && ah2.f.a((Object)this.h, (Object)verticalScrollLayoutModifier.h) && ah2.f.a((Object)this.i, (Object)verticalScrollLayoutModifier.i);
    }
    
    @Override
    public final int hashCode() {
        return this.i.hashCode() + (this.h.hashCode() + s0.e(this.g, this.f.hashCode() * 31, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("VerticalScrollLayoutModifier(scrollerPosition=");
        k.append(this.f);
        k.append(", cursorOffset=");
        k.append(this.g);
        k.append(", transformedText=");
        k.append(this.h);
        k.append(", textLayoutResultProvider=");
        return n.s(k, (zg2.a)this.i, ')');
    }
    
    public final t u(final u u, final c2.r r, final long n) {
        ah2.f.f((Object)u, "$this$measure");
        ah2.f.f((Object)r, "measurable");
        final e0 i = r.I(u2.a.a(n, 0, 0, 0, Integer.MAX_VALUE, 7));
        final int min = Math.min(i.g, u2.a.g(n));
        return u.E0(u, i.f, min, (l)new VerticalScrollLayoutModifier$measure.VerticalScrollLayoutModifier$measure$1(u, this, i, min));
    }
}
