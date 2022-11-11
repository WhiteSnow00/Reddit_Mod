// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.e;
import w50.g;
import com.reddit.search.screens.people.PeopleSearchResultsScreen$a;
import com.reddit.screen.BaseScreen;
import xd0.a0;
import w10.b;
import f42.f;
import oi0.r0;
import cz0.c;
import h70.a;
import javax.inject.Provider;

public final class ko implements yt
{
    public final dl a;
    public Provider<a> b;
    public c c;
    public Provider<k20.a> d;
    public Provider<r0> e;
    public Provider<f> f;
    public Provider<b> g;
    public Provider<a0> h;
    
    public ko(final dl a, final BaseScreen baseScreen, final PeopleSearchResultsScreen$a peopleSearchResultsScreen$a) {
        this.a = a;
        this.b = (Provider<a>)se2.c.b((Provider)w50.g.a((Provider)a.x1, (Provider)x50.b.a((Provider)a.h, (Provider)a.i, (Provider)a.j), a.z1, (Provider)a.t0, (Provider)a.x0, (Provider)a.x2, (Provider)a.S0));
        final c b = cz0.c.b((Provider)se2.e.a((Object)baseScreen));
        this.c = b;
        this.d = (Provider<k20.a>)se2.c.b((Provider)vy.e.a((Provider)b, (Provider)a.N, (Provider)a.S));
        this.e = (Provider<r0>)se2.c.b((Provider)new ix.b((Provider)a.F, (Provider)a.S0, 17));
        this.f = (Provider<f>)se2.c.b((Provider)uv0.b.c((Provider)this.c));
        this.g = (Provider<b>)se2.c.b((Provider)new rx.b((Provider)a.z, (Provider)a.z2, 2));
        this.h = (Provider<a0>)se2.c.b((Provider)u30.g.a((Provider)a.t0, (Provider)a.S0, (Provider)a.x, (Provider)a.M, (Provider)a.y2));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
