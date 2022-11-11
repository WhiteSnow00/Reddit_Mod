// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import gx.b;
import fx.a;
import javax.inject.Provider;

public final class er implements du
{
    public final kl a;
    public Provider<a> b;
    public Provider<dh0.a> c;
    
    public er(final kl a) {
        this.a = a;
        this.b = (Provider<a>)af2.c.b((Provider)gx.b.a((Provider)a.B, (Provider)a.C, (Provider)a.l, (Provider)a.D, (Provider)a.E, (Provider)a.c));
        this.c = (Provider<dh0.a>)af2.c.b((Provider)new xb0.b((Provider)a.F, 9));
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
