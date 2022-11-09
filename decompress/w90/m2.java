// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import gs1.i;
import vx.d;
import d00.f;
import g60.g1;
import com.reddit.screen.BaseScreen;
import gs1.a;
import javax.inject.Provider;
import iv0.b;
import ww0.c;
import af2.e;

public final class m2
{
    public final a1 a;
    public e b;
    public c c;
    public e d;
    public b e;
    public sa1.b f;
    public Provider<a> g;
    public Provider<q20.c> h;
    
    public m2(final a1 a, final gs1.b b, final BaseScreen baseScreen, final zg2.a a2) {
        this.a = a;
        this.b = af2.e.a((Object)b);
        this.c = new c((Object)a.p, 17);
        final e a3 = af2.e.a((Object)baseScreen);
        this.d = a3;
        this.e = iv0.b.b((Provider)a3);
        this.f = sa1.b.a((Provider)this.d);
        final e a4 = af2.e.a((Object)a2);
        final g1 g1 = new g1((Provider)this.e, (Provider)this.f, (Provider)a.w, (Provider)a.E, (Provider)a.c1, (Provider)a.d1, (Provider)a4, 5);
        final a1.j2 h = a.h;
        final vx.b b2 = new vx.b((Provider)a4, (Provider)h, 20);
        final a1$w9 y = a.y;
        final a1$p9 m = a.m;
        final f f = new f((Provider)y, (Provider)m, 29);
        final c c = this.c;
        final a1$s r = a.r;
        final d d = new d((Provider)y, (Provider)c, (Provider)r, 24);
        final d00.c c2 = new d00.c((Provider)h, (Provider)a.m1, 24);
        final a1.d2 n1 = a.n1;
        final a1.f6 k = a.K;
        this.g = (Provider<a>)af2.c.b((Provider)new i((Provider)this.b, (Provider)c, a.a1, y, a.b1, a.c, a.p, (Provider)g1, a.e1, a.i, (Provider)b2, r, m, a.w0, a.i0, k, a.f1, a.g1, a.L, a.h1, a.J, a.i1, (Provider)f, a.j1, (Provider)d, a.T0, a.k1, a.l1, c2, new v40.d((Provider)n1, (Provider)c, (Provider)r, (Provider)k, 9), a.o1));
        this.h = (Provider<q20.c>)af2.c.b((Provider)ei1.a.a((Provider)this.e));
    }
}
