// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import ez.g;
import hg0.f;
import se2.h;
import zk0.i;
import cj1.a;
import com.reddit.screen.BaseScreen;
import cj1.c;
import cj1.b;
import z50.k1;
import zk0.d;
import javax.inject.Provider;
import se2.e;

public final class p8
{
    public e a;
    public e b;
    public Provider<d> c;
    public k1 d;
    public y30.d e;
    public Provider<b> f;
    
    public p8(final z0 z0, final c c, final BaseScreen baseScreen, final a a) {
        this.a = se2.e.a((Object)c);
        this.b = se2.e.a((Object)a);
        this.c = (Provider<d>)h.a((Provider)i.a((Provider)z0.m));
        this.d = k1.a((Provider)z0.m, (Provider)this.c, (Provider)z0.n, (Provider)hg0.f.c((Provider)z0.j), (Provider)z0.i, (Provider)z0.o, (Provider)z0.p, (Provider)z0.q);
        this.e = y30.d.a((Provider)cz0.c.b((Provider)se2.e.a((Object)baseScreen)), (Provider)z0.w, (Provider)z0.T);
        this.f = (Provider<b>)se2.c.b((Provider)new g((Provider)this.a, (Provider)this.b, (Provider)z0.k, (Provider)this.d, (Provider)this.e, (Provider)z0.l, (Provider)wb0.a.c((Provider)z0.y), (Provider)z0.r, (Provider)z0.s, (Provider)z0.t, 5));
    }
}
