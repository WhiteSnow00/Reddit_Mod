// 
// Decompiled by Procyon v0.6.0
// 

package h9;

import k9.j;

@Deprecated
public abstract class h<Z> extends a<Z>
{
    public final int g;
    public final int h;
    
    public h() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    public h(final int g, final int h) {
        this.g = g;
        this.h = h;
    }
    
    public final void b(final i i) {
    }
    
    public final void f(final i i) {
        if (j.i(this.g, this.h)) {
            i.b(this.g, this.h);
            return;
        }
        final StringBuilder r = a.r("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        r.append(this.g);
        r.append(" and height: ");
        throw new IllegalArgumentException(al0.a.l(r, this.h, ", either provide dimensions in the constructor or call override()"));
    }
}
