// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.c;
import se2.e;
import uk1.b;
import uk1.a;
import javax.inject.Provider;

public final class zk implements yt
{
    public final dl a;
    public Provider<a> b;
    
    public zk(final dl a, final b b) {
        this.a = a;
        final e a2 = e.a((Object)b);
        final dl.r2 f2 = a.F2;
        sg2.e.f((Object)f2, "experimentsRepository");
        this.b = (Provider<a>)c.b((Provider)new uk1.e(a2, f2));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
