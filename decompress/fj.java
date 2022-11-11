// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import ah2.f;
import of0.k0;
import zk1.a;
import com.reddit.screen.BaseScreen;
import n41.d;
import ch0.b;
import javax.inject.Provider;
import e40.k;
import d00.c;
import af2.e;

public final class fj implements du
{
    public final kl a;
    public e b;
    public e c;
    public c d;
    public k e;
    public Provider<b> f;
    public e g;
    public d h;
    public iv0.b i;
    public Provider<ll1.b> j;
    public Provider<zk1.b> k;
    
    public fj(final kl a, final BaseScreen baseScreen, final zk1.c c, final a a2) {
        this.a = a;
        this.b = af2.e.a((Object)c);
        this.c = af2.e.a((Object)a2);
        this.d = d00.c.b((Provider)a.J, (Provider)a.z);
        this.e = e40.k.a((Provider)a.J, (Provider)a.z, (Provider)a.o);
        this.f = (Provider<b>)af2.c.b((Provider)new k0((Provider)a.F, 5));
        final e a3 = af2.e.a((Object)baseScreen);
        this.g = a3;
        this.h = n41.d.b(a3);
        this.i = iv0.b.a((Provider)sa1.b.a((Provider)this.g));
        final Provider b = af2.c.b((Provider)ll1.a.a((Provider)this.h, (Provider)this.g, a.P, (Provider)this.i, ht.b.a(a.e), a.z));
        this.j = (Provider<ll1.b>)b;
        final e b2 = this.b;
        final e c2 = this.c;
        final kl$sa j = a.J;
        final c d = this.d;
        final k e = this.e;
        final kl.la z = a.z;
        final Provider<b> f = this.f;
        final kl.na p4 = a.P;
        final kl$t o = a.o;
        ah2.f.f((Object)b2, "view");
        ah2.f.f((Object)c2, "params");
        ah2.f.f((Object)j, "subredditRepository");
        ah2.f.f((Object)d, "getSubredditSettingsUseCase");
        ah2.f.f((Object)e, "updateSubredditSettingsUseCase");
        ah2.f.f((Object)z, "resourceProvider");
        ah2.f.f((Object)f, "analytics");
        ah2.f.f((Object)p4, "screenNavigator");
        ah2.f.f((Object)o, "dispatcherProvider");
        this.k = (Provider<zk1.b>)af2.c.b((Provider)new zk1.e((Provider)b2, (Provider)c2, j, (Provider)d, (Provider)e, z, (Provider)f, b, p4, o));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
