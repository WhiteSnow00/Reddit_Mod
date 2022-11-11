// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import af2.e;
import cd1.a;
import javax.inject.Provider;
import h1.b;
import mj2.b0;

public final class pn implements du
{
    public final b0 a;
    public final b b;
    public final kl c;
    public Provider<a> d;
    
    public pn(final kl c, final b0 a, final b b, final bd1.a a2, final zg2.a a3) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = (Provider<a>)af2.c.b((Provider)new zy.e((Provider)e.a((Object)a3), (Provider)c.P, (Provider)c.N, 26));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
