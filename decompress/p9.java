// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import ca0.o0;
import w30.d;
import yd0.c$a;
import com.reddit.screen.BaseScreen;
import oi0.c;
import javax.inject.Provider;
import ei1.a;
import iv0.b;
import af2.e;

public final class p9
{
    public final a1 a;
    public e b;
    public e c;
    public e d;
    public b e;
    public a f;
    public v10.e g;
    public b h;
    public Provider<ls1.a> i;
    public Provider<c> j;
    public Provider<ak1.b> k;
    
    public p9(final a1 a, final ak1.c c, final BaseScreen baseScreen, final ak1.a a2) {
        this.a = a;
        this.b = af2.e.a((Object)c);
        this.c = af2.e.a((Object)a2);
        final e a3 = af2.e.a((Object)baseScreen);
        this.d = a3;
        this.e = iv0.b.b((Provider)a3);
        this.f = ei1.a.c((Provider)a.m);
        final mw.b b = mw.b.b();
        final a1.i9 c2 = a.c0;
        final a1$p9 m = a.m;
        final b e = this.e;
        final a1$y7 n = a.n;
        final a1.d7 i = a.i;
        final a1$w5 b2 = a.B2;
        final a1.e3 v = a.V;
        final yd0.c a4 = c$a.a;
        this.g = v10.e.a((Provider)c2, (Provider)m, (Provider)e, (Provider)n, (Provider)i, (Provider)b2, (Provider)v, (Provider)this.f, (Provider)b, (Provider)a.i0, (Provider)a.C2);
        final b e2 = this.e;
        this.h = new b((Provider)e2, 19);
        this.i = (Provider<ls1.a>)af2.c.b((Provider)w30.d.b((Provider)e2, (Provider)this.d, (Provider)a.w, (Provider)a.T, (Provider)a.U, (Provider)a.V));
        this.j = (Provider<c>)af2.c.b((Provider)vg0.a.a((Provider)a.h));
        this.k = (Provider<ak1.b>)af2.c.b((Provider)new c60.c((Provider)this.b, (Provider)this.c, (Provider)this.g, (Provider)this.h, (Provider)a.i, (Provider)a.D, (Provider)a.D2, (Provider)this.i, (Provider)this.j, (Provider)o0.d((Provider)a.h), (Provider)a4, (Provider)a.m, (Provider)a.C2, (Provider)a.B1, (Provider)a.r, 3));
    }
}
