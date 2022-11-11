// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import bz.r;
import se2.c;
import u30.g;
import qm0.i;
import qm0.k;
import qm0.j;
import javax.inject.Provider;
import se2.e;

public final class vr
{
    public e a;
    public e b;
    public Provider<hm0.e> c;
    public Provider<j> d;
    
    public vr(final dl dl, final qo qo, final k k, final i i) {
        this.a = e.a((Object)i);
        this.b = e.a((Object)k);
        final Provider b = se2.c.b((Provider)new g((Provider)qo.k, (Provider)dl.Z, (Provider)dl.l, (Provider)dl.f0, (Provider)qo.U0, 6));
        this.c = (Provider<hm0.e>)b;
        this.d = (Provider<j>)se2.c.b((Provider)new r(qo.u, (Provider)this.a, (Provider)this.b, (Provider)dl.P0, (Provider)dl.S, (Provider)qo.U0, b, (Provider)qo.a0, 2));
    }
}
