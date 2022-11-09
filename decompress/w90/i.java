// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.c;
import af2.h;
import hl0.l;
import com.reddit.screen.BaseScreen;
import a41.b;
import a40.g;
import jl0.d;
import javax.inject.Provider;
import vg0.a;
import af2.e;

public final class i
{
    public final a1 a;
    public e b;
    public e c;
    public e d;
    public a e;
    public Provider<d> f;
    public g g;
    public Provider<b> h;
    public Provider<hf1.a> i;
    
    public i(final a1 a, final hf1.b b, final hf1.e e, final BaseScreen baseScreen, final l l) {
        this.a = a;
        this.b = af2.e.a((Object)b);
        this.c = af2.e.a((Object)e);
        this.d = af2.e.a((Object)l);
        this.e = vg0.a.b((Provider)a.j);
        final Provider a2 = af2.h.a((Provider)jl0.i.a((Provider)a.m));
        this.f = (Provider<d>)a2;
        this.g = a40.g.a((Provider)a.m, a2, (Provider)a.n, (Provider)this.e, (Provider)a.i, (Provider)a.o, (Provider)a.p, (Provider)a.q);
        final Provider b2 = af2.c.b((Provider)new j31.d((Object)iv0.b.b((Provider)af2.e.a((Object)baseScreen)), 1));
        this.h = (Provider<b>)b2;
        this.i = (Provider<hf1.a>)af2.c.b((Provider)new rl0.g((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)a.i, (Provider)this.e, (Provider)a.k, (Provider)a.l, (Provider)this.g, b2, (Provider)a.r, (Provider)a.s, (Provider)a.t, 2));
    }
}
