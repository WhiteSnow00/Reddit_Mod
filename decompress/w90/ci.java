// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import ah2.f;
import of0.k0;
import wk1.d;
import wk1.c;
import com.reddit.events.blocked.BlockedAccountsAnalytics;
import javax.inject.Provider;
import af2.e;

public final class ci implements du
{
    public final kl a;
    public e b;
    public Provider<BlockedAccountsAnalytics> c;
    public Provider<c> d;
    
    public ci(final kl a, final d d) {
        this.a = a;
        this.b = e.a((Object)d);
        final Provider b = af2.c.b((Provider)k0.b((Provider)a.F));
        this.c = (Provider<BlockedAccountsAnalytics>)b;
        final e b2 = this.b;
        final kl.la z = a.z;
        final kl$z0 n0 = a.n0;
        final kl$s1 l0 = a.l0;
        f.f((Object)b2, "view");
        f.f((Object)z, "resourceProvider");
        f.f((Object)n0, "blockedAccountRepository");
        f.f((Object)l0, "features");
        this.d = (Provider<c>)af2.c.b((Provider)new wk1.f((Provider)b2, z, n0, b, l0));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
