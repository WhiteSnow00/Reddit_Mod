// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import hg0.f;
import se2.h;
import zk0.i;
import com.reddit.screen.BaseScreen;
import a81.c;
import a81.b;
import z50.k1;
import zk0.d;
import javax.inject.Provider;
import se2.e;
import a81.a;

public final class r8
{
    public final a a;
    public final z0 b;
    public e c;
    public e d;
    public wb0.a e;
    public Provider<d> f;
    public k1 g;
    public Provider<b> h;
    
    public r8(final z0 b, final c c, final BaseScreen baseScreen, final a a) {
        this.b = b;
        this.a = a;
        this.c = se2.e.a((Object)c);
        this.d = se2.e.a((Object)a);
        this.e = wb0.a.c((Provider)b.y);
        this.f = (Provider<d>)se2.h.a((Provider)i.a((Provider)b.m));
        this.g = k1.a((Provider)b.m, (Provider)this.f, (Provider)b.n, (Provider)hg0.f.c((Provider)b.j), (Provider)b.i, (Provider)b.o, (Provider)b.p, (Provider)b.q);
        this.h = (Provider<b>)se2.c.b((Provider)new pi.d((Provider)this.c, (Provider)this.d, (Provider)b.k, (Provider)this.e, (Provider)this.g, (Provider)y30.d.a((Provider)cz0.c.b((Provider)se2.e.a((Object)baseScreen)), (Provider)b.w, (Provider)b.T), (Provider)b.l, 7));
    }
}
