// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import sl1.d;
import ah2.f;
import af2.e;
import sl1.b;
import sl1.a;
import javax.inject.Provider;

public final class vo implements du
{
    public final kl a;
    public Provider<a> b;
    
    public vo(final kl a, final b b) {
        this.a = a;
        final e a2 = e.a((Object)b);
        final kl$t1 e2 = a.E2;
        final kl.la z = a.z;
        f.f((Object)e2, "personalizationRepository");
        f.f((Object)z, "resourceProvider");
        this.b = (Provider<a>)c.b((Provider)new d(a2, e2, z));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
