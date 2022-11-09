// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import ah2.f;
import sx.c;
import yk1.b;
import com.reddit.screen.BaseScreen;
import sg0.a;
import javax.inject.Provider;
import af2.e;
import n41.d;

public final class ej implements du
{
    public final kl a;
    public d b;
    public e c;
    public Provider<a> d;
    public Provider<yk1.a> e;
    
    public ej(final kl a, final BaseScreen baseScreen, final b b) {
        this.a = a;
        this.b = n41.d.b(af2.e.a((Object)baseScreen));
        this.c = af2.e.a((Object)b);
        final Provider b2 = af2.c.b((Provider)sx.c.a((Provider)a.F, (Provider)a.R0, (Provider)a.S0, uy.b.c((Provider)a.z, (Provider)a.T0, (Provider)a.L)));
        this.d = (Provider<a>)b2;
        final d b3 = this.b;
        final e c = this.c;
        final kl$sa j = a.J;
        final kl.la z = a.z;
        final kl.k i = a.j;
        final kl.ha h = a.H;
        final db1.b l2 = a.L2;
        final kl$s1 l3 = a.l0;
        final kl$y4 k2 = a.K2;
        final kl.l8 m2 = a.M2;
        f.f((Object)b3, "getContext");
        f.f((Object)c, "view");
        f.f((Object)j, "subredditRepository");
        f.f((Object)z, "resourceProvider");
        f.f((Object)i, "backgroundThread");
        f.f((Object)h, "postExecutionThread");
        f.f((Object)l2, "mutedCommunitiesRepository");
        f.f((Object)l3, "consumerSafetyFeatures");
        f.f((Object)k2, "mutedSubredditsNavigator");
        f.f((Object)m2, "subredditMutingAnalytics");
        this.e = (Provider<yk1.a>)af2.c.b((Provider)new yk1.f((Provider)b3, (Provider)c, j, z, i, h, b2, l2, l3, k2, m2));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
