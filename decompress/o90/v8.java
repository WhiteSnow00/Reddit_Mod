// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import hg0.f;
import se2.h;
import zk0.i;
import com.reddit.screen.BaseScreen;
import ej1.c;
import ej1.b;
import z50.k1;
import zk0.d;
import javax.inject.Provider;
import se2.e;
import ej1.a;

public final class v8
{
    public final a a;
    public final z0 b;
    public e c;
    public e d;
    public Provider<d> e;
    public k1 f;
    public e g;
    public y30.d h;
    public Provider<b> i;
    
    public v8(final z0 b, final c c, final a a, final BaseScreen baseScreen) {
        this.b = b;
        this.a = a;
        this.c = se2.e.a((Object)c);
        this.d = se2.e.a((Object)a);
        this.e = (Provider<d>)se2.h.a((Provider)zk0.i.a((Provider)b.m));
        this.f = k1.a((Provider)b.m, (Provider)this.e, (Provider)b.n, (Provider)hg0.f.c((Provider)b.j), (Provider)b.i, (Provider)b.o, (Provider)b.p, (Provider)b.q);
        final e a2 = se2.e.a((Object)baseScreen);
        this.g = a2;
        this.h = y30.d.a((Provider)cz0.c.b((Provider)a2), (Provider)b.w, (Provider)b.T);
        this.i = (Provider<b>)se2.c.b((Provider)new ox.f((Provider)this.c, (Provider)this.d, (Provider)this.f, (Provider)b.k, (Provider)b.l, (Provider)this.h, (Provider)oa1.b.b((Provider)this.g), 7));
    }
}
