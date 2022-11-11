// 
// Decompiled by Procyon v0.6.0
// 

package aa0;

import javax.inject.Inject;
import sg2.e;

public final class b implements a
{
    public final us0.a a;
    
    @Inject
    public b(final us0.a a) {
        e.f((Object)a, "appSettings");
        this.a = a;
    }
    
    public final void a() {
        if (this.a.u()) {
            final us0.a a = this.a;
            a.B3(Boolean.TRUE);
            a.F3(System.currentTimeMillis());
            a.v2(0L);
            a.d2();
        }
        else {
            if (this.a.m()) {
                return;
            }
            if (this.a.j1() == null) {
                final us0.a a2 = this.a;
                a2.B3(Boolean.FALSE);
                a2.F3(System.currentTimeMillis());
                a2.v2(0L);
            }
        }
        final us0.a a3 = this.a;
        a3.v2(a3.L2() + 1L);
    }
}
