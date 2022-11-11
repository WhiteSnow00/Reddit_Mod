// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import ox.c;
import se2.e;
import xk1.b;
import xk1.a;
import javax.inject.Provider;

public final class zm implements yt
{
    public final dl a;
    public Provider<a> b;
    
    public zm(final dl a, final b b) {
        this.a = a;
        final e a2 = e.a((Object)b);
        final dl.q c = a.c;
        final dl.dl$x4 x1 = a.x1;
        final dl.na z = a.z;
        final c c2 = new c((Provider)c, (Provider)x1, (Provider)z, (Provider)a.o, 6);
        final dl.pa s = a.S;
        sg2.e.f((Object)z, "resourceProvider");
        sg2.e.f((Object)s, "navigator");
        this.b = (Provider<a>)se2.c.b((Provider)new xk1.e((Provider)a2, z, c2, s));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
