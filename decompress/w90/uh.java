// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import z70.d;
import ah2.f;
import af2.e;
import z70.b;
import z70.a;
import javax.inject.Provider;

public final class uh implements du
{
    public final kl a;
    public Provider<a> b;
    
    public uh(final kl a, final b b) {
        this.a = a;
        final e a2 = e.a((Object)b);
        final kl.o0 s1 = a.S1;
        final kl$y1 t1 = a.T1;
        final kl$x4 w1 = a.w1;
        f.f((Object)s1, "appConfigSettings");
        f.f((Object)t1, "dateTimeFormatter");
        f.f((Object)w1, "moshi");
        this.b = (Provider<a>)c.b((Provider)new d(a2, s1, t1, w1));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
