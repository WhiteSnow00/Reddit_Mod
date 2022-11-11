// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import hg0.f;
import se2.h;
import mg0.x;
import nx0.g;
import ae0.s;
import i20.a;
import com.reddit.screen.BaseScreen;
import cf1.d;
import cf1.c;
import hi0.a0;
import javax.inject.Provider;
import se2.e;
import cf1.b;

public final class w5
{
    public final b a;
    public final z0 b;
    public e c;
    public e d;
    public Provider<t31.b> e;
    public e f;
    public e g;
    public Provider<a0> h;
    public ax.b i;
    public e j;
    public ix.b k;
    public Provider<c> l;
    
    public w5(final z0 b, final d d, final BaseScreen baseScreen, final b a, final i20.b b2, final a a2, final s s) {
        this.b = b;
        this.a = a;
        this.c = se2.e.a((Object)d);
        this.d = se2.e.a((Object)a);
        this.e = (Provider<t31.b>)se2.c.b((Provider)nx0.g.b((Provider)cz0.c.b((Provider)se2.e.a((Object)baseScreen)), (Provider)b.w));
        this.f = se2.e.b((Object)b2);
        this.g = se2.e.b((Object)a2);
        this.h = (Provider<a0>)se2.h.a((Provider)x.a((Provider)b.h));
        this.i = new ax.b((Provider)b.L, 27);
        this.j = se2.e.b((Object)s);
        this.k = new ix.b((Provider)b.L, (Provider)b.r, 28);
        this.l = (Provider<c>)se2.c.b((Provider)new cf1.e((Provider)this.c, (Provider)this.d, b.O2, (Provider)this.e, b.w, (Provider)this.f, (Provider)this.g, (Provider)this.h, b.m, (Provider)this.i, (Provider)this.j, (Provider)this.k, b.P0, b.O1, b.r, hg0.f.d((Provider)b.h)));
    }
}
