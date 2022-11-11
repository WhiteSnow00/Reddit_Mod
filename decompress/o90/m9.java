// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import nj1.d;
import pd0.c$a;
import com.reddit.screen.BaseScreen;
import javax.inject.Provider;
import vh1.a;
import uv0.b;
import cz0.c;
import se2.e;

public final class m9
{
    public final z0 a;
    public e b;
    public e c;
    public e d;
    public c e;
    public b f;
    public r10.e g;
    public a h;
    public Provider<as1.a> i;
    public Provider<ei0.c> j;
    public Provider<nj1.b> k;
    
    public m9(final z0 a, final nj1.c c, final BaseScreen baseScreen, final nj1.a a2) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = se2.e.a((Object)a2);
        final e a3 = se2.e.a((Object)baseScreen);
        this.d = a3;
        this.e = cz0.c.b((Provider)a3);
        this.f = uv0.b.d((Provider)a.m);
        final nx.a a4 = nx.a.a();
        final z0.z0$l9 c2 = a.c0;
        final z0.z0$s9 m = a.m;
        final c e = this.e;
        final z0.z0$b8 n = a.n;
        final z0.z0$g7 i = a.i;
        final z0.x5 d2 = a.D2;
        final z0.z0$e3 v = a.V;
        final pd0.c a5 = c$a.a;
        this.g = r10.e.b((Provider)c2, (Provider)m, (Provider)e, (Provider)n, (Provider)i, (Provider)d2, (Provider)v, (Provider)this.f, (Provider)a4, (Provider)a.i0, (Provider)a.E2);
        final c e2 = this.e;
        this.h = new a((Object)e2, 4);
        this.i = (Provider<as1.a>)se2.c.b((Provider)oy.e.b((Provider)e2, (Provider)this.d, (Provider)a.w, (Provider)a.T, (Provider)a.U, (Provider)a.V));
        this.j = (Provider<ei0.c>)se2.c.b((Provider)wb0.a.a((Provider)a.h));
        this.k = (Provider<nj1.b>)se2.c.b((Provider)new d((Provider)this.b, (Provider)this.c, (Provider)this.g, (Provider)this.h, (Provider)a.i, (Provider)a.D, (Provider)a.F2, (Provider)this.i, (Provider)this.j, (Provider)id0.b.e((Provider)a.h), (se2.d)a5, (Provider)a.m, (Provider)a.E2, (Provider)a.E1, a.r, 0));
    }
}
