// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.c;
import mg0.x;
import se2.e;
import bi1.b;
import bi1.a;
import javax.inject.Provider;

public final class zn implements yt
{
    public final dl a;
    public Provider<a> b;
    
    public zn(final dl a, final b b) {
        this.a = a;
        this.b = (Provider<a>)c.b((Provider)new q30.e((Provider)e.a((Object)b), (Provider)a.S, (Provider)a.b0, (Provider)a.Q2, (Provider)a.z, (Provider)new x((Provider)a.F, 9), 6));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
