// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import uw.f;
import ms0.a;
import ms0.b;
import javax.inject.Provider;
import nx0.g;
import hx.c;
import se2.e;

public final class w
{
    public final z0 a;
    public e b;
    public e c;
    public e d;
    public c e;
    public e f;
    public g g;
    public Provider<b> h;
    
    public w(final z0 a, final ms0.c c, final hx.e e, final a a2, final rg2.a a3) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = se2.e.a((Object)a2);
        final e a4 = se2.e.a((Object)e);
        this.d = a4;
        this.e = new c((Provider)a4, (Provider)a.I, (Provider)a.c, (Provider)a.J, (Provider)a.K, 0);
        final e a5 = se2.e.a((Object)a3);
        this.f = a5;
        this.g = new g((Provider)a5, (Provider)a.B, 2);
        this.h = (Provider<b>)se2.c.b((Provider)new q50.g((Provider)this.b, (Provider)this.c, (Provider)a.c, (Provider)this.e, (Provider)a.A, (Provider)a.z, (Provider)this.d, (Provider)a.F, (Provider)this.g, (Provider)uw.f.a((Provider)a5, (Provider)a.C), (Provider)this.f, 3));
    }
}
