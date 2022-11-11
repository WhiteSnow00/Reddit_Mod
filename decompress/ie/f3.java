// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.Collections;
import java.util.List;

public final class f3 extends b6 implements c7
{
    public f3() {
        super((e6)g3.w());
    }
    
    public final long m() {
        return ((g3)super.g).t();
    }
    
    public final long n() {
        return ((g3)super.g).u();
    }
    
    public final void o(final j3 j3) {
        if (super.h) {
            this.l();
            super.h = false;
        }
        g3.B((g3)super.g, (k3)j3.j());
    }
    
    public final void p(final int n) {
        if (super.h) {
            this.l();
            super.h = false;
        }
        g3.E((g3)super.g, n);
    }
    
    public final void q(final String s) {
        if (super.h) {
            this.l();
            super.h = false;
        }
        g3.F((g3)super.g, s);
    }
    
    public final void r(final int n, final k3 k3) {
        if (super.h) {
            this.l();
            super.h = false;
        }
        g3.A((g3)super.g, n, k3);
    }
    
    public final k3 s(final int n) {
        return ((g3)super.g).x(n);
    }
    
    public final String t() {
        return ((g3)super.g).y();
    }
    
    public final List u() {
        return Collections.unmodifiableList((List<?>)((g3)super.g).z());
    }
}
