// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import w50.h;
import v40.d;
import com.reddit.screen.BaseScreen;
import js1.a;
import gs1.y;
import javax.inject.Provider;
import ww0.c;
import g60.g1;
import iv0.b;
import af2.e;

public final class pc
{
    public e a;
    public e b;
    public b c;
    public sa1.b d;
    public g1 e;
    public c f;
    public Provider<y> g;
    public Provider<a> h;
    public Provider<q20.c> i;
    
    public pc(final a1 a1, final js1.b b, final BaseScreen baseScreen, final zg2.a a2) {
        this.a = af2.e.a((Object)b);
        final e a3 = af2.e.a((Object)baseScreen);
        this.b = a3;
        this.c = iv0.b.b((Provider)a3);
        this.d = sa1.b.a((Provider)this.b);
        final e a4 = af2.e.a((Object)a2);
        final g1 e = new g1((Provider)this.c, (Provider)this.d, (Provider)a1.w, (Provider)a1.E, (Provider)a1.c1, (Provider)a1.d1, (Provider)a4, 5);
        this.e = e;
        final c f = new c((Object)a1.p, 17);
        this.f = f;
        final Provider b2 = af2.c.b((Provider)new d((Provider)a1.y, (Provider)f, (Provider)e, (Provider)new vx.b((Provider)a4, (Provider)a1.h, 20), 8));
        this.g = (Provider<y>)b2;
        final a1$w9 y = a1.y;
        final c f2 = this.f;
        this.h = (Provider<a>)af2.c.b((Provider)new h((Provider)this.a, (Provider)this.e, (Provider)a1.m, b2, (Provider)new vx.d((Provider)y, (Provider)f2, (Provider)a1.r, 24), (Provider)a1.p, (Provider)a1.a1, (Provider)a1.l1, (Provider)f2, (Provider)a1.o1, 4));
        this.i = (Provider<q20.c>)af2.c.b((Provider)ei1.a.a((Provider)this.c));
    }
}
