// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import lm0.w;
import com.reddit.screen.BaseScreen;
import yd1.c;
import javax.inject.Provider;
import ms1.a;
import uz.i;
import iv0.b;
import af2.e;

public final class o3
{
    public final a1 a;
    public e b;
    public e c;
    public e d;
    public b e;
    public i f;
    public b g;
    public zy.e h;
    public a i;
    public u60.e j;
    public Provider<yd1.b> k;
    
    public o3(final a1 a, final c c, final yd1.a a2, final BaseScreen baseScreen, final zg2.a a3) {
        this.a = a;
        this.b = af2.e.a((Object)c);
        this.c = af2.e.a((Object)a2);
        final e a4 = af2.e.a((Object)baseScreen);
        this.d = a4;
        final b b = iv0.b.b((Provider)a4);
        this.e = b;
        this.f = new i((Provider)b, (Provider)a.w, 28);
        this.g = iv0.b.a((Provider)sa1.b.a((Provider)this.d));
        this.h = zy.e.b((Provider)this.e, (Provider)a.w, (Provider)a.T);
        final a1$p9 m = a.m;
        final a1$s1 d1 = a.D1;
        this.i = new a((Provider)m, (Provider)d1, 2);
        this.j = u60.e.b((Provider)a.F1, (Provider)a.o0, (Provider)a.G1, (Provider)a.k, (Provider)a.C1, (Provider)a.j0, (Provider)a.i, (Provider)a.H1, (Provider)d1, (Provider)a.r);
        this.k = (Provider<yd1.b>)af2.c.b((Provider)new w((Provider)this.b, (Provider)this.c, (Provider)a.m, (Provider)this.f, (Provider)this.g, (Provider)a.C1, (Provider)a.l, (Provider)a.o, (Provider)this.h, (Provider)a.q, (Provider)this.i, (Provider)a.E1, (Provider)a.y, (Provider)a.i, (Provider)this.j, (Provider)af2.e.a((Object)a3), (Provider)a.K, (Provider)a.r, 1));
    }
}
