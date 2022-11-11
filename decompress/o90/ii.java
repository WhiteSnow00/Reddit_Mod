// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.c;
import se2.e;
import lk1.b;
import lk1.a;
import javax.inject.Provider;

public final class ii implements yt
{
    public final dl a;
    public Provider<a> b;
    
    public ii(final dl a, final b b) {
        this.a = a;
        final e a2 = e.a((Object)b);
        final dl.na z = a.z;
        final dl.la t0 = a.t0;
        final dl.dl$g1 j2 = a.J2;
        final dl.k i = a.j;
        final dl.ja h = a.H;
        sg2.e.f((Object)z, "resourceProvider");
        sg2.e.f((Object)t0, "preferenceRepository");
        sg2.e.f((Object)j2, "chatSettingsRepository");
        sg2.e.f((Object)i, "backgroundThread");
        sg2.e.f((Object)h, "postExecutionThread");
        this.b = (Provider<a>)c.b((Provider)new lk1.e(a2, z, t0, j2, i, h));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
