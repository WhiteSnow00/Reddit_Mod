// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import dv1.k;
import af2.e;
import af2.c;
import bt0.g;
import okhttp3.OkHttpClient;
import com.reddit.search.screens.comments.CommentSearchResultsScreen$a;
import com.reddit.screen.BaseScreen;
import ge0.i0;
import yi0.r0;
import cx.b;
import p70.a;
import javax.inject.Provider;

public final class dj implements du
{
    public final kl a;
    public Provider<a> b;
    public b c;
    public Provider<rv1.a> d;
    public Provider<r0> e;
    public Provider<i0> f;
    
    public dj(final kl a, final BaseScreen baseScreen, final CommentSearchResultsScreen$a commentSearchResultsScreen$a) {
        this.a = a;
        this.b = (Provider<a>)af2.c.b((Provider)d60.g.a((Provider)a.w1, (Provider)e60.b.a((Provider<OkHttpClient>)a.h, (Provider<g>)a.i, (Provider<r20.a>)a.j), a.y1, (Provider)a.t0, (Provider)a.x0, (Provider)a.x2, (Provider)a.R0));
        this.c = cx.b.b((Provider)a.t0, (Provider)a.R0, (Provider)a.x, (Provider)a.M, (Provider)a.y2);
        this.d = (Provider<rv1.a>)af2.c.b((Provider)new k((Provider)this.c, (Provider)a.t0, (Provider)ww0.c.a((Provider)af2.e.a((Object)baseScreen)), 1));
        this.e = (Provider<r0>)af2.c.b((Provider)new hg0.c((Provider)a.F, (Provider)a.R0, 3));
        this.f = (Provider<i0>)af2.c.b((Provider)this.c);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
