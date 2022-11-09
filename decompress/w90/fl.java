// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import ah2.f;
import af2.e;
import gl1.b;
import gl1.a;
import javax.inject.Provider;

public final class fl implements du
{
    public final kl a;
    public Provider<a> b;
    
    public fl(final kl a, final b b) {
        this.a = a;
        final e a2 = e.a((Object)b);
        final kl.r2 f2 = a.F2;
        f.f((Object)f2, "experimentsRepository");
        this.b = (Provider<a>)c.b((Provider)new gl1.f(a2, f2));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
