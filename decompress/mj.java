// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import q90.e0;
import java.util.Map;
import va0.s;
import ax1.j;
import ax1.m;
import ex1.a;
import ax1.d;
import n10.b;
import se2.e;
import in1.b$a;
import in1.c;
import f72.h;
import javax.inject.Provider;
import com.reddit.screen.BaseScreen;

public final class mj implements yt
{
    public final BaseScreen a;
    public final dl b;
    public Provider<h> c;
    
    public mj(final dl b, final BaseScreen a, final c c, final b$a b$a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<h>)se2.c.b((Provider)n10.b.b((Provider)cz0.c.b((Provider)e.a((Object)a)), (Provider)b.o, (Provider)b.S2, (Provider)b.e));
    }
    
    public final gn1.h a() {
        final rg2.a c = cz0.c.c(this.a);
        final ic0.d i = ((e0)this.b.a).i();
        ui.b.n((Object)i);
        final et1.c z8 = ((e0)this.b.a).z8();
        ui.b.n((Object)z8);
        final rg2.a c2 = cz0.c.c(this.a);
        final j k = dl.K(this.b);
        final m20.b i2 = ((e0)this.b.a).i4();
        ui.b.n((Object)i2);
        final d d = new d();
        final s p = ((e0)this.b.a).P();
        ui.b.n((Object)p);
        final w70.d v8 = ((e0)this.b.a).v8();
        ui.b.n((Object)v8);
        final m m = new m(c2, k, i2, d, p, v8, new a());
        final m20.b i3 = ((e0)this.b.a).i4();
        ui.b.n((Object)i3);
        final ww0.d o7 = ((e0)this.b.a).o7();
        ui.b.n((Object)o7);
        return new gn1.h(c, i, (qd0.a)z8, m, i3, (hw0.c)o7);
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
