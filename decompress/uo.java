// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import d00.f;
import vx.d;
import af2.e;
import af2.c;
import okhttp3.OkHttpClient;
import com.reddit.search.screens.people.PeopleSearchResultsScreen$a;
import com.reddit.screen.BaseScreen;
import ge0.i0;
import n42.g;
import yi0.r0;
import iv0.b;
import p70.a;
import javax.inject.Provider;

public final class uo implements du
{
    public final kl a;
    public Provider<a> b;
    public b c;
    public Provider<o20.a> d;
    public Provider<r0> e;
    public Provider<g> f;
    public Provider<a20.b> g;
    public Provider<i0> h;
    
    public uo(final kl a, final BaseScreen baseScreen, final PeopleSearchResultsScreen$a peopleSearchResultsScreen$a) {
        this.a = a;
        this.b = (Provider<a>)af2.c.b((Provider)d60.g.a((Provider)a.w1, (Provider)e60.b.a((Provider<OkHttpClient>)a.h, (Provider<bt0.g>)a.i, (Provider<r20.a>)a.j), a.y1, (Provider)a.t0, (Provider)a.x0, (Provider)a.x2, (Provider)a.R0));
        final b b = iv0.b.b((Provider)af2.e.a((Object)baseScreen));
        this.c = b;
        this.d = (Provider<o20.a>)af2.c.b((Provider)vx.d.b((Provider)b, (Provider)a.N, (Provider)a.P));
        this.e = (Provider<r0>)af2.c.b((Provider)new hg0.c((Provider)a.F, (Provider)a.R0, 3));
        this.f = (Provider<g>)af2.c.b((Provider)ei1.a.b((Provider)this.c));
        this.g = (Provider<a20.b>)af2.c.b((Provider)new f((Provider)a.z, (Provider)a.z2, 1));
        this.h = (Provider<i0>)af2.c.b((Provider)cx.b.b((Provider)a.t0, (Provider)a.R0, (Provider)a.x, (Provider)a.M, (Provider)a.y2));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
