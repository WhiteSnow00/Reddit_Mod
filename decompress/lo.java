// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.c;
import gl1.d;
import se2.e;
import gl1.b;
import gl1.a;
import javax.inject.Provider;

public final class lo implements yt
{
    public final dl a;
    public Provider<a> b;
    
    public lo(final dl a, final b b) {
        this.a = a;
        final e a2 = e.a((Object)b);
        final dl.dl$t1 e2 = a.E2;
        final dl.na z = a.z;
        sg2.e.f((Object)e2, "personalizationRepository");
        sg2.e.f((Object)z, "resourceProvider");
        this.b = (Provider<a>)c.b((Provider)new d(a2, e2, z));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
