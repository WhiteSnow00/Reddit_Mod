// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Collections;
import java.util.List;

public final class d3 extends z5 implements a7
{
    public d3() {
        super(e3.w());
    }
    
    public final long m() {
        return ((e3)super.g).t();
    }
    
    public final long n() {
        return ((e3)super.g).u();
    }
    
    public final void o(final h3 h3) {
        if (super.h) {
            this.l();
            super.h = false;
        }
        e3.B((e3)super.g, h3.j());
    }
    
    public final void p(final int n) {
        if (super.h) {
            this.l();
            super.h = false;
        }
        e3.E((e3)super.g, n);
    }
    
    public final void q(final String s) {
        if (super.h) {
            this.l();
            super.h = false;
        }
        e3.F((e3)super.g, s);
    }
    
    public final void r(final int n, final i3 i3) {
        if (super.h) {
            this.l();
            super.h = false;
        }
        e3.A((e3)super.g, n, i3);
    }
    
    public final i3 s(final int n) {
        return ((e3)super.g).x(n);
    }
    
    public final String t() {
        return ((e3)super.g).y();
    }
    
    public final List u() {
        return Collections.unmodifiableList((List<?>)((e3)super.g).z());
    }
}
