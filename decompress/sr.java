// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import vl1.d;
import ah2.f;
import af2.e;
import vl1.b;
import vl1.a;
import javax.inject.Provider;

public final class sr implements du
{
    public final kl a;
    public Provider<a> b;
    
    public sr(final kl a, final b b) {
        this.a = a;
        final e a2 = e.a((Object)b);
        final qb0.b b2 = new qb0.b((Provider)a.F, 8);
        final kl.c0 b3 = a.b2;
        final kl$z4 g2 = a.g2;
        final kl.qa u0 = a.u0;
        final kl.la z = a.z;
        final kl.ha h = a.H;
        f.f((Object)b3, "myAccountSettingsRepository");
        f.f((Object)g2, "myAccountRepository");
        f.f((Object)u0, "sessionManager");
        f.f((Object)z, "resourceProvider");
        f.f((Object)h, "postExecutionThread");
        this.b = (Provider<a>)c.b((Provider)new d((Provider)a2, b3, g2, u0, b2, z, h));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
