// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import af2.c;
import ov1.g$a;
import ov1.b;
import javax.inject.Provider;

public final class tq implements du
{
    public final kl a;
    public Provider<b> b;
    
    public tq(final kl a) {
        this.a = a;
        this.b = (Provider<b>)c.b((Provider)g$a.a);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
