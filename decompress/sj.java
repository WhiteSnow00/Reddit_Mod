// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import db0.t;
import ix1.j;
import ix1.m;
import ix1.d;
import kz0.k;
import sn1.g;
import hx.a;
import iv0.b;
import af2.e;
import un1.b$a;
import un1.c;
import o72.h;
import javax.inject.Provider;
import com.reddit.screen.BaseScreen;

public final class sj implements du
{
    public final BaseScreen a;
    public final kl b;
    public Provider<h> c;
    
    public sj(final kl b, final BaseScreen a, final c c, final b$a b$a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<h>)af2.c.b((Provider)hx.a.c((Provider)iv0.b.b((Provider)e.a((Object)a)), (Provider)b.o, (Provider)b.S2, (Provider)b.e));
    }
    
    public final g a() {
        final zg2.a c = iv0.b.c(this.a);
        final rc0.d i = ((e0)this.b.a).i();
        k.N((Object)i);
        final ot1.d b8 = ((e0)this.b.a).B8();
        k.N((Object)b8);
        final zg2.a c2 = iv0.b.c(this.a);
        final j j = kl.I(this.b);
        final q20.b k4 = ((e0)this.b.a).k4();
        k.N((Object)k4);
        final d d = new d();
        final t p = ((e0)this.b.a).P();
        k.N((Object)p);
        final e80.d x8 = ((e0)this.b.a).x8();
        k.N((Object)x8);
        final m m = new m(c2, j, k4, d, p, x8, new mx1.a());
        final q20.b k5 = ((e0)this.b.a).k4();
        k.N((Object)k5);
        final dx0.d p2 = ((e0)this.b.a).p7();
        k.N((Object)p2);
        return new g(c, i, (zd0.a)b8, m, k5, (ow0.c)p2);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
