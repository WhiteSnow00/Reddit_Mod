// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import nk1.c;
import com.reddit.screen.BaseScreen;
import vh1.a;
import yr0.d;
import javax.inject.Provider;
import qy.b;
import uw.f;
import se2.e;

public final class zi implements yt
{
    public final dl a;
    public e b;
    public e c;
    public f d;
    public b e;
    public Provider<sg0.b> f;
    public e g;
    public d h;
    public a i;
    public Provider<zk1.b> j;
    public Provider<nk1.b> k;
    
    public zi(final dl a, final BaseScreen baseScreen, final c c, final nk1.a a2) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = se2.e.a((Object)a2);
        this.d = uw.f.b((Provider)a.J, (Provider)a.z);
        this.e = qy.b.c((Provider)a.J, (Provider)a.z, (Provider)a.o);
        this.f = (Provider<sg0.b>)se2.c.b((Provider)new wb0.a((Provider)a.F, 10));
        final e a3 = se2.e.a((Object)baseScreen);
        this.g = a3;
        this.h = yr0.d.a(a3);
        this.i = vh1.a.a((Provider)uv0.b.e((Provider)this.g));
        final Provider b = se2.c.b((Provider)zk1.a.a((Provider)this.h, (Provider)this.g, a.S, (Provider)this.i, dt.b.b(a.e), a.z));
        this.j = (Provider<zk1.b>)b;
        final e b2 = this.b;
        final e c2 = this.c;
        final dl.dl$ua j = a.J;
        final f d = this.d;
        final b e = this.e;
        final dl.na z = a.z;
        final Provider<sg0.b> f = this.f;
        final dl.pa s = a.S;
        final dl.dl$t o = a.o;
        sg2.e.f((Object)b2, "view");
        sg2.e.f((Object)c2, "params");
        sg2.e.f((Object)j, "subredditRepository");
        sg2.e.f((Object)d, "getSubredditSettingsUseCase");
        sg2.e.f((Object)e, "updateSubredditSettingsUseCase");
        sg2.e.f((Object)z, "resourceProvider");
        sg2.e.f((Object)f, "analytics");
        sg2.e.f((Object)s, "screenNavigator");
        sg2.e.f((Object)o, "dispatcherProvider");
        this.k = (Provider<nk1.b>)se2.c.b((Provider)new nk1.e((Provider)b2, (Provider)c2, j, (Provider)d, (Provider)e, z, (Provider)f, b, s, o));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
