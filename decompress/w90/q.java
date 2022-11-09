// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import javax.inject.Provider;
import d00.c;
import qb0.b;
import af2.e;
import android.content.Context;
import ty.a;

public final class q
{
    public final a a;
    public final zg2.a<? extends Context> b;
    public final a1 c;
    public e d;
    public b e;
    public e f;
    public c g;
    public Provider<ty.b> h;
    
    public q(final a1 c, final zg2.a b, final zg2.a a, final ty.c c2, final a a2) {
        this.c = c;
        this.a = a2;
        this.b = (zg2.a<? extends Context>)b;
        this.d = af2.e.a((Object)c2);
        this.e = qb0.b.d((Provider)c.h);
        final e a3 = af2.e.a((Object)a);
        this.f = a3;
        this.g = new c((Provider)a3, (Provider)c.B, 28);
        this.h = (Provider<ty.b>)af2.c.b((Provider)new ty.e((Provider)this.d, (Provider)c.z, (Provider)c.A, (Provider)c.m, (Provider)this.e, (Provider)this.g, (Provider)vx.b.a((Provider)a3, (Provider)c.C), (Provider)c.D, (Provider)this.f, 0));
    }
}
