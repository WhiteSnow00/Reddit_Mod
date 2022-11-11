// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import se2.e;
import ek0.d;
import im0.a;
import im0.b;
import im0.c;
import javax.inject.Provider;

public final class sl
{
    public Provider<c> a;
    public Provider<b> b;
    
    public sl(final dl dl, final qo qo, final a a) {
        this.a = (Provider<c>)se2.c.b((Provider)new d((Provider)dl.W, (Provider)qo.k, (Provider)dl.P0, (Provider)dl.d3, (Provider)qo.U0, (Provider)dl.M0, (Provider)dl.f0, (Provider)dl.S, 1));
        this.b = (Provider<b>)se2.c.b((Provider)new y30.d((Provider)this.a, (Provider)e.a((Object)a), (Provider)dl.P, 13));
    }
}
